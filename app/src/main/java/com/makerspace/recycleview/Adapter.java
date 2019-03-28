package com.makerspace.recycleview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    Context mContext;
    List<Item> mData;

    public Adapter(Context mContext, List<Item> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(R.layout.card_item, viewGroup, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.cardBackground.setImageResource(mData.get(i).getImageBackground());
        myViewHolder.profileImage.setImageResource(mData.get(i).getImageProfile());
        myViewHolder.tvAmount.setText(mData.get(i).getEarned());
        myViewHolder.tvCardTitle.setText(mData.get(i).getTitle());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView cardBackground, profileImage;
        TextView tvAmount, tvCardTitle;
        Button btnRun;


        public MyViewHolder(View itemView){
            super(itemView);

            cardBackground = itemView.findViewById(R.id.card_background);
            profileImage = itemView.findViewById(R.id.img_profile);
            tvAmount = itemView.findViewById(R.id.tv_card_amount);
            tvCardTitle = itemView.findViewById(R.id.tv_card_title);
            btnRun = itemView.findViewById(R.id.btn_run);
            btnRun.setOnClickListener(this);
            MyViewHolder myholder = this;

        }

        @Override
        public void onClick(View v) {
            Intent runActivity = new Intent(mContext, RunActivity.class);

            int position = getLayoutPosition();
            String message = "";

            //set message by position
            switch (position){
                case 0: message = "animal"; break;
                case 1: message = "kids"; break;
                case 2: message = "air"; break;
                case 3: message = "grandma"; break;
            }
            runActivity.putExtra("clickedItemInList",message);
            mContext.startActivity(runActivity);
        }
    }
}
