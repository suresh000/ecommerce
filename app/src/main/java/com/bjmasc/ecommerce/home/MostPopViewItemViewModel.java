package com.bjmasc.ecommerce.home;

import android.content.Context;

import androidx.databinding.ObservableField;

import com.bjmasc.ecommerce.adapter.ViewModel;
import com.bjmasc.ecommerce.model.home.MostPopularViewed;

import java.util.ArrayList;
import java.util.List;

public class MostPopViewItemViewModel implements ViewModel {

    public final ObservableField<MostPopViewAdapter> mostPopViewAdapter = new ObservableField<>();

    MostPopViewItemViewModel(Context context, List<MostPopularViewed> mostPopularViewedList) {

        List<ViewModel> viewModels = new ArrayList<>();
        for (MostPopularViewed mostPopularViewed : mostPopularViewedList) {
            viewModels.add(new MostPopViewChildItemViewModel(context, mostPopularViewed));
        }

        MostPopViewAdapter adapter = new MostPopViewAdapter(viewModels);

        mostPopViewAdapter.set(adapter);
    }

    @Override
    public void close() {

    }
}
