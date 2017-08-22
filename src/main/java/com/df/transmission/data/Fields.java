package com.df.transmission.data;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;


@JsonSerialize(using = FieldsSerializer.class)
public class Fields {
	
	private Boolean activityDate;
	private Boolean addedDate;
	private Boolean bandwidthPriority;
	private Boolean comment;
	private Boolean corruptEver;
	private Boolean creator;
	private Boolean dateCreated;
	private Boolean desiredAvailable;
	private Boolean doneDate;
	private Boolean downloadDir;
	private Boolean downloadedEver;
	private Boolean downloadLimit;
	private Boolean downloadLimited;
	private Boolean error;
	private Boolean errorString;
	private Boolean eta;
	private Boolean etaIdle;
	private Boolean files;
	private Boolean fileStats;
	private Boolean hash;
	private Boolean haveUnchecked;
	private Boolean haveValid;
	private Boolean honorsSessionLimits;
	private Boolean id;
	private Boolean isFinished;
	private Boolean isPrivate;
	private Boolean isStalled;
	private Boolean leftUntilDone;
	private Boolean magnetLink;
	private Boolean manualAnnounceTime;
	private Boolean maxConnectedPeers;
	private Boolean metadataPercentComplete;
	private Boolean name;
	@JsonProperty("peer-limit")
	private Boolean peerLimit;
	private Boolean peers;
	private Boolean peersConnected;
	private Boolean peersFrom;
	private Boolean peersGettingFromUs;
	private Boolean peersSendingToUs;
	private Boolean percentDone;
	private Boolean pieces;
	private Boolean pieceCount;
	private Boolean pieceSize;
	private Boolean priorities;
	private Boolean queuePosition;
	private Boolean rateDownload;
	private Boolean rateUpload;
	private Boolean recheckProgress;
	private Boolean secondsDownloading;
	private Boolean secondsSeeding;
	private Boolean seedIdleLimit;
	private Boolean seedIdleMode;
	private Boolean seedRatioLimit;
	private Boolean seedRatioMode;
	private Boolean sizeWhenDone;
	private Boolean startDate;
	private Boolean status;	
	private Boolean trackers;
	private Boolean trackerStats;
	private Boolean totalSize;
	private Boolean torrentFile;
	private Boolean uploadedEver;
	private Boolean uploadLimit;
	private Boolean uploadLimited;
	private Boolean uploadRatio;
	private Boolean wanted;
	private Boolean webseeds;
	private Boolean webseedsSendingToUs;
	public Boolean getActivityDate() {
		return activityDate;
	}
	public void setActivityDate(Boolean activityDate) {
		this.activityDate = activityDate;
	}
	public Boolean getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Boolean addedDate) {
		this.addedDate = addedDate;
	}
	public Boolean getBandwidthPriority() {
		return bandwidthPriority;
	}
	public void setBandwidthPriority(Boolean bandwidthPriority) {
		this.bandwidthPriority = bandwidthPriority;
	}
	public Boolean getComment() {
		return comment;
	}
	public void setComment(Boolean comment) {
		this.comment = comment;
	}
	public Boolean getCorruptEver() {
		return corruptEver;
	}
	public void setCorruptEver(Boolean corruptEver) {
		this.corruptEver = corruptEver;
	}
	public Boolean getCreator() {
		return creator;
	}
	public void setCreator(Boolean creator) {
		this.creator = creator;
	}
	public Boolean getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Boolean dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Boolean getDesiredAvailable() {
		return desiredAvailable;
	}
	public void setDesiredAvailable(Boolean desiredAvailable) {
		this.desiredAvailable = desiredAvailable;
	}
	public Boolean getDoneDate() {
		return doneDate;
	}
	public void setDoneDate(Boolean doneDate) {
		this.doneDate = doneDate;
	}
	public Boolean getDownloadDir() {
		return downloadDir;
	}
	public void setDownloadDir(Boolean downloadDir) {
		this.downloadDir = downloadDir;
	}
	public Boolean getDownloadedEver() {
		return downloadedEver;
	}
	public void setDownloadedEver(Boolean downloadedEver) {
		this.downloadedEver = downloadedEver;
	}
	public Boolean getDownloadLimit() {
		return downloadLimit;
	}
	public void setDownloadLimit(Boolean downloadLimit) {
		this.downloadLimit = downloadLimit;
	}
	public Boolean getDownloadLimited() {
		return downloadLimited;
	}
	public void setDownloadLimited(Boolean downloadLimited) {
		this.downloadLimited = downloadLimited;
	}
	public Boolean getError() {
		return error;
	}
	public void setError(Boolean error) {
		this.error = error;
	}
	public Boolean getErrorString() {
		return errorString;
	}
	public void setErrorString(Boolean errorString) {
		this.errorString = errorString;
	}
	public Boolean getEta() {
		return eta;
	}
	public void setEta(Boolean eta) {
		this.eta = eta;
	}
	public Boolean getEtaIdle() {
		return etaIdle;
	}
	public void setEtaIdle(Boolean etaIdle) {
		this.etaIdle = etaIdle;
	}
	public Boolean getFiles() {
		return files;
	}
	public void setFiles(Boolean files) {
		this.files = files;
	}
	public Boolean getFileStats() {
		return fileStats;
	}
	public void setFileStats(Boolean fileStats) {
		this.fileStats = fileStats;
	}
	public Boolean getHash() {
		return hash;
	}
	public void setHash(Boolean hash) {
		this.hash = hash;
	}
	public Boolean getHaveUnchecked() {
		return haveUnchecked;
	}
	public void setHaveUnchecked(Boolean haveUnchecked) {
		this.haveUnchecked = haveUnchecked;
	}
	public Boolean getHaveValid() {
		return haveValid;
	}
	public void setHaveValid(Boolean haveValid) {
		this.haveValid = haveValid;
	}
	public Boolean getHonorsSessionLimits() {
		return honorsSessionLimits;
	}
	public void setHonorsSessionLimits(Boolean honorsSessionLimits) {
		this.honorsSessionLimits = honorsSessionLimits;
	}
	public Boolean getId() {
		return id;
	}
	public void setId(Boolean id) {
		this.id = id;
	}
	public Boolean getIsFinished() {
		return isFinished;
	}
	public void setIsFinished(Boolean isFinished) {
		this.isFinished = isFinished;
	}
	public Boolean getIsPrivate() {
		return isPrivate;
	}
	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
	public Boolean getIsStalled() {
		return isStalled;
	}
	public void setIsStalled(Boolean isStalled) {
		this.isStalled = isStalled;
	}
	public Boolean getLeftUntilDone() {
		return leftUntilDone;
	}
	public void setLeftUntilDone(Boolean leftUntilDone) {
		this.leftUntilDone = leftUntilDone;
	}
	public Boolean getMagnetLink() {
		return magnetLink;
	}
	public void setMagnetLink(Boolean magnetLink) {
		this.magnetLink = magnetLink;
	}
	public Boolean getManualAnnounceTime() {
		return manualAnnounceTime;
	}
	public void setManualAnnounceTime(Boolean manualAnnounceTime) {
		this.manualAnnounceTime = manualAnnounceTime;
	}
	public Boolean getMaxConnectedPeers() {
		return maxConnectedPeers;
	}
	public void setMaxConnectedPeers(Boolean maxConnectedPeers) {
		this.maxConnectedPeers = maxConnectedPeers;
	}
	public Boolean getMetadataPercentComplete() {
		return metadataPercentComplete;
	}
	public void setMetadataPercentComplete(Boolean metadataPercentComplete) {
		this.metadataPercentComplete = metadataPercentComplete;
	}
	public Boolean getName() {
		return name;
	}
	public void setName(Boolean name) {
		this.name = name;
	}
	public Boolean getPeerLimit() {
		return peerLimit;
	}
	public void setPeerLimit(Boolean peerLimit) {
		this.peerLimit = peerLimit;
	}
	public Boolean getPeers() {
		return peers;
	}
	public void setPeers(Boolean peers) {
		this.peers = peers;
	}
	public Boolean getPeersConnected() {
		return peersConnected;
	}
	public void setPeersConnected(Boolean peersConnected) {
		this.peersConnected = peersConnected;
	}
	public Boolean getPeersFrom() {
		return peersFrom;
	}
	public void setPeersFrom(Boolean peersFrom) {
		this.peersFrom = peersFrom;
	}
	public Boolean getPeersGettingFromUs() {
		return peersGettingFromUs;
	}
	public void setPeersGettingFromUs(Boolean peersGettingFromUs) {
		this.peersGettingFromUs = peersGettingFromUs;
	}
	public Boolean getPeersSendingToUs() {
		return peersSendingToUs;
	}
	public void setPeersSendingToUs(Boolean peersSendingToUs) {
		this.peersSendingToUs = peersSendingToUs;
	}
	public Boolean getPercentDone() {
		return percentDone;
	}
	public void setPercentDone(Boolean percentDone) {
		this.percentDone = percentDone;
	}
	public Boolean getPieces() {
		return pieces;
	}
	public void setPieces(Boolean pieces) {
		this.pieces = pieces;
	}
	public Boolean getPieceCount() {
		return pieceCount;
	}
	public void setPieceCount(Boolean pieceCount) {
		this.pieceCount = pieceCount;
	}
	public Boolean getPieceSize() {
		return pieceSize;
	}
	public void setPieceSize(Boolean pieceSize) {
		this.pieceSize = pieceSize;
	}
	public Boolean getPriorities() {
		return priorities;
	}
	public void setPriorities(Boolean priorities) {
		this.priorities = priorities;
	}
	public Boolean getQueuePosition() {
		return queuePosition;
	}
	public void setQueuePosition(Boolean queuePosition) {
		this.queuePosition = queuePosition;
	}
	public Boolean getRateDownload() {
		return rateDownload;
	}
	public void setRateDownload(Boolean rateDownload) {
		this.rateDownload = rateDownload;
	}
	public Boolean getRateUpload() {
		return rateUpload;
	}
	public void setRateUpload(Boolean rateUpload) {
		this.rateUpload = rateUpload;
	}
	public Boolean getRecheckProgress() {
		return recheckProgress;
	}
	public void setRecheckProgress(Boolean recheckProgress) {
		this.recheckProgress = recheckProgress;
	}
	public Boolean getSecondsDownloading() {
		return secondsDownloading;
	}
	public void setSecondsDownloading(Boolean secondsDownloading) {
		this.secondsDownloading = secondsDownloading;
	}
	public Boolean getSecondsSeeding() {
		return secondsSeeding;
	}
	public void setSecondsSeeding(Boolean secondsSeeding) {
		this.secondsSeeding = secondsSeeding;
	}
	public Boolean getSeedIdleLimit() {
		return seedIdleLimit;
	}
	public void setSeedIdleLimit(Boolean seedIdleLimit) {
		this.seedIdleLimit = seedIdleLimit;
	}
	public Boolean getSeedIdleMode() {
		return seedIdleMode;
	}
	public void setSeedIdleMode(Boolean seedIdleMode) {
		this.seedIdleMode = seedIdleMode;
	}
	public Boolean getSeedRatioLimit() {
		return seedRatioLimit;
	}
	public void setSeedRatioLimit(Boolean seedRatioLimit) {
		this.seedRatioLimit = seedRatioLimit;
	}
	public Boolean getSeedRatioMode() {
		return seedRatioMode;
	}
	public void setSeedRatioMode(Boolean seedRatioMode) {
		this.seedRatioMode = seedRatioMode;
	}
	public Boolean getSizeWhenDone() {
		return sizeWhenDone;
	}
	public void setSizeWhenDone(Boolean sizeWhenDone) {
		this.sizeWhenDone = sizeWhenDone;
	}
	public Boolean getStartDate() {
		return startDate;
	}
	public void setStartDate(Boolean startDate) {
		this.startDate = startDate;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}	
	public Boolean getTrackers() {
		return trackers;
	}
	public void setTrackers(Boolean trackers) {
		this.trackers = trackers;
	}
	public Boolean getTrackerStats() {
		return trackerStats;
	}
	public void setTrackerStats(Boolean trackerStats) {
		this.trackerStats = trackerStats;
	}
	public Boolean getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(Boolean totalSize) {
		this.totalSize = totalSize;
	}
	public Boolean getTorrentFile() {
		return torrentFile;
	}
	public void setTorrentFile(Boolean torrentFile) {
		this.torrentFile = torrentFile;
	}
	public Boolean getUploadedEver() {
		return uploadedEver;
	}
	public void setUploadedEver(Boolean uploadedEver) {
		this.uploadedEver = uploadedEver;
	}
	public Boolean getUploadLimit() {
		return uploadLimit;
	}
	public void setUploadLimit(Boolean uploadLimit) {
		this.uploadLimit = uploadLimit;
	}
	public Boolean getUploadLimited() {
		return uploadLimited;
	}
	public void setUploadLimited(Boolean uploadLimited) {
		this.uploadLimited = uploadLimited;
	}
	public Boolean getUploadRatio() {
		return uploadRatio;
	}
	public void setUploadRatio(Boolean uploadRatio) {
		this.uploadRatio = uploadRatio;
	}
	public Boolean getWanted() {
		return wanted;
	}
	public void setWanted(Boolean wanted) {
		this.wanted = wanted;
	}
	public Boolean getWebseeds() {
		return webseeds;
	}
	public void setWebseeds(Boolean webseeds) {
		this.webseeds = webseeds;
	}
	public Boolean getWebseedsSendingToUs() {
		return webseedsSendingToUs;
	}
	public void setWebseedsSendingToUs(Boolean webseedsSendingToUs) {
		this.webseedsSendingToUs = webseedsSendingToUs;
	}

	private String Escape(String s) {
		return "\"" + s + "\"";
	}
	
	private String getFieldInfo(Field f) {
		JsonProperty property=f.getAnnotation(JsonProperty.class);
		if (property!=null) {
			return property.value();
		}
		else return f.getName();
	}
	
	public List<String> toList() {
		List<String> output=new ArrayList<String>();
		try{
			Iterable<Field> fields = new ArrayList<Field>(Arrays.asList(getClass().getDeclaredFields()));
			Iterator<Field> fieldsIterator = fields.iterator();
			while (fieldsIterator.hasNext()) {
				Field c = fieldsIterator.next();
				if (c.get(this)==null || !(Boolean)c.get(this)) {
					fieldsIterator.remove();
				}
			}
			Iterator<Field> it = fields.iterator();
			while (it.hasNext()) {
				output.add(getFieldInfo(it.next()));
			}
		}catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return output;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		try {
			Iterable<Field> fields = new ArrayList<Field>(Arrays.asList(getClass().getDeclaredFields()));
			Iterator<Field> fieldsIterator = fields.iterator();
			while (fieldsIterator.hasNext()) {
				Field c = fieldsIterator.next();
				if (c.get(this)==null || !(Boolean)c.get(this)) {
					fieldsIterator.remove();
				}
			}
			Iterator<Field> it = fields.iterator();
			if (it.hasNext()) {
				sb.append(getFieldInfo(it.next()));
			}
			while (it.hasNext()) {
				sb.append(", " + getFieldInfo(it.next()));
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		sb.append("]");
		return sb.toString();
	}
}
