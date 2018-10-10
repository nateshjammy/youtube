package salesnotification.honda.tansi.com.youtube.Retrofit;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import salesnotification.honda.tansi.com.youtube.Retrofit.Pojo.ManiPOJO;
import salesnotification.honda.tansi.com.youtube.Retrofit.Pojo.Mypojo;

public interface ApiInterface {


    @GET(URL.MYURL)
    Call<ManiPOJO> getEnquiryList();

}
