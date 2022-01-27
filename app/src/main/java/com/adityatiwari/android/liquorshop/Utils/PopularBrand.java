
package com.adityatiwari.android.liquorshop.Utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PopularBrand {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image_path")
    @Expose
    private String imagePath;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("order_count")
    @Expose
    private String orderCount;
    @SerializedName("image_full_path")
    @Expose
    private String imageFullPath;

    public PopularBrand(String name,String imageFullPath) {
        this.name = name;
        this.imageFullPath = imageFullPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(String orderCount) {
        this.orderCount = orderCount;
    }

    public String getImageFullPath() {
        return imageFullPath;
    }

    public void setImageFullPath(String imageFullPath) {
        this.imageFullPath = imageFullPath;
    }

}
