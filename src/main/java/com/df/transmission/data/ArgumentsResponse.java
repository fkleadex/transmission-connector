package com.df.transmission.data;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class ArgumentsResponse implements Serializable {

	private static final long serialVersionUID = -2972643438857355105L;

	@JsonProperty("torrents")
    private List<Torrent> torrents = null;
	
    @JsonProperty("torrents")
    public List<Torrent> getTorrents() {
        return torrents;
    }

    @JsonProperty("torrents")
    public void setTorrents(List<Torrent> torrents) {
        this.torrents = torrents;
    }
}
