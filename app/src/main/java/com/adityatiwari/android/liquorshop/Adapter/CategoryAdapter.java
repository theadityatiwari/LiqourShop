package com.adityatiwari.android.liquorshop.Adapter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.adityatiwari.android.liquorshop.R;
import com.adityatiwari.android.liquorshop.Utils.Category;
import com.bumptech.glide.Glide;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {
    Context context;
    List<Category> categories;

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public CategoryAdapter(Context context, List<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.category_layout,parent,false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {

        holder.name.setText(categories.get(position).getName());
        Glide.with(context).load(categories.get(position).getImageFullPath()).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class CategoryViewHolder  extends RecyclerView.ViewHolder {
        TextView name;
        ImageView image;
        View mView;


        public CategoryViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.category_title);
            image= itemView.findViewById(R.id.category_imageView);


        }
    }
}
