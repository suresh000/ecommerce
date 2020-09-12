package com.bjmasc.ecommerce.home;

import com.bjmasc.ecommerce.R;
import com.bjmasc.ecommerce.adapter.DataBindingRecyclerViewAdapter;
import com.bjmasc.ecommerce.adapter.ViewModel;
import com.bjmasc.ecommerce.empty.EmptyItemViewModel;

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
        mViewModelMap.put(MostPopViewItemViewModel.class, R.layout.most_popular_viewed_item);
        mViewModelMap.put(SliderImagesItemViewModel.class, R.layout.slider_images_item);
        mViewModelMap.put(EmptyItemViewModel.class, R.layout.empty_item);
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
