package com.adityatiwari.android.liquorshop.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.adityatiwari.android.liquorshop.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BannerAdapter extends RecyclerView.Adapter<BannerAdapter.ViewHolder> {
    // creating variables for array list and context.
    private ArrayList<String> bannerList;
    private Context context;

    // creating a constructor.
    public BannerAdapter(ArrayList<String> bannerList, Context context) {
        this.bannerList = bannerList;
        this.context = context;
    }

    @NonNull
    @Override
    public BannerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // inflating our layout file on below line.
        View view = LayoutInflater.from(context).inflate(R.layout.banner_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BannerAdapter.ViewHolder holder, int position) {
        // setting data to all our views.
        Glide.with(context).load(bannerList.get(position)).into(holder.bannerIV);

    }

    @Override
    public int getItemCount() {
        return bannerList.size();
    }

    public void setBannerList(ArrayList<String> bannerList) {
        this.bannerList = bannerList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // creating variables for our views
        // which are created in layout file.
        private CardView imageCV;
        private ImageView bannerIV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // initializing all the variables.
            bannerIV = itemView.findViewById(R.id.imageView1);
        }
    }
}
