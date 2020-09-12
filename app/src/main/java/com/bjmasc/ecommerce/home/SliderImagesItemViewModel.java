package com.bjmasc.ecommerce.home;

import android.content.Context;

import androidx.databinding.ObservableField;

import com.bjmasc.ecommerce.adapter.ViewModel;
import com.bjmasc.ecommerce.model.home.SliderImage;

import java.util.ArrayList;
import java.util.List;

public class SliderImagesItemViewModel implements ViewModel {

    public final ObservableField<SliderImagesAdapter> sliderImagesAdapter = new ObservableField<>();

    SliderImagesItemViewModel(Context context, List<SliderImage> sliderImageList) {

        List<ViewModel> viewModels = new ArrayList<>();
        for (SliderImage sliderImage : sliderImageList) {
            viewModels.add(new SliderImagesChildItemViewModel(context, sliderImage));
        }

        SliderImagesAdapter adapter = new SliderImagesAdapter(viewModels);

        sliderImagesAdapter.set(adapter);
    }

    @Override
    public void close() {

    }
}
