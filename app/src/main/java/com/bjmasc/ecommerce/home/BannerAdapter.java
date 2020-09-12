package com.bjmasc.ecommerce.home;

import com.bjmasc.ecommerce.R;
import com.bjmasc.ecommerce.adapter.DataBindingRecyclerViewAdapter;
import com.bjmasc.ecommerce.adapter.ViewModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BannerAdapter extends DataBindingRecyclerViewAdapter {

    private Map<Class, Integer> mViewModelMap;

    BannerAdapter(List<ViewModel> viewModels) {
        super(viewModels);
        mViewModelMap = new HashMap<>();
        mViewModelMap.put(BannerChildItemViewModel.class, R.layout.banner_child_item);
    }

    @Override
    public Map<Class, Integer> getViewModelLayoutMap() {
        return mViewModelMap;
    }

}
