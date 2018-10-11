package salesnotification.honda.tansi.com.youtube.Youtubeplaylist.Pojo;

import java.util.ArrayList;

public class PlaylistPojo {


    private String kind;

    public String getKind() { return this.kind; }

    public void setKind(String kind) { this.kind = kind; }

    private String etag;

    public String getEtag() { return this.etag; }

    public void setEtag(String etag) { this.etag = etag; }

    private String nextPageToken;

    public String getNextPageToken() { return this.nextPageToken; }

    public void setNextPageToken(String nextPageToken) { this.nextPageToken = nextPageToken; }

    private PageInfo pageInfo;

    public PageInfo getPageInfo() { return this.pageInfo; }

    public void setPageInfo(PageInfo pageInfo) { this.pageInfo = pageInfo; }

    private ArrayList<Item> items;

    public ArrayList<Item> getItems() { return this.items; }

    public void setItems(ArrayList<Item> items) { this.items = items; }

    public class PageInfo
    {
        private int totalResults;

        public int getTotalResults() { return this.totalResults; }

        public void setTotalResults(int totalResults) { this.totalResults = totalResults; }

        private int resultsPerPage;

        public int getResultsPerPage() { return this.resultsPerPage; }

        public void setResultsPerPage(int resultsPerPage) { this.resultsPerPage = resultsPerPage; }
    }
    public class Default
    {
        private String url;

        public String getUrl() { return this.url; }

        public void setUrl(String url) { this.url = url; }

        private int width;

        public int getWidth() { return this.width; }

        public void setWidth(int width) { this.width = width; }

        private int height;

        public int getHeight() { return this.height; }

        public void setHeight(int height) { this.height = height; }
    }

    public class Medium
    {
        private String url;

        public String getUrl() { return this.url; }

        public void setUrl(String url) { this.url = url; }

        private int width;

        public int getWidth() { return this.width; }

        public void setWidth(int width) { this.width = width; }

        private int height;

        public int getHeight() { return this.height; }

        public void setHeight(int height) { this.height = height; }
    }

    public class High
    {
        private String url;

        public String getUrl() { return this.url; }

        public void setUrl(String url) { this.url = url; }

        private int width;

        public int getWidth() { return this.width; }

        public void setWidth(int width) { this.width = width; }

        private int height;

        public int getHeight() { return this.height; }

        public void setHeight(int height) { this.height = height; }
    }

    public class Standard
    {
        private String url;

        public String getUrl() { return this.url; }

        public void setUrl(String url) { this.url = url; }

        private int width;

        public int getWidth() { return this.width; }

        public void setWidth(int width) { this.width = width; }

        private int height;

        public int getHeight() { return this.height; }

        public void setHeight(int height) { this.height = height; }
    }

    public class Maxres
    {
        private String url;

        public String getUrl() { return this.url; }

        public void setUrl(String url) { this.url = url; }

        private int width;

        public int getWidth() { return this.width; }

        public void setWidth(int width) { this.width = width; }

        private int height;

        public int getHeight() { return this.height; }

        public void setHeight(int height) { this.height = height; }
    }

    public class Thumbnails
    {
//        private Default default;
//
//        public Default getDefault() { return this.default; }
//
//        public void setDefault(Default default) { this.default = default; }

        private Medium medium;

        public Medium getMedium() { return this.medium; }

        public void setMedium(Medium medium) { this.medium = medium; }

        private High high;

        public High getHigh() { return this.high; }

        public void setHigh(High high) { this.high = high; }

        private Standard standard;

        public Standard getStandard() { return this.standard; }

        public void setStandard(Standard standard) { this.standard = standard; }

        private Maxres maxres;

        public Maxres getMaxres() { return this.maxres; }

        public void setMaxres(Maxres maxres) { this.maxres = maxres; }
    }

    public class Snippet
    {
        private String publishedAt;

        public String getPublishedAt() { return this.publishedAt; }

        public void setPublishedAt(String publishedAt) { this.publishedAt = publishedAt; }

        private String channelId;

        public String getChannelId() { return this.channelId; }

        public void setChannelId(String channelId) { this.channelId = channelId; }

        private String title;

        public String getTitle() { return this.title; }

        public void setTitle(String title) { this.title = title; }

        private String description;

        public String getDescription() { return this.description; }

        public void setDescription(String description) { this.description = description; }

        private Thumbnails thumbnails;

        public Thumbnails getThumbnails() { return this.thumbnails; }

        public void setThumbnails(Thumbnails thumbnails) { this.thumbnails = thumbnails; }

        private String channelTitle;

        public String getChannelTitle() { return this.channelTitle; }

        public void setChannelTitle(String channelTitle) { this.channelTitle = channelTitle; }

        private String type;

        public String getType() { return this.type; }

        public void setType(String type) { this.type = type; }
    }

    public class Upload
    {
        private String videoId;

        public String getVideoId() { return this.videoId; }

        public void setVideoId(String videoId) { this.videoId = videoId; }
    }

    public class ContentDetails
    {
        private Upload upload;

        public Upload getUpload() { return this.upload; }

        public void setUpload(Upload upload) { this.upload = upload; }
    }

    public class Item
    {
        private String kind;

        public String getKind() { return this.kind; }

        public void setKind(String kind) { this.kind = kind; }

        private String etag;

        public String getEtag() { return this.etag; }

        public void setEtag(String etag) { this.etag = etag; }

        private String id;

        public String getId() { return this.id; }

        public void setId(String id) { this.id = id; }

        private Snippet snippet;

        public Snippet getSnippet() { return this.snippet; }

        public void setSnippet(Snippet snippet) { this.snippet = snippet; }

        private ContentDetails contentDetails;

        public ContentDetails getContentDetails() { return this.contentDetails; }

        public void setContentDetails(ContentDetails contentDetails) { this.contentDetails = contentDetails; }
    }

//    private String kind;
//
//    public String getKind() { return this.kind; }
//
//    public void setKind(String kind) { this.kind = kind; }
//
//    private String etag;
//
//    public String getEtag() { return this.etag; }
//
//    public void setEtag(String etag) { this.etag = etag; }
//
//    private String nextPageToken;
//
//    public String getNextPageToken() { return this.nextPageToken; }
//
//    public void setNextPageToken(String nextPageToken) { this.nextPageToken = nextPageToken; }
//
//    private PageInfo pageInfo;
//
//    public PageInfo getPageInfo() { return this.pageInfo; }
//
//    public void setPageInfo(PageInfo pageInfo) { this.pageInfo = pageInfo; }
//
//    private ArrayList<Item> items;
//
//    public ArrayList<Item> getItems() { return this.items; }
//
//    public void setItems(ArrayList<Item> items) { this.items = items; }
//
//    public class PageInfo
//    {
//        private int totalResults;
//
//        public int getTotalResults() { return this.totalResults; }
//
//        public void setTotalResults(int totalResults) { this.totalResults = totalResults; }
//
//        private int resultsPerPage;
//
//        public int getResultsPerPage() { return this.resultsPerPage; }
//
//        public void setResultsPerPage(int resultsPerPage) { this.resultsPerPage = resultsPerPage; }
//    }
//
//    public class Default
//    {
//        private String url;
//
//        public String getUrl() { return this.url; }
//
//        public void setUrl(String url) { this.url = url; }
//
//        private int width;
//
//        public int getWidth() { return this.width; }
//
//        public void setWidth(int width) { this.width = width; }
//
//        private int height;
//
//        public int getHeight() { return this.height; }
//
//        public void setHeight(int height) { this.height = height; }
//    }
//
//    public class Medium
//    {
//        private String url;
//
//        public String getUrl() { return this.url; }
//
//        public void setUrl(String url) { this.url = url; }
//
//        private int width;
//
//        public int getWidth() { return this.width; }
//
//        public void setWidth(int width) { this.width = width; }
//
//        private int height;
//
//        public int getHeight() { return this.height; }
//
//        public void setHeight(int height) { this.height = height; }
//    }
//
//    public class High
//    {
//        private String url;
//
//        public String getUrl() { return this.url; }
//
//        public void setUrl(String url) { this.url = url; }
//
//        private int width;
//
//        public int getWidth() { return this.width; }
//
//        public void setWidth(int width) { this.width = width; }
//
//        private int height;
//
//        public int getHeight() { return this.height; }
//
//        public void setHeight(int height) { this.height = height; }
//    }
//
//    public class Standard
//    {
//        private String url;
//
//        public String getUrl() { return this.url; }
//
//        public void setUrl(String url) { this.url = url; }
//
//        private int width;
//
//        public int getWidth() { return this.width; }
//
//        public void setWidth(int width) { this.width = width; }
//
//        private int height;
//
//        public int getHeight() { return this.height; }
//
//        public void setHeight(int height) { this.height = height; }
//    }
//
//    public class Maxres
//    {
//        private String url;
//
//        public String getUrl() { return this.url; }
//
//        public void setUrl(String url) { this.url = url; }
//
//        private int width;
//
//        public int getWidth() { return this.width; }
//
//        public void setWidth(int width) { this.width = width; }
//
//        private int height;
//
//        public int getHeight() { return this.height; }
//
//        public void setHeight(int height) { this.height = height; }
//    }
//
//    public class Thumbnails
//    {
////        private String default;
////
////        public Default getDefault() { return default; }
////
////        public void setDefault(String default) { this.default = default; }
//
//        private Medium medium;
//
//        public Medium getMedium() { return this.medium; }
//
//        public void setMedium(Medium medium) { this.medium = medium; }
//
//        private High high;
//
//        public High getHigh() { return this.high; }
//
//        public void setHigh(High high) { this.high = high; }
//
//        private Standard standard;
//
//        public Standard getStandard() { return this.standard; }
//
//        public void setStandard(Standard standard) { this.standard = standard; }
//
//        private Maxres maxres;
//
//        public Maxres getMaxres() { return this.maxres; }
//
//        public void setMaxres(Maxres maxres) { this.maxres = maxres; }
//    }
//
//    public class Localized
//    {
//        private String title;
//
//        public String getTitle() { return this.title; }
//
//        public void setTitle(String title) { this.title = title; }
//
//        private String description;
//
//        public String getDescription() { return this.description; }
//
//        public void setDescription(String description) { this.description = description; }
//    }
//
//    public class Snippet
//    {
//        private String publishedAt;
//
//        public String getPublishedAt() { return this.publishedAt; }
//
//        public void setPublishedAt(String publishedAt) { this.publishedAt = publishedAt; }
//
//        private String channelId;
//
//        public String getChannelId() { return this.channelId; }
//
//        public void setChannelId(String channelId) { this.channelId = channelId; }
//
//        private String title;
//
//        public String getTitle() { return this.title; }
//
//        public void setTitle(String title) { this.title = title; }
//
//        private String description;
//
//        public String getDescription() { return this.description; }
//
//        public void setDescription(String description) { this.description = description; }
//
//        private Thumbnails thumbnails;
//
//        public Thumbnails getThumbnails() { return this.thumbnails; }
//
//        public void setThumbnails(Thumbnails thumbnails) { this.thumbnails = thumbnails; }
//
//        private String channelTitle;
//
//        public String getChannelTitle() { return this.channelTitle; }
//
//        public void setChannelTitle(String channelTitle) { this.channelTitle = channelTitle; }
//
//        private Localized localized;
//
//        public Localized getLocalized() { return this.localized; }
//
//        public void setLocalized(Localized localized) { this.localized = localized; }
//    }
//
//    public class Item
//    {
//        private String kind;
//
//        public String getKind() { return this.kind; }
//
//        public void setKind(String kind) { this.kind = kind; }
//
//        private String etag;
//
//        public String getEtag() { return this.etag; }
//
//        public void setEtag(String etag) { this.etag = etag; }
//
//        private String id;
//
//        public String getId() { return this.id; }
//
//        public void setId(String id) { this.id = id; }
//
//        private Snippet snippet;
//
//        public Snippet getSnippet() { return this.snippet; }
//
//        public void setSnippet(Snippet snippet) { this.snippet = snippet; }
//    }

}
