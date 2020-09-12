package com.bjmasc.ecommerce.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.bjmasc.ecommerce.R;
import com.bjmasc.ecommerce.base.BaseFragment;
import com.bjmasc.ecommerce.databinding.FragmentHomeBinding;

public class HomeFragment extends BaseFragment {

    public HomeFragment() {}

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentHomeBinding binding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_home, container, false);

        HomeViewModel viewModel = new HomeViewModel(getActivity());
        binding.setVm(viewModel);

        return binding.getRoot();
    }

    @Override
    public Fragment getCurrentFragment() {
        return null;
    }
}