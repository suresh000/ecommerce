package com.bjmasc.ecommerce.home;

import android.app.Activity;
import android.view.View;

import com.bjmasc.ecommerce.AppNavigator;

public class HomeViewModel {

    private Activity mActivity;

    HomeViewModel(Activity activity) {
        mActivity = activity;
    }

    public void categoryClick(View view) {
        AppNavigator.navigateToCategoriesActivity(mActivity);
    }
}
