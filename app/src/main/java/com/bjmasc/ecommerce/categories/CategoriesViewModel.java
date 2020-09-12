package com.bjmasc.ecommerce.categories;

import android.app.ProgressDialog;
import android.content.Context;

import com.bjmasc.ecommerce.apiclient.ApiError;
import com.bjmasc.ecommerce.apiclient.RetrofitClient;
import com.bjmasc.ecommerce.apiclient.categories.CategoriesApi;
import com.bjmasc.ecommerce.base.BaseViewModel;
import com.bjmasc.ecommerce.model.categories.CategoriesResponse;

public class CategoriesViewModel extends BaseViewModel {

    protected CategoriesViewModel(Context context) {
        super(context);

        categoryApi();
    }

    private void categoryApi() {
        ProgressDialog progressDialog = showProgressDialog("Please wait...");
        CategoriesApi api = new CategoriesApi();
        api.call(new RetrofitClient.Listener<CategoriesResponse, ApiError>() {
            @Override
            public void onResponse(CategoriesResponse response) {
                progressDialog.dismiss();
            }

            @Override
            public void onError(ApiError error) {
                progressDialog.dismiss();
            }
        });
    }

}
