
package com.adityatiwari.android.liquorshop.Utils;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("popular_brands")
    @Expose
    private List<PopularBrand> popularBrands = null;
    @SerializedName("Category")
    @Expose
    private List<Category> category = null;
    @SerializedName("Banner")
    @Expose
    private List<Banner> banner = null;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("cart_count")
    @Expose
    private Integer cartCount;
    @SerializedName("return_sub_category_data")
    @Expose
    private List<ReturnSubCategoryDatum> returnSubCategoryData = null;

    public List<PopularBrand> getPopularBrands() {
        return popularBrands;
    }

    public void setPopularBrands(List<PopularBrand> popularBrands) {
        this.popularBrands = popularBrands;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public List<Banner> getBanner() {
        return banner;
    }

    public void setBanner(List<Banner> banner) {
        this.banner = banner;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getCartCount() {
        return cartCount;
    }

    public void setCartCount(Integer cartCount) {
        this.cartCount = cartCount;
    }

    public List<ReturnSubCategoryDatum> getReturnSubCategoryData() {
        return returnSubCategoryData;
    }

    public void setReturnSubCategoryData(List<ReturnSubCategoryDatum> returnSubCategoryData) {
        this.returnSubCategoryData = returnSubCategoryData;
    }

}
