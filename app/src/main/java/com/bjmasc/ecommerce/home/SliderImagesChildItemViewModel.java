package com.bjmasc.ecommerce.home;

import android.content.Context;

import androidx.databinding.ObservableField;

import com.bjmasc.ecommerce.adapter.ViewModel;
import com.bjmasc.ecommerce.model.home.SliderImage;

public class SliderImagesChildItemViewModel implements ViewModel {

    public final ObservableField<SliderImage> sliderImage = new ObservableField<>();

    SliderImagesChildItemViewModel(Context context, SliderImage sliderImage) {
        this.sliderImage.set(sliderImage);
    }

    @Override
    public void close() {

    }
}
