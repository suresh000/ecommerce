package com.bjmasc.ecommerce.home;

import android.content.Context;

import androidx.databinding.ObservableField;

import com.bjmasc.ecommerce.adapter.ViewModel;
import com.bjmasc.ecommerce.model.home.Banner;

public class BannerChildItemViewModel implements ViewModel {

    public final ObservableField<Banner> banner = new ObservableField<>();

    BannerChildItemViewModel(Context context, Banner banner) {
        this.banner.set(banner);
    }

    @Override
    public void close() {

    }
}
