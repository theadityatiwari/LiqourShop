
package com.adityatiwari.android.liquorshop.Utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Banner {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("image_path")
    @Expose
    private String imagePath;
    @SerializedName("image_name")
    @Expose
    private String imageName;
    @SerializedName("product_id")
    @Expose
    private Integer productId;
    @SerializedName("store_id")
    @Expose
    private Integer storeId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("product_img_path")
    @Expose
    private String productImgPath;
    @SerializedName("is_range")
    @Expose
    private Integer isRange;
    @SerializedName("image_full_path")
    @Expose
    private String imageFullPath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductImgPath() {
        return productImgPath;
    }

    public void setProductImgPath(String productImgPath) {
        this.productImgPath = productImgPath;
    }

    public Integer getIsRange() {
        return isRange;
    }

    public void setIsRange(Integer isRange) {
        this.isRange = isRange;
    }

    public String getImageFullPath() {
        return imageFullPath;
    }

    public void setImageFullPath(String imageFullPath) {
        this.imageFullPath = imageFullPath;
    }

}
