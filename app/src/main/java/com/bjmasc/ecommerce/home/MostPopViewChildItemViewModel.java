package com.bjmasc.ecommerce.home;

import android.content.Context;

import androidx.databinding.ObservableField;

import com.bjmasc.ecommerce.adapter.ViewModel;
import com.bjmasc.ecommerce.model.home.MostPopularViewed;

public class MostPopViewChildItemViewModel implements ViewModel {

    public final ObservableField<MostPopularViewed> mostPopularViewed = new ObservableField<>();

    MostPopViewChildItemViewModel(Context context, MostPopularViewed mostPopularViewed) {
        this.mostPopularViewed.set(mostPopularViewed);
    }

    @Override
    public void close() {

    }
}
