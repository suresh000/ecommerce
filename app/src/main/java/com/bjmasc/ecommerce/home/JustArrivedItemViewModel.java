package com.bjmasc.ecommerce.home;

import android.content.Context;

import androidx.databinding.ObservableField;

import com.bjmasc.ecommerce.adapter.ViewModel;
import com.bjmasc.ecommerce.model.home.JustArrived;

import java.util.ArrayList;
import java.util.List;

public class JustArrivedItemViewModel implements ViewModel {

    public final ObservableField<JustArrivedAdapter> justArrivedAdapter = new ObservableField<>();

    JustArrivedItemViewModel(Context context, List<JustArrived> justArrivedList) {

        List<ViewModel> viewModels = new ArrayList<>();
        for (JustArrived justArrived : justArrivedList) {
            viewModels.add(new JustArrivedChildItemViewModel(context, justArrived));
        }

        JustArrivedAdapter adapter = new JustArrivedAdapter(viewModels);

        justArrivedAdapter.set(adapter);
    }

    @Override
    public void close() {

    }
}
