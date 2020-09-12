package com.bjmasc.ecommerce.home;

import android.content.Context;

import androidx.databinding.ObservableField;

import com.bjmasc.ecommerce.adapter.ViewModel;
import com.bjmasc.ecommerce.model.home.JustArrived;

public class JustArrivedChildItemViewModel implements ViewModel {

    public final ObservableField<JustArrived> justArrived = new ObservableField<>();

    JustArrivedChildItemViewModel(Context context, JustArrived justArrived) {
        this.justArrived.set(justArrived);
    }

    @Override
    public void close() {

    }
}
