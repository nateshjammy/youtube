package salesnotification.honda.tansi.com.youtube.Retrofit.Pojo;


import android.icu.util.Output;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Mypojo {


    public class PageInfo
    {
        private int totalResults;

        public int getTotalResults() { return this.totalResults; }

        public void setTotalResults(int totalResults) { this.totalResults = totalResults; }

        private int resultsPerPage;

        public int getResultsPerPage() { return this.resultsPerPage; }

        public void setResultsPerPage(int resultsPerPage) { this.resultsPerPage = resultsPerPage; }
    }

    public class AuthorChannelId
    {
        private String value;

        public String getValue() { return this.value; }

        public void setValue(String value) { this.value = value; }
    }

    public class Snippet2
    {
        private String authorDisplayName;

        public String getAuthorDisplayName() { return this.authorDisplayName; }

        public void setAuthorDisplayName(String authorDisplayName) { this.authorDisplayName = authorDisplayName; }

        private String authorProfileImageUrl;

        public String getAuthorProfileImageUrl() { return this.authorProfileImageUrl; }

        public void setAuthorProfileImageUrl(String authorProfileImageUrl) { this.authorProfileImageUrl = authorProfileImageUrl; }

        private String authorChannelUrl;

        public String getAuthorChannelUrl() { return this.authorChannelUrl; }

        public void setAuthorChannelUrl(String authorChannelUrl) { this.authorChannelUrl = authorChannelUrl; }

        private AuthorChannelId authorChannelId;

        public AuthorChannelId getAuthorChannelId() { return this.authorChannelId; }

        public void setAuthorChannelId(AuthorChannelId authorChannelId) { this.authorChannelId = authorChannelId; }

        private String videoId;

        public String getVideoId() { return this.videoId; }

        public void setVideoId(String videoId) { this.videoId = videoId; }

        private String textDisplay;

        public String getTextDisplay() { return this.textDisplay; }

        public void setTextDisplay(String textDisplay) { this.textDisplay = textDisplay; }

        private String textOriginal;

        public String getTextOriginal() { return this.textOriginal; }

        public void setTextOriginal(String textOriginal) { this.textOriginal = textOriginal; }

        private boolean canRate;

        public boolean getCanRate() { return this.canRate; }

        public void setCanRate(boolean canRate) { this.canRate = canRate; }

        private String viewerRating;

        public String getViewerRating() { return this.viewerRating; }

        public void setViewerRating(String viewerRating) { this.viewerRating = viewerRating; }

        private int likeCount;

        public int getLikeCount() { return this.likeCount; }

        public void setLikeCount(int likeCount) { this.likeCount = likeCount; }

        private String publishedAt;

        public String getPublishedAt() { return this.publishedAt; }

        public void setPublishedAt(String publishedAt) { this.publishedAt = publishedAt; }

        private String updatedAt;

        public String getUpdatedAt() { return this.updatedAt; }

        public void setUpdatedAt(String updatedAt) { this.updatedAt = updatedAt; }
    }

    public class TopLevelComment
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

        private Snippet2 snippet;

        public Snippet2 getSnippet() { return this.snippet; }

        public void setSnippet(Snippet2 snippet) { this.snippet = snippet; }
    }

    public class Snippet
    {
        private String videoId;

        public String getVideoId() { return this.videoId; }

        public void setVideoId(String videoId) { this.videoId = videoId; }

        private TopLevelComment topLevelComment;

        public TopLevelComment getTopLevelComment() { return this.topLevelComment; }

        public void setTopLevelComment(TopLevelComment topLevelComment) { this.topLevelComment = topLevelComment; }

        private boolean canReply;

        public boolean getCanReply() { return this.canReply; }

        public void setCanReply(boolean canReply) { this.canReply = canReply; }

        private int totalReplyCount;

        public int getTotalReplyCount() { return this.totalReplyCount; }

        public void setTotalReplyCount(int totalReplyCount) { this.totalReplyCount = totalReplyCount; }

        private boolean isPublic;

        public boolean getIsPublic() { return this.isPublic; }

        public void setIsPublic(boolean isPublic) { this.isPublic = isPublic; }
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
    }


    private String kind;

    public String getKind() { return this.kind; }

    public void setKind(String kind) { this.kind = kind; }

    private String etag;

    public String getEtag() { return this.etag; }

    public void setEtag(String etag) { this.etag = etag; }

    private PageInfo pageInfo;

    public PageInfo getPageInfo() { return this.pageInfo; }

    public void setPageInfo(PageInfo pageInfo) { this.pageInfo = pageInfo; }

    private ArrayList<Item> items;

    public ArrayList<Item> getItems() { return this.items; }

    public void setItems(ArrayList<Item> items) { this.items = items; }



}
