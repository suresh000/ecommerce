package com.bjmasc.ecommerce.home;

import com.bjmasc.ecommerce.R;
import com.bjmasc.ecommerce.adapter.DataBindingRecyclerViewAdapter;
import com.bjmasc.ecommerce.adapter.ViewModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SliderImagesAdapter extends DataBindingRecyclerViewAdapter {

    private Map<Class, Integer> mViewModelMap;

    SliderImagesAdapter(List<ViewModel> viewModels) {
        super(viewModels);
        mViewModelMap = new HashMap<>();
        mViewModelMap.put(SliderImagesChildItemViewModel.class, R.layout.slider_images_child_item);
    }

    @Override
    public Map<Class, Integer> getViewModelLayoutMap() {
        return mViewModelMap;
    }

}
