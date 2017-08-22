package com.df.transmission.data;

public enum TorrentStatus {
	TR_STATUS_STOPPED(0), /* Torrent is stopped */
	TR_STATUS_CHECK_WAIT(1), /* Queued to check files */
	TR_STATUS_CHECK(2), /* Checking files */
	TR_STATUS_DOWNLOAD_WAIT(3), /* Queued to download */
	TR_STATUS_DOWNLOAD(4), /* Downloading */
	TR_STATUS_SEED_WAIT(5), /* Queued to seed */
	TR_STATUS_SEED(6); /* Seeding */
	
	private int value;

	private TorrentStatus(int value) {
		this.value = value;
	}
	
	public static TorrentStatus fromId(int id) {
        for (TorrentStatus type :TorrentStatus.values()) {
            if (type.value == id) {
                return type;
            }
        }
        return null;
    }
	@Override
	public String toString() {
		 switch(this) {
		 	case TR_STATUS_STOPPED: return "Stopped";
		 	case TR_STATUS_CHECK_WAIT: return "Queued to check";
		 	case TR_STATUS_CHECK: return "Checking";
		 	case TR_STATUS_DOWNLOAD_WAIT: return "Queued to download";
		 	case TR_STATUS_DOWNLOAD: return "Downloading";
		 	case TR_STATUS_SEED_WAIT: return "Queued to seed";
		 	case TR_STATUS_SEED: return "Seeding";
	    	default: throw new IllegalArgumentException();
	    }
	}
};