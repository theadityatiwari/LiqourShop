
package com.adityatiwari.android.liquorshop.Utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image_path")
    @Expose
    private String imagePath;
    @SerializedName("store_product_volume_id")
    @Expose
    private Integer storeProductVolumeId;
    @SerializedName("image_full_path")
    @Expose
    private String imageFullPath;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("volume")
    @Expose
    private String volume;
    @SerializedName("volume_id")
    @Expose
    private Integer volumeId;
    @SerializedName("available_quantity")
    @Expose
    private String availableQuantity;
    @SerializedName("order_count")
    @Expose
    private Integer orderCount;
    @SerializedName("best_dealer")
    @Expose
    private String bestDealer;
    @SerializedName("sub_category_id")
    @Expose
    private Integer subCategoryId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getStoreProductVolumeId() {
        return storeProductVolumeId;
    }

    public void setStoreProductVolumeId(Integer storeProductVolumeId) {
        this.storeProductVolumeId = storeProductVolumeId;
    }

    public String getImageFullPath() {
        return imageFullPath;
    }

    public void setImageFullPath(String imageFullPath) {
        this.imageFullPath = imageFullPath;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Integer getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(Integer volumeId) {
        this.volumeId = volumeId;
    }

    public String getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(String availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public String getBestDealer() {
        return bestDealer;
    }

    public void setBestDealer(String bestDealer) {
        this.bestDealer = bestDealer;
    }

    public Integer getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Integer subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

}
