package com.bjmasc.ecommerce.categories;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.bjmasc.ecommerce.R;
import com.bjmasc.ecommerce.base.BaseActivity;
import com.bjmasc.ecommerce.databinding.ActivityCategoriesBinding;

public class CategoriesActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCategoriesBinding binding = DataBindingUtil.setContentView(this,
                R.layout.activity_categories);

        CategoriesViewModel viewModel = new CategoriesViewModel(this, binding.expandableListView);
        binding.setVm(viewModel);

        binding.toolbar.setNavigationIcon(R.drawable.ic_close);
        binding.toolbar.setNavigationOnClickListener(view1 -> finish());
    }

    @Override
    public Fragment getCurrentFragment() {
        return null;
    }
}