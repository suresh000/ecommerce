package com.bjmasc.ecommerce.dashboard;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.bjmasc.ecommerce.R;
import com.bjmasc.ecommerce.base.BaseActivity;
import com.bjmasc.ecommerce.home.HomeFragment;

public class DashboardActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_main);

        addFragment(HomeFragment.newInstance());
    }

    @Override
    public Fragment getCurrentFragment() {
        return null;
    }
}