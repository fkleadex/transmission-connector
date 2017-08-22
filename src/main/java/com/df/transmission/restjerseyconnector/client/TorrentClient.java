package com.df.transmission.restjerseyconnector.client;

import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.mule.api.DefaultMuleException;

import com.df.transmission.config.ConnectorConfig;
import com.df.transmission.data.Arguments;
import com.df.transmission.data.Fields;
import com.df.transmission.data.Request;
import com.df.transmission.data.Response;
import com.df.transmission.data.ResponseGetSession;
import com.df.transmission.data.ResponseGetTorrents;
import com.df.transmission.restjerseyconnector.exceptions.TorrentException;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.api.json.JSONConfiguration;

public class TorrentClient {
	private Client client; /* a Jersey client instance */
	  private WebResource apiResource;
	  private ConnectorConfig config;
	  static Logger log = Logger.getLogger(TorrentClient.class.getName());
	  
	  public TorrentClient(ConnectorConfig config) {
		    setConfig(config);
		    ClientConfig clientConfig = new DefaultClientConfig();

		    /* Enable support for JSON to POJO entity mapping in Jersey */
		    clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		    clientConfig.getProperties().put(ClientConfig.PROPERTY_FOLLOW_REDIRECTS, Boolean.FALSE);
		    this.client = Client.create(clientConfig);
		    this.client.addFilter(new LoggingFilter(System.out));
		    this.apiResource = this.client.resource(config.getProtocol()+"://"+config.getHost()+":"+config.getPort()+"/transmission/rpc");
	  }
	  
	  public void login(String username,String password) throws DefaultMuleException, TorrentException{
		  Request request=new Request();
		  request.setMethod("session-get");
		  ClientResponse clientResponse = getApiResource().accept("*/*").type(MediaType.APPLICATION_JSON).post(ClientResponse.class, request);
		  if (clientResponse.getStatus() == 200 || clientResponse.getStatus() == 302) {
			  log.debug("Login is correct");
		  }else if(clientResponse.getStatus() == 409) {
			  getConfig().setApiSession(clientResponse.getHeaders().get("X-Transmission-Session-Id").get(0));
			  log.debug("Save session_Id");
		  }
		  else {
	            throw new org.mule.api.DefaultMuleException(
	  	              String.format("ERROR - statusCode: %d - message: %s",
	  	                clientResponse.getStatus(), clientResponse.getEntity(String.class)));
	  	  }
	  }
	  
	    public ResponseGetTorrents getTorrents(Fields fields,String ids) throws DefaultMuleException, ClientHandlerException, UniformInterfaceException {
	        WebResource webResource = getApiResource();
	        Request request=new Request();
			request.setMethod("torrent-get");
			Arguments arguments=new Arguments();
			arguments.setFields(fields);		
			arguments.setIds(ids);
			request.setArguments(arguments);
	        return execute(webResource, "POST", ResponseGetTorrents.class,request);
	    }
	    
	    public ResponseGetSession getSession() throws DefaultMuleException, ClientHandlerException, UniformInterfaceException {
	        WebResource webResource = getApiResource();
	        Request request=new Request();
			request.setMethod("session-get");
	        return execute(webResource, "POST", ResponseGetSession.class,request);
	    }
	    
	    public String stopTorrents(String ids) throws DefaultMuleException, ClientHandlerException, UniformInterfaceException {
	    	WebResource webResource = getApiResource();
	        Request request=new Request();
			request.setMethod("torrent-stop");
			Arguments arguments=new Arguments();
			arguments.setIds(ids);
			request.setArguments(arguments);
	        return execute(webResource, "POST", String.class,request);
	    }
	    
	    private <T> T execute(WebResource webResource, String method, Class<T> returnClass) throws DefaultMuleException, ClientHandlerException, UniformInterfaceException{
	        return execute(webResource, method, returnClass,null);
	    }
	    /**
	     * Executes the request
	     * @throws UniformInterfaceException 
	     * @throws ClientHandlerException 
	     * @throws DefaultMuleException 
	     *
	     */
	    private <T> T execute(WebResource webResource, String method, Class<T> returnClass,Object requestEntity) throws DefaultMuleException, ClientHandlerException, UniformInterfaceException{
	    	Builder request = webResource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).header("X-Transmission-Session-Id", getConfig().getApiSession());
	    	ClientResponse clientResponse = request.method(method, ClientResponse.class,requestEntity);
	        if(clientResponse.getStatus() == 200) {
	            return clientResponse.getEntity(returnClass);
	        } else if (clientResponse.getStatus() == 401) {
	            throw new org.mule.api.DefaultMuleException("The access token has expired; " + clientResponse.getEntity(String.class));
	        } else if (clientResponse.getStatus() == 404){
	        	return null;
	        } else {
	            throw new org.mule.api.DefaultMuleException(
	              String.format("ERROR - statusCode: %d - message: %s",
	                clientResponse.getStatus(), clientResponse.getEntity(String.class)));
	        }
	    }
	    
	    public Client getClient() {
	        return client;
	    }

	    public void setClient(Client client) {
	        this.client = client;
	    }

	    public WebResource getApiResource() {
	        return apiResource;
	    }

	    public void setApiResource(WebResource apiResource) {
	        this.apiResource = apiResource;
	    }


		public ConnectorConfig getConfig() {
			return config;
		}


		public void setConfig(ConnectorConfig config) {
			this.config = config;
		}
	    
}
