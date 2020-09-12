package com.bjmasc.ecommerce.home;

import android.app.Activity;
import android.app.ProgressDialog;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bjmasc.ecommerce.AppNavigator;
import com.bjmasc.ecommerce.adapter.ViewModel;
import com.bjmasc.ecommerce.apiclient.ApiError;
import com.bjmasc.ecommerce.apiclient.RetrofitClient;
import com.bjmasc.ecommerce.apiclient.home.HomeApi;
import com.bjmasc.ecommerce.base.BaseViewModel;
import com.bjmasc.ecommerce.model.home.HomeResponse;

import java.util.ArrayList;
import java.util.List;

public class HomeViewModel extends BaseViewModel {

    private Activity mActivity;
    private final HomeAdapter adapter = new HomeAdapter(new ArrayList<>());

    HomeViewModel(Activity activity, RecyclerView recyclerView) {
        super(activity);
        mActivity = activity;

        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setAdapter(adapter);

        homeApi();
    }

    public void categoryClick(View view) {
        AppNavigator.navigateToCategoriesActivity(mActivity);
    }

    private void homeApi() {
        ProgressDialog progressDialog = showProgressDialog("Please wait...");
        HomeApi api = new HomeApi();
        api.call(new RetrofitClient.Listener<HomeResponse, ApiError>() {
            @Override
            public void onResponse(HomeResponse response) {
                progressDialog.dismiss();

                List<ViewModel> viewModels = new ArrayList<>();

                viewModels.add(new BannerItemViewModel(mActivity, response.getBanners()));
                viewModels.add(new JustArrivedItemViewModel(mActivity, response.getJust_arrived()));
                viewModels.add(new MostPopViewItemViewModel(mActivity, response.getMost_popular_viewed()));

                adapter.addViewModels(viewModels);
            }

            @Override
            public void onError(ApiError error) {
                progressDialog.dismiss();
            }
        });
    }
}
