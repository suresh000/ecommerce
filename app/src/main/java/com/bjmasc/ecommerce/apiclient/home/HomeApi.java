package com.bjmasc.ecommerce.apiclient.home;

import androidx.annotation.NonNull;

import com.bjmasc.ecommerce.apiclient.ApiError;
import com.bjmasc.ecommerce.apiclient.RetrofitClient;
import com.bjmasc.ecommerce.model.home.HomeResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeApi {

    public void call(RetrofitClient.Listener<HomeResponse, ApiError> listener) {
        RetrofitClient.getInstance().getClient().home().enqueue(new Callback<HomeResponse>() {
            @Override
            public void onResponse(@NonNull Call<HomeResponse> call, @NonNull Response<HomeResponse> response) {
                if (response.isSuccessful()) {
                    listener.onResponse(response.body());
                }
            }

            @Override
            public void onFailure(@NonNull Call<HomeResponse> call, @NonNull Throwable t) {

            }
        });
    }

}
