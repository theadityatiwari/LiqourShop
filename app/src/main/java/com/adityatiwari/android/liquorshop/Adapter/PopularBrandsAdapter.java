package com.adityatiwari.android.liquorshop.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.adityatiwari.android.liquorshop.R;
import com.adityatiwari.android.liquorshop.Utils.Category;
import com.adityatiwari.android.liquorshop.Utils.PopularBrand;
import com.bumptech.glide.Glide;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PopularBrandsAdapter extends RecyclerView.Adapter<PopularBrandsAdapter.PopularBrandsViewHolder>{


    Context context;
    List<PopularBrand> popularBrands;

    public void setPopularBrands(List<PopularBrand> popularBrands) {
        this.popularBrands = popularBrands;
    }

    public PopularBrandsAdapter(Context context, List<PopularBrand> popularBrands) {
        this.context = context;
        this.popularBrands = popularBrands;
    }

    @NonNull
    @Override
    public PopularBrandsAdapter.PopularBrandsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.popular_brands_layout,parent,false);
        return new PopularBrandsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularBrandsAdapter.PopularBrandsViewHolder holder, int position) {

        holder.name.setText(popularBrands.get(position).getName());
        Glide.with(context).load(popularBrands.get(position).getImageFullPath()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return popularBrands.size();
    }

    public class PopularBrandsViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name;
        public PopularBrandsViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.popular_brands_imageView);
            name = itemView.findViewById(R.id.popular_brands_title);

        }
    }
}
