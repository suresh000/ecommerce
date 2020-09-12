package com.bjmasc.ecommerce.home;

import android.content.Context;

import androidx.databinding.ObservableField;

import com.bjmasc.ecommerce.adapter.ViewModel;
import com.bjmasc.ecommerce.model.home.Banner;

import java.util.ArrayList;
import java.util.List;

public class BannerItemViewModel implements ViewModel {

    public final ObservableField<BannerAdapter> bannerAdapter = new ObservableField<>();

    BannerItemViewModel(Context context, List<Banner> banners) {

        List<ViewModel> viewModels = new ArrayList<>();
        for (Banner banner : banners) {
            viewModels.add(new BannerChildItemViewModel(context, banner));
        }

        BannerAdapter adapter = new BannerAdapter(viewModels);

        bannerAdapter.set(adapter);
    }

    @Override
    public void close() {

    }
}
