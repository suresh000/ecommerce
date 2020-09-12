package com.bjmasc.ecommerce.home;

import com.bjmasc.ecommerce.R;
import com.bjmasc.ecommerce.adapter.DataBindingRecyclerViewAdapter;
import com.bjmasc.ecommerce.adapter.ViewModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeAdapter extends DataBindingRecyclerViewAdapter {

    private Map<Class, Integer> mViewModelMap;

    HomeAdapter(List<ViewModel> viewModels) {
        super(viewModels);
        mViewModelMap = new HashMap<>();
        mViewModelMap.put(BannerItemViewModel.class, R.layout.banner_item);
        mViewModelMap.put(JustArrivedItemViewModel.class, R.layout.just_arrived_item);
    }

    @Override
    public Map<Class, Integer> getViewModelLayoutMap() {
        return mViewModelMap;
    }

    void addViewModels(List<ViewModel> viewModels) {
        mViewModels = viewModels;
        notifyDataSetChanged();
    }

}
