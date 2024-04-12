package com.df.transmission;

import org.mule.api.DefaultMuleException;
import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.ReconnectOn;
import org.mule.api.annotations.param.Optional;

import com.df.transmission.config.ConnectorConfig;
import com.df.transmission.data.Fields;
import com.df.transmission.data.ResponseGetSession;
import com.df.transmission.data.ResponseGetTorrents;
import com.df.transmission.restjerseyconnector.exceptions.TorrentException;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.UniformInterfaceException;

import org.apache.log4j.Logger;

@Connector(name="transmission", friendlyName="Transmission")
public class TransmissionConnector {
	static Logger log = Logger.getLogger(TransmissionConnector.class.getName());
    @Config
    ConnectorConfig config;

    /**
     * Custom processor
     *
     * @param friend Name to be used to generate a greeting message.
     * @return A greeting message
     * @throws UniformInterfaceException 
     * @throws ClientHandlerException 
     * @throws DefaultMuleException 
     * @throws TorrentException 
     */
    @Processor
    @ReconnectOn(exceptions = {TorrentException.class})
    public ResponseGetSession getSession() throws DefaultMuleException, ClientHandlerException, UniformInterfaceException, TorrentException {
        return config.getClient().getSession();
    }

    @Processor
    @ReconnectOn(exceptions = {TorrentException.class})
    public ResponseGetTorrents getTorrents(Fields arguments,@Optional String ids) throws DefaultMuleException, ClientHandlerException, UniformInterfaceException, TorrentException {
        return config.getClient().getTorrents(arguments,ids);
    }
    
    @Processor
    @ReconnectOn(exceptions = {TorrentException.class})
    public ResponseGetTorrents stopTorrents(String ids) throws DefaultMuleException, ClientHandlerException, UniformInterfaceException, TorrentException {
        return config.getClient().stopTorrents(ids);
    }
    
    @Processor
    @ReconnectOn(exceptions = {TorrentException.class})
    public ResponseGetTorrents removeTorrent(String ids, Boolean deleteData) throws DefaultMuleException, ClientHandlerException, UniformInterfaceException, TorrentException {
        return config.getClient().removeTorrents(ids, deleteData);
    }
    
    @Processor
    @ReconnectOn(exceptions = {TorrentException.class})
    public ResponseGetTorrents startTorrent(String ids) throws DefaultMuleException, ClientHandlerException, UniformInterfaceException, TorrentException {
        return config.getClient().startTorrents(ids);
    }
    
    @Processor
    @ReconnectOn(exceptions = {TorrentException.class})
    public ResponseGetTorrents startNowTorrent(String ids) throws DefaultMuleException, ClientHandlerException, UniformInterfaceException, TorrentException {
        return config.getClient().startNowTorrents(ids);
    }
    
    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}