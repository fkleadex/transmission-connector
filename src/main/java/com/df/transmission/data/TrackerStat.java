package com.df.transmission.data;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "announce",
    "announceState",
    "downloadCount",
    "hasAnnounced",
    "hasScraped",
    "host",
    "id",
    "isBackup",
    "lastAnnouncePeerCount",
    "lastAnnounceResult",
    "lastAnnounceStartTime",
    "lastAnnounceSucceeded",
    "lastAnnounceTime",
    "lastAnnounceTimedOut",
    "lastScrapeResult",
    "lastScrapeStartTime",
    "lastScrapeSucceeded",
    "lastScrapeTime",
    "lastScrapeTimedOut",
    "leecherCount",
    "nextAnnounceTime",
    "nextScrapeTime",
    "scrape",
    "scrapeState",
    "seederCount",
    "tier"
})
public class TrackerStat {

    @JsonProperty("announce")
    private String announce;
    @JsonProperty("announceState")
    private Integer announceState;
    @JsonProperty("downloadCount")
    private Integer downloadCount;
    @JsonProperty("hasAnnounced")
    private Boolean hasAnnounced;
    @JsonProperty("hasScraped")
    private Boolean hasScraped;
    @JsonProperty("host")
    private String host;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("isBackup")
    private Boolean isBackup;
    @JsonProperty("lastAnnouncePeerCount")
    private Integer lastAnnouncePeerCount;
    @JsonProperty("lastAnnounceResult")
    private String lastAnnounceResult;
    @JsonProperty("lastAnnounceStartTime")
    private Integer lastAnnounceStartTime;
    @JsonProperty("lastAnnounceSucceeded")
    private Boolean lastAnnounceSucceeded;
    @JsonProperty("lastAnnounceTime")
    private Integer lastAnnounceTime;
    @JsonProperty("lastAnnounceTimedOut")
    private Boolean lastAnnounceTimedOut;
    @JsonProperty("lastScrapeResult")
    private String lastScrapeResult;
    @JsonProperty("lastScrapeStartTime")
    private Integer lastScrapeStartTime;
    @JsonProperty("lastScrapeSucceeded")
    private Boolean lastScrapeSucceeded;
    @JsonProperty("lastScrapeTime")
    private Long lastScrapeTime;
    @JsonProperty("lastScrapeTimedOut")
    private Boolean lastScrapeTimedOut;
    @JsonProperty("leecherCount")
    private Integer leecherCount;
    @JsonProperty("nextAnnounceTime")
    private Integer nextAnnounceTime;
    @JsonProperty("nextScrapeTime")
    private Long nextScrapeTime;
    @JsonProperty("scrape")
    private String scrape;
    @JsonProperty("scrapeState")
    private Integer scrapeState;
    @JsonProperty("seederCount")
    private Integer seederCount;
    @JsonProperty("tier")
    private Integer tier;

    @JsonProperty("announce")
    public String getAnnounce() {
        return announce;
    }

    @JsonProperty("announce")
    public void setAnnounce(String announce) {
        this.announce = announce;
    }

    @JsonProperty("announceState")
    public Integer getAnnounceState() {
        return announceState;
    }

    @JsonProperty("announceState")
    public void setAnnounceState(Integer announceState) {
        this.announceState = announceState;
    }

    @JsonProperty("downloadCount")
    public Integer getDownloadCount() {
        return downloadCount;
    }

    @JsonProperty("downloadCount")
    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    @JsonProperty("hasAnnounced")
    public Boolean getHasAnnounced() {
        return hasAnnounced;
    }

    @JsonProperty("hasAnnounced")
    public void setHasAnnounced(Boolean hasAnnounced) {
        this.hasAnnounced = hasAnnounced;
    }

    @JsonProperty("hasScraped")
    public Boolean getHasScraped() {
        return hasScraped;
    }

    @JsonProperty("hasScraped")
    public void setHasScraped(Boolean hasScraped) {
        this.hasScraped = hasScraped;
    }

    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    @JsonProperty("host")
    public void setHost(String host) {
        this.host = host;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("isBackup")
    public Boolean getIsBackup() {
        return isBackup;
    }

    @JsonProperty("isBackup")
    public void setIsBackup(Boolean isBackup) {
        this.isBackup = isBackup;
    }

    @JsonProperty("lastAnnouncePeerCount")
    public Integer getLastAnnouncePeerCount() {
        return lastAnnouncePeerCount;
    }

    @JsonProperty("lastAnnouncePeerCount")
    public void setLastAnnouncePeerCount(Integer lastAnnouncePeerCount) {
        this.lastAnnouncePeerCount = lastAnnouncePeerCount;
    }

    @JsonProperty("lastAnnounceResult")
    public String getLastAnnounceResult() {
        return lastAnnounceResult;
    }

    @JsonProperty("lastAnnounceResult")
    public void setLastAnnounceResult(String lastAnnounceResult) {
        this.lastAnnounceResult = lastAnnounceResult;
    }

    @JsonProperty("lastAnnounceStartTime")
    public Integer getLastAnnounceStartTime() {
        return lastAnnounceStartTime;
    }

    @JsonProperty("lastAnnounceStartTime")
    public void setLastAnnounceStartTime(Integer lastAnnounceStartTime) {
        this.lastAnnounceStartTime = lastAnnounceStartTime;
    }

    @JsonProperty("lastAnnounceSucceeded")
    public Boolean getLastAnnounceSucceeded() {
        return lastAnnounceSucceeded;
    }

    @JsonProperty("lastAnnounceSucceeded")
    public void setLastAnnounceSucceeded(Boolean lastAnnounceSucceeded) {
        this.lastAnnounceSucceeded = lastAnnounceSucceeded;
    }

    @JsonProperty("lastAnnounceTime")
    public Integer getLastAnnounceTime() {
        return lastAnnounceTime;
    }

    @JsonProperty("lastAnnounceTime")
    public void setLastAnnounceTime(Integer lastAnnounceTime) {
        this.lastAnnounceTime = lastAnnounceTime;
    }

    @JsonProperty("lastAnnounceTimedOut")
    public Boolean getLastAnnounceTimedOut() {
        return lastAnnounceTimedOut;
    }

    @JsonProperty("lastAnnounceTimedOut")
    public void setLastAnnounceTimedOut(Boolean lastAnnounceTimedOut) {
        this.lastAnnounceTimedOut = lastAnnounceTimedOut;
    }

    @JsonProperty("lastScrapeResult")
    public String getLastScrapeResult() {
        return lastScrapeResult;
    }

    @JsonProperty("lastScrapeResult")
    public void setLastScrapeResult(String lastScrapeResult) {
        this.lastScrapeResult = lastScrapeResult;
    }

    @JsonProperty("lastScrapeStartTime")
    public Integer getLastScrapeStartTime() {
        return lastScrapeStartTime;
    }

    @JsonProperty("lastScrapeStartTime")
    public void setLastScrapeStartTime(Integer lastScrapeStartTime) {
        this.lastScrapeStartTime = lastScrapeStartTime;
    }

    @JsonProperty("lastScrapeSucceeded")
    public Boolean getLastScrapeSucceeded() {
        return lastScrapeSucceeded;
    }

    @JsonProperty("lastScrapeSucceeded")
    public void setLastScrapeSucceeded(Boolean lastScrapeSucceeded) {
        this.lastScrapeSucceeded = lastScrapeSucceeded;
    }

    @JsonProperty("lastScrapeTime")
    public Long getLastScrapeTime() {
        return lastScrapeTime;
    }

    @JsonProperty("lastScrapeTime")
    public void setLastScrapeTime(Long lastScrapeTime) {
        this.lastScrapeTime = lastScrapeTime;
    }

    @JsonProperty("lastScrapeTimedOut")
    public Boolean getLastScrapeTimedOut() {
        return lastScrapeTimedOut;
    }

    @JsonProperty("lastScrapeTimedOut")
    public void setLastScrapeTimedOut(Boolean lastScrapeTimedOut) {
        this.lastScrapeTimedOut = lastScrapeTimedOut;
    }

    @JsonProperty("leecherCount")
    public Integer getLeecherCount() {
        return leecherCount;
    }

    @JsonProperty("leecherCount")
    public void setLeecherCount(Integer leecherCount) {
        this.leecherCount = leecherCount;
    }

    @JsonProperty("nextAnnounceTime")
    public Integer getNextAnnounceTime() {
        return nextAnnounceTime;
    }

    @JsonProperty("nextAnnounceTime")
    public void setNextAnnounceTime(Integer nextAnnounceTime) {
        this.nextAnnounceTime = nextAnnounceTime;
    }

    @JsonProperty("nextScrapeTime")
    public Long getNextScrapeTime() {
        return nextScrapeTime;
    }

    @JsonProperty("nextScrapeTime")
    public void setNextScrapeTime(Long nextScrapeTime) {
        this.nextScrapeTime = nextScrapeTime;
    }

    @JsonProperty("scrape")
    public String getScrape() {
        return scrape;
    }

    @JsonProperty("scrape")
    public void setScrape(String scrape) {
        this.scrape = scrape;
    }

    @JsonProperty("scrapeState")
    public Integer getScrapeState() {
        return scrapeState;
    }

    @JsonProperty("scrapeState")
    public void setScrapeState(Integer scrapeState) {
        this.scrapeState = scrapeState;
    }

    @JsonProperty("seederCount")
    public Integer getSeederCount() {
        return seederCount;
    }

    @JsonProperty("seederCount")
    public void setSeederCount(Integer seederCount) {
        this.seederCount = seederCount;
    }

    @JsonProperty("tier")
    public Integer getTier() {
        return tier;
    }

    @JsonProperty("tier")
    public void setTier(Integer tier) {
        this.tier = tier;
    }

}
