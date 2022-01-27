package com.adityatiwari.android.liquorshop.Utils;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ItemsApi {

    @GET("categories?lat=19.246717664168155&long=72.97480400651693")
    Call<Response> getAllResponse();

}
