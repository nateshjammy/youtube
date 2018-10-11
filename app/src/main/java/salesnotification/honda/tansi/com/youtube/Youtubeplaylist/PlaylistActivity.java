package salesnotification.honda.tansi.com.youtube.Youtubeplaylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import salesnotification.honda.tansi.com.youtube.R;
import salesnotification.honda.tansi.com.youtube.Retrofit.ApiClient;
import salesnotification.honda.tansi.com.youtube.Retrofit.ApiInterface;
import salesnotification.honda.tansi.com.youtube.Youtubeplaylist.Adapter.PlaylistAdapter;
import salesnotification.honda.tansi.com.youtube.Youtubeplaylist.Pojo.PlaylistPojo;

public class PlaylistActivity extends AppCompatActivity {

    PlaylistAdapter playlistAdapter;
    private ApiInterface apiInterface;
    private RecyclerView recyclerView;
    PlaylistPojo playlistPojo;
    private FrameLayout frame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);



        recyclerView = (RecyclerView) findViewById(R.id.playlist);
        frame = (FrameLayout) findViewById(R.id.frame);
        frame.setVisibility(View.VISIBLE);

        getpaserr();

    }

    private void getpaserr() {


        String part = "snippet";
        String channelId  = "UCVBYKN8gtRwPxGczoHdKPDA";
        String key = "AIzaSyAKaIDCwGIo-p2JzOSQYm0Oz7lJvLS6Yjw";

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        apiInterface.getplaylist(part,channelId,key).enqueue(new Callback<PlaylistPojo>() {
            @Override
            public void onResponse(Call<PlaylistPojo> call, Response<PlaylistPojo> response) {
                try {
                    frame.setVisibility(View.GONE);
                    playlistPojo =  response.body();
                    playlistAdapter= new PlaylistAdapter(PlaylistActivity.this,playlistPojo);
                    recyclerView.setHasFixedSize(true);
                    LinearLayoutManager layoutManager = new LinearLayoutManager(
                            PlaylistActivity.this);
                    recyclerView.setLayoutManager(layoutManager);
                    recyclerView.setAdapter(playlistAdapter);



                } catch (Throwable e) {

                    Toast.makeText(PlaylistActivity.this,"Unable to connect server"+ e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                }
            }


            @Override
            public void onFailure(Call<PlaylistPojo> call, Throwable t) {

                Toast.makeText(PlaylistActivity.this,"Unable to connect server"+ t.getLocalizedMessage(),Toast.LENGTH_LONG).show();

            }


        });

    }

}
