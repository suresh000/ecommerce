package com.bjmasc.ecommerce.apiclient;

import com.bjmasc.ecommerce.BuildConfig;
import com.bjmasc.ecommerce.model.categories.CategoriesResponse;
import com.bjmasc.ecommerce.model.home.HomeResponse;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    String BASE_URL = BuildConfig.BASE_URL;

    @POST(BASE_URL + "get_home_content")
    Call<HomeResponse> home(@Body JsonObject postParams);

    @GET(BASE_URL + "get_categories")
    Call<CategoriesResponse> categories();

}
