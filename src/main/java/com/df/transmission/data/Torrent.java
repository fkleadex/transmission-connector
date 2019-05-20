package com.df.transmission.data;

import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "activityDate",
    "addedDate",
    "bandwidthPriority",
    "comment",
    "corruptEver",
    "creator",
    "dateCreated",
    "desiredAvailable",
    "doneDate",
    "downloadDir",
    "downloadLimit",
    "downloadLimited",
    "downloadedEver",
    "error",
    "errorString",
    "eta",
    "etaIdle",
    "fileStats",
    "files",
    "hashString",
    "haveUnchecked",
    "haveValid",
    "honorsSessionLimits",
    "id",
    "isFinished",
    "isPrivate",
    "isStalled",
    "leftUntilDone",
    "magnetLink",
    "manualAnnounceTime",
    "maxConnectedPeers",
    "metadataPercentComplete",
    "name",
    "peer-limit",
    "peers",
    "peersConnected",
    "peersFrom",
    "peersGettingFromUs",
    "peersSendingToUs",
    "percentDone",
    "pieceCount",
    "pieceSize",
    "pieces",
    "priorities",
    "queuePosition",
    "rateDownload",
    "rateUpload",
    "recheckProgress",
    "secondsDownloading",
    "secondsSeeding",
    "seedIdleLimit",
    "seedIdleMode",
    "seedRatioLimit",
    "status",
    "startDate",
    "torrentFile",
    "totalSize",
    "trackerStats",
    "trackers",
    "uploadLimit",
    "uploadLimited",
    "uploadRatio",
    "uploadedEver",
    "wanted",
    "webseeds",
    "webseedsSendingToUs"    
})
public class Torrent {

    @JsonProperty("activityDate")
    private Date activityDate;
    @JsonProperty("addedDate")
    private Date addedDate;
    @JsonProperty("bandwidthPriority")
    private Integer bandwidthPriority;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("corruptEver")
    private Integer corruptEver;
    @JsonProperty("creator")
    private String creator;
    @JsonProperty("dateCreated")
    private Date dateCreated;
    @JsonProperty("desiredAvailable")
    private Integer desiredAvailable;
    @JsonProperty("doneDate")
    private Date doneDate;
    @JsonProperty("downloadDir")
    private String downloadDir;
    @JsonProperty("downloadLimit")
    private Integer downloadLimit;
    @JsonProperty("downloadLimited")
    private Boolean downloadLimited;
    @JsonProperty("downloadedEver")
    private Integer downloadedEver;
    @JsonProperty("error")
    private Integer error;
    @JsonProperty("errorString")
    private String errorString;
    @JsonProperty("eta")
    private Integer eta;
    @JsonProperty("etaIdle")
    private Integer etaIdle;
    @JsonProperty("fileStats")
    private List<FileStat> fileStats = null;
    @JsonProperty("files")
    private List<File> files = null;
    @JsonProperty("hashString")
    private String hashString;
    @JsonProperty("haveUnchecked")
    private Integer haveUnchecked;
    @JsonProperty("haveValid")
    private Integer haveValid;
    @JsonProperty("honorsSessionLimits")
    private Boolean honorsSessionLimits;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("isFinished")
    private Boolean isFinished;
    @JsonProperty("isPrivate")
    private Boolean isPrivate;
    @JsonProperty("isStalled")
    private Boolean isStalled;
    @JsonProperty("leftUntilDone")
    private Integer leftUntilDone;
    @JsonProperty("magnetLink")
    private String magnetLink;
    @JsonProperty("manualAnnounceTime")
    private Integer manualAnnounceTime;
    @JsonProperty("maxConnectedPeers")
    private Integer maxConnectedPeers;
    @JsonProperty("metadataPercentComplete")
    private Integer metadataPercentComplete;
    @JsonProperty("name")
    private String name;
    @JsonProperty("peer-limit")
    private Integer peerLimit;
    @JsonProperty("peers")
    private List<Object> peers = null;
    @JsonProperty("peersConnected")
    private Integer peersConnected;
    @JsonProperty("peersFrom")
    private PeersFrom peersFrom;
    @JsonProperty("peersGettingFromUs")
    private Integer peersGettingFromUs;
    @JsonProperty("peersSendingToUs")
    private Integer peersSendingToUs;
    @JsonProperty("percentDone")
    private Integer percentDone;
    @JsonProperty("pieceCount")
    private Integer pieceCount;
    @JsonProperty("pieceSize")
    private Integer pieceSize;
    @JsonProperty("pieces")
    private String pieces;
    @JsonProperty("priorities")
    private List<Integer> priorities = null;
    @JsonProperty("queuePosition")
    private Integer queuePosition;
    @JsonProperty("rateDownload")
    private Integer rateDownload;
    @JsonProperty("rateUpload")
    private Integer rateUpload;
    @JsonProperty("recheckProgress")
    private Integer recheckProgress;
    @JsonProperty("secondsDownloading")
    private Integer secondsDownloading;
    @JsonProperty("secondsSeeding")
    private Integer secondsSeeding;
    @JsonProperty("seedIdleLimit")
    private Integer seedIdleLimit;
    @JsonProperty("seedIdleMode")
    private Integer seedIdleMode;
    @JsonProperty("seedRatioLimit")
    private Integer seedRatioLimit;
    @JsonProperty("status")
    private TorrentStatus status;
    @JsonProperty("startDate")
    private Date startDate;
    @JsonProperty("torrentFile")
    private String torrentFile;
    @JsonProperty("totalSize")
    private Long totalSize;
    @JsonProperty("trackerStats")
    private List<TrackerStat> trackerStats = null;
    @JsonProperty("trackers")
    private List<Tracker> trackers = null;
    @JsonProperty("uploadLimit")
    private Integer uploadLimit;
    @JsonProperty("uploadLimited")
    private Boolean uploadLimited;
    @JsonProperty("uploadRatio")
    private Double uploadRatio;
    @JsonProperty("uploadedEver")
    private Long uploadedEver;
    @JsonProperty("wanted")
    private List<Integer> wanted = null;
    @JsonProperty("webseeds")
    private List<Object> webseeds = null;
    @JsonProperty("webseedsSendingToUs")
    private Integer webseedsSendingToUs;
    
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    @JsonProperty("activityDate")
    public void setActivityDate(Long activityDate) {
        this.activityDate = new Date(activityDate*1000);
    }

    @JsonProperty("addedDate")
    public Date getAddedDate() {
        return addedDate;
    }

    @JsonProperty("addedDate")
    public void setAddedDate(Long addedDate) {
        this.addedDate = new Date(addedDate*1000);
    }

    @JsonProperty("bandwidthPriority")
    public Integer getBandwidthPriority() {
        return bandwidthPriority;
    }

    @JsonProperty("bandwidthPriority")
    public void setBandwidthPriority(Integer bandwidthPriority) {
        this.bandwidthPriority = bandwidthPriority;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonProperty("corruptEver")
    public Integer getCorruptEver() {
        return corruptEver;
    }

    @JsonProperty("corruptEver")
    public void setCorruptEver(Integer corruptEver) {
        this.corruptEver = corruptEver;
    }

    @JsonProperty("creator")
    public String getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @JsonProperty("dateCreated")
    public Date getDateCreated() {
        return dateCreated;
    }

    @JsonProperty("dateCreated")
    public void setDateCreated(Long dateCreated) {
        this.dateCreated = new Date(dateCreated*1000);
    }

    @JsonProperty("desiredAvailable")
    public Integer getDesiredAvailable() {
        return desiredAvailable;
    }

    @JsonProperty("desiredAvailable")
    public void setDesiredAvailable(Integer desiredAvailable) {
        this.desiredAvailable = desiredAvailable;
    }

    @JsonProperty("doneDate")
    public Date getDoneDate() {
        return doneDate;
    }

    @JsonProperty("doneDate")
    public void setDoneDate(Long doneDate) {
        this.doneDate = new Date(doneDate*1000);
    }

    @JsonProperty("downloadDir")
    public String getDownloadDir() {
        return downloadDir;
    }

    @JsonProperty("downloadDir")
    public void setDownloadDir(String downloadDir) {
        this.downloadDir = downloadDir;
    }

    @JsonProperty("downloadLimit")
    public Integer getDownloadLimit() {
        return downloadLimit;
    }

    @JsonProperty("downloadLimit")
    public void setDownloadLimit(Integer downloadLimit) {
        this.downloadLimit = downloadLimit;
    }

    @JsonProperty("downloadLimited")
    public Boolean getDownloadLimited() {
        return downloadLimited;
    }

    @JsonProperty("downloadLimited")
    public void setDownloadLimited(Boolean downloadLimited) {
        this.downloadLimited = downloadLimited;
    }

    @JsonProperty("downloadedEver")
    public Integer getDownloadedEver() {
        return downloadedEver;
    }

    @JsonProperty("downloadedEver")
    public void setDownloadedEver(Integer downloadedEver) {
        this.downloadedEver = downloadedEver;
    }

    @JsonProperty("error")
    public Integer getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(Integer error) {
        this.error = error;
    }

    @JsonProperty("errorString")
    public String getErrorString() {
        return errorString;
    }

    @JsonProperty("errorString")
    public void setErrorString(String errorString) {
        this.errorString = errorString;
    }

    @JsonProperty("eta")
    public Integer getEta() {
        return eta;
    }

    @JsonProperty("eta")
    public void setEta(Integer eta) {
        this.eta = eta;
    }

    @JsonProperty("etaIdle")
    public Integer getEtaIdle() {
        return etaIdle;
    }

    @JsonProperty("etaIdle")
    public void setEtaIdle(Integer etaIdle) {
        this.etaIdle = etaIdle;
    }

    @JsonProperty("fileStats")
    public List<FileStat> getFileStats() {
        return fileStats;
    }

    @JsonProperty("fileStats")
    public void setFileStats(List<FileStat> fileStats) {
        this.fileStats = fileStats;
    }

    @JsonProperty("files")
    public List<File> getFiles() {
        return files;
    }

    @JsonProperty("files")
    public void setFiles(List<File> files) {
        this.files = files;
    }

    @JsonProperty("hashString")
    public String getHashString() {
		return hashString;
	}

    @JsonProperty("hashString")
	public void setHashString(String hashString) {
		this.hashString = hashString;
	}

	@JsonProperty("haveUnchecked")
    public Integer getHaveUnchecked() {
        return haveUnchecked;
    }

    @JsonProperty("haveUnchecked")
    public void setHaveUnchecked(Integer haveUnchecked) {
        this.haveUnchecked = haveUnchecked;
    }

    @JsonProperty("haveValid")
    public Integer getHaveValid() {
        return haveValid;
    }

    @JsonProperty("haveValid")
    public void setHaveValid(Integer haveValid) {
        this.haveValid = haveValid;
    }

    @JsonProperty("honorsSessionLimits")
    public Boolean getHonorsSessionLimits() {
        return honorsSessionLimits;
    }

    @JsonProperty("honorsSessionLimits")
    public void setHonorsSessionLimits(Boolean honorsSessionLimits) {
        this.honorsSessionLimits = honorsSessionLimits;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("isFinished")
    public Boolean getIsFinished() {
        return isFinished;
    }

    @JsonProperty("isFinished")
    public void setIsFinished(Boolean isFinished) {
        this.isFinished = isFinished;
    }

    @JsonProperty("isPrivate")
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    @JsonProperty("isPrivate")
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    @JsonProperty("isStalled")
    public Boolean getIsStalled() {
        return isStalled;
    }

    @JsonProperty("isStalled")
    public void setIsStalled(Boolean isStalled) {
        this.isStalled = isStalled;
    }

    @JsonProperty("leftUntilDone")
    public Integer getLeftUntilDone() {
        return leftUntilDone;
    }

    @JsonProperty("leftUntilDone")
    public void setLeftUntilDone(Integer leftUntilDone) {
        this.leftUntilDone = leftUntilDone;
    }

    @JsonProperty("magnetLink")
    public String getMagnetLink() {
        return magnetLink;
    }

    @JsonProperty("magnetLink")
    public void setMagnetLink(String magnetLink) {
        this.magnetLink = magnetLink;
    }

    @JsonProperty("manualAnnounceTime")
    public Integer getManualAnnounceTime() {
        return manualAnnounceTime;
    }

    @JsonProperty("manualAnnounceTime")
    public void setManualAnnounceTime(Integer manualAnnounceTime) {
        this.manualAnnounceTime = manualAnnounceTime;
    }

    @JsonProperty("maxConnectedPeers")
    public Integer getMaxConnectedPeers() {
        return maxConnectedPeers;
    }

    @JsonProperty("maxConnectedPeers")
    public void setMaxConnectedPeers(Integer maxConnectedPeers) {
        this.maxConnectedPeers = maxConnectedPeers;
    }

    @JsonProperty("metadataPercentComplete")
    public Integer getMetadataPercentComplete() {
        return metadataPercentComplete;
    }

    @JsonProperty("metadataPercentComplete")
    public void setMetadataPercentComplete(Integer metadataPercentComplete) {
        this.metadataPercentComplete = metadataPercentComplete;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("peer-limit")
    public Integer getPeerLimit() {
        return peerLimit;
    }

    @JsonProperty("peer-limit")
    public void setPeerLimit(Integer peerLimit) {
        this.peerLimit = peerLimit;
    }

    @JsonProperty("peers")
    public List<Object> getPeers() {
        return peers;
    }

    @JsonProperty("peers")
    public void setPeers(List<Object> peers) {
        this.peers = peers;
    }

    @JsonProperty("peersConnected")
    public Integer getPeersConnected() {
        return peersConnected;
    }

    @JsonProperty("peersConnected")
    public void setPeersConnected(Integer peersConnected) {
        this.peersConnected = peersConnected;
    }

    @JsonProperty("peersFrom")
    public PeersFrom getPeersFrom() {
        return peersFrom;
    }

    @JsonProperty("peersFrom")
    public void setPeersFrom(PeersFrom peersFrom) {
        this.peersFrom = peersFrom;
    }

    @JsonProperty("peersGettingFromUs")
    public Integer getPeersGettingFromUs() {
        return peersGettingFromUs;
    }

    @JsonProperty("peersGettingFromUs")
    public void setPeersGettingFromUs(Integer peersGettingFromUs) {
        this.peersGettingFromUs = peersGettingFromUs;
    }

    @JsonProperty("peersSendingToUs")
    public Integer getPeersSendingToUs() {
        return peersSendingToUs;
    }

    @JsonProperty("peersSendingToUs")
    public void setPeersSendingToUs(Integer peersSendingToUs) {
        this.peersSendingToUs = peersSendingToUs;
    }

    @JsonProperty("percentDone")
    public Integer getPercentDone() {
        return percentDone;
    }

    @JsonProperty("percentDone")
    public void setPercentDone(Integer percentDone) {
        this.percentDone = percentDone;
    }

    @JsonProperty("pieceCount")
    public Integer getPieceCount() {
        return pieceCount;
    }

    @JsonProperty("pieceCount")
    public void setPieceCount(Integer pieceCount) {
        this.pieceCount = pieceCount;
    }

    @JsonProperty("pieceSize")
    public Integer getPieceSize() {
        return pieceSize;
    }

    @JsonProperty("pieceSize")
    public void setPieceSize(Integer pieceSize) {
        this.pieceSize = pieceSize;
    }

    @JsonProperty("pieces")
    public String getPieces() {
        return pieces;
    }

    @JsonProperty("pieces")
    public void setPieces(String pieces) {
        this.pieces = pieces;
    }

    @JsonProperty("priorities")
    public List<Integer> getPriorities() {
        return priorities;
    }

    @JsonProperty("priorities")
    public void setPriorities(List<Integer> priorities) {
        this.priorities = priorities;
    }

    @JsonProperty("queuePosition")
    public Integer getQueuePosition() {
        return queuePosition;
    }

    @JsonProperty("queuePosition")
    public void setQueuePosition(Integer queuePosition) {
        this.queuePosition = queuePosition;
    }

    @JsonProperty("rateDownload")
    public Integer getRateDownload() {
        return rateDownload;
    }

    @JsonProperty("rateDownload")
    public void setRateDownload(Integer rateDownload) {
        this.rateDownload = rateDownload;
    }

    @JsonProperty("rateUpload")
    public Integer getRateUpload() {
        return rateUpload;
    }

    @JsonProperty("rateUpload")
    public void setRateUpload(Integer rateUpload) {
        this.rateUpload = rateUpload;
    }

    @JsonProperty("recheckProgress")
    public Integer getRecheckProgress() {
        return recheckProgress;
    }

    @JsonProperty("recheckProgress")
    public void setRecheckProgress(Integer recheckProgress) {
        this.recheckProgress = recheckProgress;
    }

    @JsonProperty("secondsDownloading")
    public Integer getSecondsDownloading() {
        return secondsDownloading;
    }

    @JsonProperty("secondsDownloading")
    public void setSecondsDownloading(Integer secondsDownloading) {
        this.secondsDownloading = secondsDownloading;
    }

    @JsonProperty("secondsSeeding")
    public Integer getSecondsSeeding() {
        return secondsSeeding;
    }

    @JsonProperty("secondsSeeding")
    public void setSecondsSeeding(Integer secondsSeeding) {
        this.secondsSeeding = secondsSeeding;
    }

    @JsonProperty("seedIdleLimit")
    public Integer getSeedIdleLimit() {
        return seedIdleLimit;
    }

    @JsonProperty("seedIdleLimit")
    public void setSeedIdleLimit(Integer seedIdleLimit) {
        this.seedIdleLimit = seedIdleLimit;
    }

    @JsonProperty("seedIdleMode")
    public Integer getSeedIdleMode() {
        return seedIdleMode;
    }

    @JsonProperty("seedIdleMode")
    public void setSeedIdleMode(Integer seedIdleMode) {
        this.seedIdleMode = seedIdleMode;
    }

    @JsonProperty("seedRatioLimit")
    public Integer getSeedRatioLimit() {
        return seedRatioLimit;
    }

    @JsonProperty("seedRatioLimit")
    public void setSeedRatioLimit(Integer seedRatioLimit) {
        this.seedRatioLimit = seedRatioLimit;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status.toString();
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = TorrentStatus.fromId(status.intValue());
    }
    
    @JsonProperty("startDate")
    public Date getStartDate() {
		return startDate;
	}

    @JsonProperty("startDate")
	public void setStartDate(Long startDate) {
		this.startDate = new Date(startDate*1000);
	}

	@JsonProperty("torrentFile")
    public String getTorrentFile() {
        return torrentFile;
    }

    @JsonProperty("torrentFile")
    public void setTorrentFile(String torrentFile) {
        this.torrentFile = torrentFile;
    }

    @JsonProperty("totalSize")
    public Long getTotalSize() {
        return totalSize;
    }

    @JsonProperty("totalSize")
    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    @JsonProperty("trackerStats")
    public List<TrackerStat> getTrackerStats() {
        return trackerStats;
    }

    @JsonProperty("trackerStats")
    public void setTrackerStats(List<TrackerStat> trackerStats) {
        this.trackerStats = trackerStats;
    }

    @JsonProperty("trackers")
    public List<Tracker> getTrackers() {
        return trackers;
    }

    @JsonProperty("trackers")
    public void setTrackers(List<Tracker> trackers) {
        this.trackers = trackers;
    }

    @JsonProperty("uploadLimit")
    public Integer getUploadLimit() {
        return uploadLimit;
    }

    @JsonProperty("uploadLimit")
    public void setUploadLimit(Integer uploadLimit) {
        this.uploadLimit = uploadLimit;
    }

    @JsonProperty("uploadLimited")
    public Boolean getUploadLimited() {
        return uploadLimited;
    }

    @JsonProperty("uploadLimited")
    public void setUploadLimited(Boolean uploadLimited) {
        this.uploadLimited = uploadLimited;
    }

    @JsonProperty("uploadRatio")
    public Double getUploadRatio() {
        return uploadRatio;
    }

    @JsonProperty("uploadRatio")
    public void setUploadRatio(Double uploadRatio) {
        this.uploadRatio = uploadRatio;
    }

    @JsonProperty("uploadedEver")
    public Long getUploadedEver() {
        return uploadedEver;
    }

    @JsonProperty("uploadedEver")
    public void setUploadedEver(Long uploadedEver) {
        this.uploadedEver = uploadedEver;
    }

    @JsonProperty("wanted")
    public List<Integer> getWanted() {
        return wanted;
    }

    @JsonProperty("wanted")
    public void setWanted(List<Integer> wanted) {
        this.wanted = wanted;
    }

    @JsonProperty("webseeds")
    public List<Object> getWebseeds() {
        return webseeds;
    }

    @JsonProperty("webseeds")
    public void setWebseeds(List<Object> webseeds) {
        this.webseeds = webseeds;
    }

    @JsonProperty("webseedsSendingToUs")
    public Integer getWebseedsSendingToUs() {
        return webseedsSendingToUs;
    }

    @JsonProperty("webseedsSendingToUs")
    public void setWebseedsSendingToUs(Integer webseedsSendingToUs) {
        this.webseedsSendingToUs = webseedsSendingToUs;
    }
}
