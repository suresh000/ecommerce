package com.bjmasc.ecommerce.categories;

import android.content.Context;

import androidx.databinding.ObservableField;

import com.bjmasc.ecommerce.adapter.ViewModel;
import com.bjmasc.ecommerce.model.categories.Category;

import java.util.List;

public class CategoriesItemViewModel implements ViewModel {

    public final ObservableField<CategoriesExpandableAdapter> categoriesExpandableAdapter = new ObservableField<>();

    CategoriesItemViewModel(Context context, List<Category> categories) {

    }

    @Override
    public void close() {

    }
}
