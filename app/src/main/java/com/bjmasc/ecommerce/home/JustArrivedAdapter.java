package com.bjmasc.ecommerce.home;

import com.bjmasc.ecommerce.R;
import com.bjmasc.ecommerce.adapter.DataBindingRecyclerViewAdapter;
import com.bjmasc.ecommerce.adapter.ViewModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JustArrivedAdapter extends DataBindingRecyclerViewAdapter {

    private Map<Class, Integer> mViewModelMap;

    JustArrivedAdapter(List<ViewModel> viewModels) {
        super(viewModels);
        mViewModelMap = new HashMap<>();
        mViewModelMap.put(JustArrivedChildItemViewModel.class, R.layout.just_arrived_child_item);
    }

    @Override
    public Map<Class, Integer> getViewModelLayoutMap() {
        return mViewModelMap;
    }

}
