package com.bjmasc.ecommerce.categories;

import com.bjmasc.ecommerce.R;
import com.bjmasc.ecommerce.adapter.DataBindingRecyclerViewAdapter;
import com.bjmasc.ecommerce.adapter.ViewModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoriesAdapter extends DataBindingRecyclerViewAdapter {

    private Map<Class, Integer> mViewModelMap;

    CategoriesAdapter(List<ViewModel> viewModels) {
        super(viewModels);
        mViewModelMap = new HashMap<>();
        mViewModelMap.put(CategoriesItemViewModel.class, R.layout.category_item);
    }

    @Override
    public Map<Class, Integer> getViewModelLayoutMap() {
        return mViewModelMap;
    }

}
