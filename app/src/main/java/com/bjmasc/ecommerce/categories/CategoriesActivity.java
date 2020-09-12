package com.bjmasc.ecommerce.categories;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.bjmasc.ecommerce.R;
import com.bjmasc.ecommerce.base.BaseActivity;

public class CategoriesActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
    }

    @Override
    public Fragment getCurrentFragment() {
        return null;
    }
}