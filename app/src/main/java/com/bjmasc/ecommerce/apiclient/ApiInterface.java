package com.bjmasc.ecommerce.apiclient;

import com.bjmasc.ecommerce.BuildConfig;
import com.bjmasc.ecommerce.model.categories.CategoriesResponse;
import com.bjmasc.ecommerce.model.home.HomeResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    String BASE_URL = BuildConfig.BASE_URL;

    @GET(BASE_URL + "get_home_content")
    Call<HomeResponse> home();

    @GET(BASE_URL + "get_categories")
    Call<CategoriesResponse> categories();

}
