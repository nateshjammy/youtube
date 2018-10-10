package salesnotification.honda.tansi.com.youtube.Retrofit.Pojo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import salesnotification.honda.tansi.com.youtube.R;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewHolder> {

    private ManiPOJO mypojo;
    public Myadapter(ManiPOJO list){

        this.mypojo=list;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.inflate_items,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position ) {

        holder.nName.setText(mypojo.getItems().get(position).getSnippet().getTopLevelComment().getSnippet().getTextDisplay());
        holder.NLEmailID.setText(mypojo.getItems().get(position).getSnippet().getTopLevelComment().getSnippet().getUpdatedAt());


    }


    @Override
    public int getItemCount() {
       //return mypojo.getPageInfo().get(0).details.get(0).data.size();
        return mypojo.getItems().size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView nName,NLEmailID;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nName = (TextView) itemView.findViewById(R.id.NLName);
            NLEmailID = (TextView) itemView.findViewById(R.id.NLEmailID);

        }
    }
}

