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
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
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
		  getApiResource().addFilter(new HTTPBasicAuthFilter(username, password));
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
	  
	    public ResponseGetTorrents getTorrents(Fields fields,String ids) throws DefaultMuleException, ClientHandlerException, UniformInterfaceException, TorrentException {
	        WebResource webResource = getApiResource();
	        Request request=new Request();
			request.setMethod("torrent-get");
			Arguments arguments=new Arguments();
			arguments.setFields(fields);		
			arguments.setIds(ids);
			request.setArguments(arguments);
	        return execute(webResource, "POST", ResponseGetTorrents.class,request);
	    }
	    
	    public ResponseGetSession getSession() throws DefaultMuleException, ClientHandlerException, UniformInterfaceException, TorrentException {
	        WebResource webResource = getApiResource();
	        Request request=new Request();
			request.setMethod("session-get");
	        return execute(webResource, "POST", ResponseGetSession.class,request);
	    }
	    
	    public ResponseGetTorrents actionRequest(String method, String ids) throws DefaultMuleException, ClientHandlerException, UniformInterfaceException, TorrentException {
	    	WebResource webResource = getApiResource();
	        Request request=new Request();
			request.setMethod(method);
			Arguments arguments=new Arguments();
			arguments.setIds(ids);
			request.setArguments(arguments);
	        return execute(webResource, "POST", ResponseGetTorrents.class,request);
	    }
	    
	    public ResponseGetTorrents removeTorrents(String ids, Boolean deleteData) throws DefaultMuleException, ClientHandlerException, UniformInterfaceException, TorrentException {
	    	WebResource webResource = getApiResource();
	        Request request=new Request();
			request.setMethod("torrent-remove");
			Arguments arguments=new Arguments();
			arguments.setIds(ids);
			arguments.setDeleteLocalData(deleteData);
			request.setArguments(arguments);
	        return execute(webResource, "POST", ResponseGetTorrents.class,request);
	    }
	    
	    public ResponseGetTorrents stopTorrents(String ids) throws DefaultMuleException, ClientHandlerException, UniformInterfaceException, TorrentException {
	        return actionRequest("torrent-stop", ids);
	    }
	    
	    public ResponseGetTorrents startTorrents(String ids) throws DefaultMuleException, ClientHandlerException, UniformInterfaceException, TorrentException {
			return actionRequest("torrent-stop", ids);
	    }
	    
	    public ResponseGetTorrents startNowTorrents(String ids) throws DefaultMuleException, ClientHandlerException, UniformInterfaceException, TorrentException {
			return actionRequest("torrent-start-now", ids);
	    }
	    
	    /**
	     * Executes the request
	     * @throws UniformInterfaceException 
	     * @throws ClientHandlerException 
	     * @throws DefaultMuleException 
	     * @throws TorrentException 
	     *
	     */
	    private <T> T execute(WebResource webResource, String method, Class<T> returnClass,Object requestEntity) throws DefaultMuleException, ClientHandlerException, UniformInterfaceException, TorrentException{
	    	Builder request = webResource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).header("X-Transmission-Session-Id", getConfig().getApiSession());
	    	ClientResponse clientResponse = request.method(method, ClientResponse.class,requestEntity);
	        if(clientResponse.getStatus() == 200) {
	            return clientResponse.getEntity(returnClass);
	        } else if (clientResponse.getStatus() == 401) {
	            throw new org.mule.api.DefaultMuleException("The access token has expired; " + clientResponse.getEntity(String.class));
	        } else if (clientResponse.getStatus() == 404){
	        	return null;
	        } else if (clientResponse.getStatus() == 409) {
	        	throw new TorrentException();
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
