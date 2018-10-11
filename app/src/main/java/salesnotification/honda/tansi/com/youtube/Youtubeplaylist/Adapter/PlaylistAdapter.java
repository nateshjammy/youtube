package salesnotification.honda.tansi.com.youtube.Youtubeplaylist.Adapter;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import salesnotification.honda.tansi.com.youtube.R;
import salesnotification.honda.tansi.com.youtube.Retrofit.Pojo.Myadapter;
import salesnotification.honda.tansi.com.youtube.Youtubeplaylist.Pojo.PlaylistPojo;

public class PlaylistAdapter extends RecyclerView.Adapter<PlaylistAdapter.MyViewHolder> {

    private PlaylistPojo playlistPojo;
    Context context;

    public PlaylistAdapter(Context context,PlaylistPojo list) {

        this.playlistPojo = list;
        this.context = context;

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.inflate_playlist,parent,false);
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position ) {


        holder.texttitle.setText(playlistPojo.getItems().get(position).getSnippet().getTitle());
        //holder.texttitle.setText(playlistPojo.getItems().get(position).getContentDetails().getUpload().getVideoId());
       // holder.texttitle.setText(playlistPojo.getItems().get(position).getContentDetails().getUpload().getVideoId());
        Glide.with(context).load(playlistPojo.getItems().get(position).getSnippet().getThumbnails().getMedium().getUrl())
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.imageview);



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String id = "t7mWJrNKDlU";

                Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + id));
                Intent webIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.youtube.com/watch?v=" + id));
                try {
                    context.startActivity(appIntent);
                } catch (ActivityNotFoundException ex) {
                    context.startActivity(webIntent);
                }

            }
        });

    }





    @Override
    public int getItemCount() {
        return playlistPojo.getItems().size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView texttitle;
        ImageView imageview;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            texttitle = (TextView) itemView.findViewById(R.id.texttitle);
            imageview = (ImageView) itemView.findViewById(R.id.imageview);

        }
    }

}

