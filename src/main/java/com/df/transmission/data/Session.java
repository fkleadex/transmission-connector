package com.df.transmission.data;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "alt-speed-down", "alt-speed-enabled", "alt-speed-time-begin", "alt-speed-time-day",
		"alt-speed-time-enabled", "alt-speed-time-end", "alt-speed-up", "blocklist-enabled", "blocklist-size",
		"blocklist-url", "cache-size-mb", "config-dir", "dht-enabled", "download-dir", "download-dir-free-space",
		"download-queue-enabled", "download-queue-size", "encryption", "idle-seeding-limit",
		"idle-seeding-limit-enabled", "incomplete-dir", "incomplete-dir-enabled", "lpd-enabled", "peer-limit-global",
		"peer-limit-per-torrent", "peer-port", "peer-port-random-on-start", "pex-enabled", "port-forwarding-enabled",
		"queue-stalled-enabled", "queue-stalled-minutes", "rename-partial-files", "rpc-version", "rpc-version-minimum",
		"script-torrent-done-enabled", "script-torrent-done-filename", "seed-queue-enabled", "seed-queue-size",
		"seedRatioLimit", "seedRatioLimited", "speed-limit-down", "speed-limit-down-enabled", "speed-limit-up",
		"speed-limit-up-enabled", "start-added-torrents", "trash-original-torrent-files", "units", "utp-enabled",
		"version" })
public class Session {

	@JsonProperty("alt-speed-down")
	private Integer altSpeedDown;
	@JsonProperty("alt-speed-enabled")
	private Boolean altSpeedEnabled;
	@JsonProperty("alt-speed-time-begin")
	private Integer altSpeedTimeBegin;
	@JsonProperty("alt-speed-time-day")
	private Integer altSpeedTimeDay;
	@JsonProperty("alt-speed-time-enabled")
	private Boolean altSpeedTimeEnabled;
	@JsonProperty("alt-speed-time-end")
	private Integer altSpeedTimeEnd;
	@JsonProperty("alt-speed-up")
	private Integer altSpeedUp;
	@JsonProperty("blocklist-enabled")
	private Boolean blocklistEnabled;
	@JsonProperty("blocklist-size")
	private Integer blocklistSize;
	@JsonProperty("blocklist-url")
	private String blocklistUrl;
	@JsonProperty("cache-size-mb")
	private Integer cacheSizeMb;
	@JsonProperty("config-dir")
	private String configDir;
	@JsonProperty("dht-enabled")
	private Boolean dhtEnabled;
	@JsonProperty("download-dir")
	private String downloadDir;
	@JsonProperty("download-dir-free-space")
	private Long downloadDirFreeSpace;
	@JsonProperty("download-queue-enabled")
	private Boolean downloadQueueEnabled;
	@JsonProperty("download-queue-size")
	private Integer downloadQueueSize;
	@JsonProperty("encryption")
	private String encryption;
	@JsonProperty("idle-seeding-limit")
	private Integer idleSeedingLimit;
	@JsonProperty("idle-seeding-limit-enabled")
	private Boolean idleSeedingLimitEnabled;
	@JsonProperty("incomplete-dir")
	private String incompleteDir;
	@JsonProperty("incomplete-dir-enabled")
	private Boolean incompleteDirEnabled;
	@JsonProperty("lpd-enabled")
	private Boolean lpdEnabled;
	@JsonProperty("peer-limit-global")
	private Integer peerLimitGlobal;
	@JsonProperty("peer-limit-per-torrent")
	private Integer peerLimitPerTorrent;
	@JsonProperty("peer-port")
	private Integer peerPort;
	@JsonProperty("peer-port-random-on-start")
	private Boolean peerPortRandomOnStart;
	@JsonProperty("pex-enabled")
	private Boolean pexEnabled;
	@JsonProperty("port-forwarding-enabled")
	private Boolean portForwardingEnabled;
	@JsonProperty("queue-stalled-enabled")
	private Boolean queueStalledEnabled;
	@JsonProperty("queue-stalled-minutes")
	private Integer queueStalledMinutes;
	@JsonProperty("rename-partial-files")
	private Boolean renamePartialFiles;
	@JsonProperty("rpc-version")
	private Integer rpcVersion;
	@JsonProperty("rpc-version-minimum")
	private Integer rpcVersionMinimum;
	@JsonProperty("script-torrent-done-enabled")
	private Boolean scriptTorrentDoneEnabled;
	@JsonProperty("script-torrent-done-filename")
	private String scriptTorrentDoneFilename;
	@JsonProperty("seed-queue-enabled")
	private Boolean seedQueueEnabled;
	@JsonProperty("seed-queue-size")
	private Integer seedQueueSize;
	@JsonProperty("seedRatioLimit")
	private Integer seedRatioLimit;
	@JsonProperty("seedRatioLimited")
	private Boolean seedRatioLimited;
	@JsonProperty("speed-limit-down")
	private Integer speedLimitDown;
	@JsonProperty("speed-limit-down-enabled")
	private Boolean speedLimitDownEnabled;
	@JsonProperty("speed-limit-up")
	private Integer speedLimitUp;
	@JsonProperty("speed-limit-up-enabled")
	private Boolean speedLimitUpEnabled;
	@JsonProperty("start-added-torrents")
	private Boolean startAddedTorrents;
	@JsonProperty("trash-original-torrent-files")
	private Boolean trashOriginalTorrentFiles;
	@JsonProperty("units")
	private Units units;
	@JsonProperty("utp-enabled")
	private Boolean utpEnabled;
	@JsonProperty("version")
	private String version;

	@JsonProperty("alt-speed-down")
	public Integer getAltSpeedDown() {
		return altSpeedDown;
	}

	@JsonProperty("alt-speed-down")
	public void setAltSpeedDown(Integer altSpeedDown) {
		this.altSpeedDown = altSpeedDown;
	}

	@JsonProperty("alt-speed-enabled")
	public Boolean getAltSpeedEnabled() {
		return altSpeedEnabled;
	}

	@JsonProperty("alt-speed-enabled")
	public void setAltSpeedEnabled(Boolean altSpeedEnabled) {
		this.altSpeedEnabled = altSpeedEnabled;
	}

	@JsonProperty("alt-speed-time-begin")
	public Integer getAltSpeedTimeBegin() {
		return altSpeedTimeBegin;
	}

	@JsonProperty("alt-speed-time-begin")
	public void setAltSpeedTimeBegin(Integer altSpeedTimeBegin) {
		this.altSpeedTimeBegin = altSpeedTimeBegin;
	}

	@JsonProperty("alt-speed-time-day")
	public Integer getAltSpeedTimeDay() {
		return altSpeedTimeDay;
	}

	@JsonProperty("alt-speed-time-day")
	public void setAltSpeedTimeDay(Integer altSpeedTimeDay) {
		this.altSpeedTimeDay = altSpeedTimeDay;
	}

	@JsonProperty("alt-speed-time-enabled")
	public Boolean getAltSpeedTimeEnabled() {
		return altSpeedTimeEnabled;
	}

	@JsonProperty("alt-speed-time-enabled")
	public void setAltSpeedTimeEnabled(Boolean altSpeedTimeEnabled) {
		this.altSpeedTimeEnabled = altSpeedTimeEnabled;
	}

	@JsonProperty("alt-speed-time-end")
	public Integer getAltSpeedTimeEnd() {
		return altSpeedTimeEnd;
	}

	@JsonProperty("alt-speed-time-end")
	public void setAltSpeedTimeEnd(Integer altSpeedTimeEnd) {
		this.altSpeedTimeEnd = altSpeedTimeEnd;
	}

	@JsonProperty("alt-speed-up")
	public Integer getAltSpeedUp() {
		return altSpeedUp;
	}

	@JsonProperty("alt-speed-up")
	public void setAltSpeedUp(Integer altSpeedUp) {
		this.altSpeedUp = altSpeedUp;
	}

	@JsonProperty("blocklist-enabled")
	public Boolean getBlocklistEnabled() {
		return blocklistEnabled;
	}

	@JsonProperty("blocklist-enabled")
	public void setBlocklistEnabled(Boolean blocklistEnabled) {
		this.blocklistEnabled = blocklistEnabled;
	}

	@JsonProperty("blocklist-size")
	public Integer getBlocklistSize() {
		return blocklistSize;
	}

	@JsonProperty("blocklist-size")
	public void setBlocklistSize(Integer blocklistSize) {
		this.blocklistSize = blocklistSize;
	}

	@JsonProperty("blocklist-url")
	public String getBlocklistUrl() {
		return blocklistUrl;
	}

	@JsonProperty("blocklist-url")
	public void setBlocklistUrl(String blocklistUrl) {
		this.blocklistUrl = blocklistUrl;
	}

	@JsonProperty("cache-size-mb")
	public Integer getCacheSizeMb() {
		return cacheSizeMb;
	}

	@JsonProperty("cache-size-mb")
	public void setCacheSizeMb(Integer cacheSizeMb) {
		this.cacheSizeMb = cacheSizeMb;
	}

	@JsonProperty("config-dir")
	public String getConfigDir() {
		return configDir;
	}

	@JsonProperty("config-dir")
	public void setConfigDir(String configDir) {
		this.configDir = configDir;
	}

	@JsonProperty("dht-enabled")
	public Boolean getDhtEnabled() {
		return dhtEnabled;
	}

	@JsonProperty("dht-enabled")
	public void setDhtEnabled(Boolean dhtEnabled) {
		this.dhtEnabled = dhtEnabled;
	}

	@JsonProperty("download-dir")
	public String getDownloadDir() {
		return downloadDir;
	}

	@JsonProperty("download-dir")
	public void setDownloadDir(String downloadDir) {
		this.downloadDir = downloadDir;
	}

	@JsonProperty("download-dir-free-space")
	public Long getDownloadDirFreeSpace() {
		return downloadDirFreeSpace;
	}

	@JsonProperty("download-dir-free-space")
	public void setDownloadDirFreeSpace(Long downloadDirFreeSpace) {
		this.downloadDirFreeSpace = downloadDirFreeSpace;
	}

	@JsonProperty("download-queue-enabled")
	public Boolean getDownloadQueueEnabled() {
		return downloadQueueEnabled;
	}

	@JsonProperty("download-queue-enabled")
	public void setDownloadQueueEnabled(Boolean downloadQueueEnabled) {
		this.downloadQueueEnabled = downloadQueueEnabled;
	}

	@JsonProperty("download-queue-size")
	public Integer getDownloadQueueSize() {
		return downloadQueueSize;
	}

	@JsonProperty("download-queue-size")
	public void setDownloadQueueSize(Integer downloadQueueSize) {
		this.downloadQueueSize = downloadQueueSize;
	}

	@JsonProperty("encryption")
	public String getEncryption() {
		return encryption;
	}

	@JsonProperty("encryption")
	public void setEncryption(String encryption) {
		this.encryption = encryption;
	}

	@JsonProperty("idle-seeding-limit")
	public Integer getIdleSeedingLimit() {
		return idleSeedingLimit;
	}

	@JsonProperty("idle-seeding-limit")
	public void setIdleSeedingLimit(Integer idleSeedingLimit) {
		this.idleSeedingLimit = idleSeedingLimit;
	}

	@JsonProperty("idle-seeding-limit-enabled")
	public Boolean getIdleSeedingLimitEnabled() {
		return idleSeedingLimitEnabled;
	}

	@JsonProperty("idle-seeding-limit-enabled")
	public void setIdleSeedingLimitEnabled(Boolean idleSeedingLimitEnabled) {
		this.idleSeedingLimitEnabled = idleSeedingLimitEnabled;
	}

	@JsonProperty("incomplete-dir")
	public String getIncompleteDir() {
		return incompleteDir;
	}

	@JsonProperty("incomplete-dir")
	public void setIncompleteDir(String incompleteDir) {
		this.incompleteDir = incompleteDir;
	}

	@JsonProperty("incomplete-dir-enabled")
	public Boolean getIncompleteDirEnabled() {
		return incompleteDirEnabled;
	}

	@JsonProperty("incomplete-dir-enabled")
	public void setIncompleteDirEnabled(Boolean incompleteDirEnabled) {
		this.incompleteDirEnabled = incompleteDirEnabled;
	}

	@JsonProperty("lpd-enabled")
	public Boolean getLpdEnabled() {
		return lpdEnabled;
	}

	@JsonProperty("lpd-enabled")
	public void setLpdEnabled(Boolean lpdEnabled) {
		this.lpdEnabled = lpdEnabled;
	}

	@JsonProperty("peer-limit-global")
	public Integer getPeerLimitGlobal() {
		return peerLimitGlobal;
	}

	@JsonProperty("peer-limit-global")
	public void setPeerLimitGlobal(Integer peerLimitGlobal) {
		this.peerLimitGlobal = peerLimitGlobal;
	}

	@JsonProperty("peer-limit-per-torrent")
	public Integer getPeerLimitPerTorrent() {
		return peerLimitPerTorrent;
	}

	@JsonProperty("peer-limit-per-torrent")
	public void setPeerLimitPerTorrent(Integer peerLimitPerTorrent) {
		this.peerLimitPerTorrent = peerLimitPerTorrent;
	}

	@JsonProperty("peer-port")
	public Integer getPeerPort() {
		return peerPort;
	}

	@JsonProperty("peer-port")
	public void setPeerPort(Integer peerPort) {
		this.peerPort = peerPort;
	}

	@JsonProperty("peer-port-random-on-start")
	public Boolean getPeerPortRandomOnStart() {
		return peerPortRandomOnStart;
	}

	@JsonProperty("peer-port-random-on-start")
	public void setPeerPortRandomOnStart(Boolean peerPortRandomOnStart) {
		this.peerPortRandomOnStart = peerPortRandomOnStart;
	}

	@JsonProperty("pex-enabled")
	public Boolean getPexEnabled() {
		return pexEnabled;
	}

	@JsonProperty("pex-enabled")
	public void setPexEnabled(Boolean pexEnabled) {
		this.pexEnabled = pexEnabled;
	}

	@JsonProperty("port-forwarding-enabled")
	public Boolean getPortForwardingEnabled() {
		return portForwardingEnabled;
	}

	@JsonProperty("port-forwarding-enabled")
	public void setPortForwardingEnabled(Boolean portForwardingEnabled) {
		this.portForwardingEnabled = portForwardingEnabled;
	}

	@JsonProperty("queue-stalled-enabled")
	public Boolean getQueueStalledEnabled() {
		return queueStalledEnabled;
	}

	@JsonProperty("queue-stalled-enabled")
	public void setQueueStalledEnabled(Boolean queueStalledEnabled) {
		this.queueStalledEnabled = queueStalledEnabled;
	}

	@JsonProperty("queue-stalled-minutes")
	public Integer getQueueStalledMinutes() {
		return queueStalledMinutes;
	}

	@JsonProperty("queue-stalled-minutes")
	public void setQueueStalledMinutes(Integer queueStalledMinutes) {
		this.queueStalledMinutes = queueStalledMinutes;
	}

	@JsonProperty("rename-partial-files")
	public Boolean getRenamePartialFiles() {
		return renamePartialFiles;
	}

	@JsonProperty("rename-partial-files")
	public void setRenamePartialFiles(Boolean renamePartialFiles) {
		this.renamePartialFiles = renamePartialFiles;
	}

	@JsonProperty("rpc-version")
	public Integer getRpcVersion() {
		return rpcVersion;
	}

	@JsonProperty("rpc-version")
	public void setRpcVersion(Integer rpcVersion) {
		this.rpcVersion = rpcVersion;
	}

	@JsonProperty("rpc-version-minimum")
	public Integer getRpcVersionMinimum() {
		return rpcVersionMinimum;
	}

	@JsonProperty("rpc-version-minimum")
	public void setRpcVersionMinimum(Integer rpcVersionMinimum) {
		this.rpcVersionMinimum = rpcVersionMinimum;
	}

	@JsonProperty("script-torrent-done-enabled")
	public Boolean getScriptTorrentDoneEnabled() {
		return scriptTorrentDoneEnabled;
	}

	@JsonProperty("script-torrent-done-enabled")
	public void setScriptTorrentDoneEnabled(Boolean scriptTorrentDoneEnabled) {
		this.scriptTorrentDoneEnabled = scriptTorrentDoneEnabled;
	}

	@JsonProperty("script-torrent-done-filename")
	public String getScriptTorrentDoneFilename() {
		return scriptTorrentDoneFilename;
	}

	@JsonProperty("script-torrent-done-filename")
	public void setScriptTorrentDoneFilename(String scriptTorrentDoneFilename) {
		this.scriptTorrentDoneFilename = scriptTorrentDoneFilename;
	}

	@JsonProperty("seed-queue-enabled")
	public Boolean getSeedQueueEnabled() {
		return seedQueueEnabled;
	}

	@JsonProperty("seed-queue-enabled")
	public void setSeedQueueEnabled(Boolean seedQueueEnabled) {
		this.seedQueueEnabled = seedQueueEnabled;
	}

	@JsonProperty("seed-queue-size")
	public Integer getSeedQueueSize() {
		return seedQueueSize;
	}

	@JsonProperty("seed-queue-size")
	public void setSeedQueueSize(Integer seedQueueSize) {
		this.seedQueueSize = seedQueueSize;
	}

	@JsonProperty("seedRatioLimit")
	public Integer getSeedRatioLimit() {
		return seedRatioLimit;
	}

	@JsonProperty("seedRatioLimit")
	public void setSeedRatioLimit(Integer seedRatioLimit) {
		this.seedRatioLimit = seedRatioLimit;
	}

	@JsonProperty("seedRatioLimited")
	public Boolean getSeedRatioLimited() {
		return seedRatioLimited;
	}

	@JsonProperty("seedRatioLimited")
	public void setSeedRatioLimited(Boolean seedRatioLimited) {
		this.seedRatioLimited = seedRatioLimited;
	}

	@JsonProperty("speed-limit-down")
	public Integer getSpeedLimitDown() {
		return speedLimitDown;
	}

	@JsonProperty("speed-limit-down")
	public void setSpeedLimitDown(Integer speedLimitDown) {
		this.speedLimitDown = speedLimitDown;
	}

	@JsonProperty("speed-limit-down-enabled")
	public Boolean getSpeedLimitDownEnabled() {
		return speedLimitDownEnabled;
	}

	@JsonProperty("speed-limit-down-enabled")
	public void setSpeedLimitDownEnabled(Boolean speedLimitDownEnabled) {
		this.speedLimitDownEnabled = speedLimitDownEnabled;
	}

	@JsonProperty("speed-limit-up")
	public Integer getSpeedLimitUp() {
		return speedLimitUp;
	}

	@JsonProperty("speed-limit-up")
	public void setSpeedLimitUp(Integer speedLimitUp) {
		this.speedLimitUp = speedLimitUp;
	}

	@JsonProperty("speed-limit-up-enabled")
	public Boolean getSpeedLimitUpEnabled() {
		return speedLimitUpEnabled;
	}

	@JsonProperty("speed-limit-up-enabled")
	public void setSpeedLimitUpEnabled(Boolean speedLimitUpEnabled) {
		this.speedLimitUpEnabled = speedLimitUpEnabled;
	}

	@JsonProperty("start-added-torrents")
	public Boolean getStartAddedTorrents() {
		return startAddedTorrents;
	}

	@JsonProperty("start-added-torrents")
	public void setStartAddedTorrents(Boolean startAddedTorrents) {
		this.startAddedTorrents = startAddedTorrents;
	}

	@JsonProperty("trash-original-torrent-files")
	public Boolean getTrashOriginalTorrentFiles() {
		return trashOriginalTorrentFiles;
	}

	@JsonProperty("trash-original-torrent-files")
	public void setTrashOriginalTorrentFiles(Boolean trashOriginalTorrentFiles) {
		this.trashOriginalTorrentFiles = trashOriginalTorrentFiles;
	}

	@JsonProperty("units")
	public Units getUnits() {
		return units;
	}

	@JsonProperty("units")
	public void setUnits(Units units) {
		this.units = units;
	}

	@JsonProperty("utp-enabled")
	public Boolean getUtpEnabled() {
		return utpEnabled;
	}

	@JsonProperty("utp-enabled")
	public void setUtpEnabled(Boolean utpEnabled) {
		this.utpEnabled = utpEnabled;
	}

	@JsonProperty("version")
	public String getVersion() {
		return version;
	}

	@JsonProperty("version")
	public void setVersion(String version) {
		this.version = version;
	}
}
