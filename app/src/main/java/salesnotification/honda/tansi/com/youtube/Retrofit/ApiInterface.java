package salesnotification.honda.tansi.com.youtube.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import salesnotification.honda.tansi.com.youtube.Retrofit.Pojo.Mypojo;
import salesnotification.honda.tansi.com.youtube.Youtubeplaylist.Pojo.PlaylistPojo;

public interface ApiInterface {


//    @GET(URL.MYURL)
//    Call<ManiPOJO> getEnquiryList();
@GET(URL.MYURL)
Call<Mypojo> getEnquiryList(@Query("key") String key, @Query("textFormat") String textFormat, @Query("part") String part, @Query("videoId") String videoId, @Query("maxResults") String maxResults);

@GET(URL.PLAYLIST)
Call<PlaylistPojo> getplaylist(@Query("part") String part, @Query("channelId") String channelid, @Query("key") String key);


   // https://www.googleapis.com/youtube/v3/activities?
    //
    // maxResults=25&
    // channelId=UCVBYKN8gtRwPxGczoHdKPDA&
    // part=snippet%2CcontentDetails&key=AIzaSyAKaIDCwGIo-p2JzOSQYm0Oz7lJvLS6Yjw

}
