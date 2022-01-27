package com.adityatiwari.android.liquorshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.adityatiwari.android.liquorshop.Adapter.BannerAdapter;
import com.adityatiwari.android.liquorshop.Adapter.CategoryAdapter;
import com.adityatiwari.android.liquorshop.Adapter.PopularBrandsAdapter;
import com.adityatiwari.android.liquorshop.Utils.Banner;
import com.adityatiwari.android.liquorshop.Utils.Category;
import com.adityatiwari.android.liquorshop.Utils.ItemsApi;
import com.adityatiwari.android.liquorshop.Utils.PopularBrand;
import com.adityatiwari.android.liquorshop.Utils.Response;
import com.adityatiwari.android.liquorshop.Utils.RetrofitApiClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    private ArrayList<String> bannerList;
    private List<Category> categories;
    private List<PopularBrand> popularBrands;
    RecyclerView recyclerViewBanner,recyclerViewCategory,recyclerViewPopularBrands;
    BannerAdapter bannerAdapter;
    CategoryAdapter categoryAdapter;
    PopularBrandsAdapter popularBrandsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bannerList = new ArrayList<>();
        categories = new ArrayList<>();
        popularBrands = new ArrayList<>();
        recyclerViewBanner = findViewById(R.id.imageSlider);
        recyclerViewCategory = findViewById(R.id.category);
        recyclerViewPopularBrands = findViewById(R.id.popular_brands_recyclerview);

        bannerAdapter = new BannerAdapter(bannerList,this);
        categoryAdapter = new CategoryAdapter(this,categories);
        popularBrandsAdapter = new PopularBrandsAdapter(this,popularBrands);
        recyclerViewBanner.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewCategory.setLayoutManager(new GridLayoutManager(this,4));
        recyclerViewPopularBrands.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));




        //Getting response from server
        ItemsApi itemsApi = RetrofitApiClient.getClient().create(ItemsApi.class);

        Call<Response> call = itemsApi.getAllResponse();

        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {

                Log.d(TAG,"Response is " + response.body().getData().getBanner().get(0).getImageName());


                //for getting banner image
                for (int j = 0; j < response.body().getData().getBanner().size(); j++) {
                    String imgUrl = response.body().getData().getBanner().get(j).getProductImgPath();
                    bannerList.add(imgUrl);
                }
                recyclerViewBanner.setAdapter(bannerAdapter);
                bannerAdapter.setBannerList(bannerList);


                //For getting category
                for (int j = 0; j < response.body().getData().getCategory().size(); j++) {
                    String name = response.body().getData().getCategory().get(j).getName();
                    String imgUrl = response.body().getData().getCategory().get(j).getImageFullPath();
                    Category category = new Category(name,imgUrl);
                    categories.add(category);
                }
                recyclerViewCategory.setAdapter(categoryAdapter);
                categoryAdapter.setCategories(categories);



                //For getting Popular brands
                for (int j = 0; j < response.body().getData().getPopularBrands().size(); j++) {
                    String name = response.body().getData().getPopularBrands().get(j).getName();
                    String imgUrl = response.body().getData().getPopularBrands().get(j).getImageFullPath();
                    PopularBrand popularBrand = new PopularBrand(name,imgUrl);
                    popularBrands.add(popularBrand);
                }
                recyclerViewPopularBrands.setAdapter(popularBrandsAdapter);
                popularBrandsAdapter.setPopularBrands(popularBrands);


                //For Sectioned item
                for (int j = 0; j < response.body().getData().getReturnSubCategoryData().size(); j++) {
                    String sectionName = response.body().getData().getReturnSubCategoryData().get(j).getName();

                    for (int i = 0; i < response.body().getData().getReturnSubCategoryData().get(j).getData(); i++) {

                    }



                }



                }


            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                Log.e(TAG,"failed while getting response",t);
            }
        });


    }
}