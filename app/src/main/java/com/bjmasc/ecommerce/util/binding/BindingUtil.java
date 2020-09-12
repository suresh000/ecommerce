package com.bjmasc.ecommerce.util.binding;

import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;

import androidx.annotation.NonNull;
import androidx.databinding.BindingAdapter;

public class BindingUtil {

    private static final String SET_EXPANDABLE_ADAPTER = "setExpandableAdapter";

    @BindingAdapter({SET_EXPANDABLE_ADAPTER})
    public static void setExpandableAdapter(@NonNull ExpandableListView expandableListView,
                                           BaseExpandableListAdapter adapter) {
        if (adapter != null) {
            expandableListView.setAdapter(adapter);
        }
    }

}
