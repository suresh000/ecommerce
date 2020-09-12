package com.bjmasc.ecommerce.apiclient.categories;

import androidx.annotation.NonNull;

import com.bjmasc.ecommerce.apiclient.ApiError;
import com.bjmasc.ecommerce.apiclient.RetrofitClient;
import com.bjmasc.ecommerce.model.categories.CategoriesResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CategoriesApi {

    public void call(RetrofitClient.Listener<CategoriesResponse, ApiError> listener) {
        RetrofitClient.getInstance().getClient().categories().enqueue(new Callback<CategoriesResponse>() {
            @Override
            public void onResponse(@NonNull Call<CategoriesResponse> call, @NonNull Response<CategoriesResponse> response) {
                if (response.isSuccessful()) {
                    listener.onResponse(response.body());
                }
            }

            @Override
            public void onFailure(@NonNull Call<CategoriesResponse> call, @NonNull Throwable t) {

            }
        });
    }

}
