package com.df.transmission.config;

import org.mule.api.annotations.components.ConnectionManagement;
import org.mule.api.annotations.display.Password;
import org.mule.api.ConnectionException;
import org.mule.api.ConnectionExceptionCode;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.Connect;
import org.mule.api.annotations.ConnectionIdentifier;
import org.mule.api.annotations.Disconnect;
import org.mule.api.annotations.TestConnectivity;
import org.mule.api.annotations.ValidateConnection;
import org.mule.api.annotations.param.ConnectionKey;
import org.mule.api.annotations.param.Default;

import com.df.transmission.restjerseyconnector.client.TorrentClient;


@ConnectionManagement(friendlyName = "Configuration")
public class ConnectorConfig {
	public enum Protocol {
	    HTTP, HTTPS
	}
	private TorrentClient client;

	private String sessionId;
	
	@Configurable
	@Default("HTTP")
	private Protocol protocol;
	
	@Configurable
	@Default("localhost")
	private String host;
	
	@Configurable
	@Default("9091")
	private Integer port;

	public TorrentClient getClient() {
		return client;
	}

	public void setClient(TorrentClient client) {
		this.client = client;
	}

	public String getApiSession() {
		return sessionId;
	}

	public void setApiSession(String apiSession) {
		this.sessionId = apiSession;
	}

	public Protocol getProtocol() {
		return protocol;
	}

	public void setProtocol(Protocol protocol) {
		this.protocol = protocol;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	@Connect
	@TestConnectivity
	public void connect(@ConnectionKey @Default(value = "transmission") String username,@Password @Default(value = "transmission") String password) throws ConnectionException {
		setClient(new TorrentClient(this));
		try {
			getClient().login(username,password);
		} catch (Exception e) {
			throw new ConnectionException(ConnectionExceptionCode.INCORRECT_CREDENTIALS, e.getMessage(),
					"Invalid credentials");
		}
	}

	@Disconnect
	public void disconnect() {
		setClient(null);
	}

	@ValidateConnection
	public boolean isConnected() {
		return getClient() != null;
	}

	@ConnectionIdentifier
	public String connectionId() {
		return "001";
	}

}