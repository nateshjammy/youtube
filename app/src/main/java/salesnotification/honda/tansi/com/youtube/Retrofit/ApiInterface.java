package salesnotification.honda.tansi.com.youtube.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import salesnotification.honda.tansi.com.youtube.Retrofit.Pojo.Mypojo;

public interface ApiInterface {


//    @GET(URL.MYURL)
//    Call<ManiPOJO> getEnquiryList();
@GET(URL.MYURL)
Call<Mypojo> getEnquiryList(@Query("key") String key, @Query("textFormat") String textFormat, @Query("part") String part, @Query("videoId") String videoId, @Query("maxResults") String maxResults);


}
