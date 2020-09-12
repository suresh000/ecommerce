package com.bjmasc.ecommerce.util.binding;

import android.text.TextUtils;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class BindingUtil {

    private static final String SET_EXPANDABLE_ADAPTER = "setExpandableAdapter";
    private static final String SET_LOAD_IMAGE = "loadImage";
    private static final String SET_HORIZONTAL_RECYCLER_VIEW_ADAPTER = "setHorizontalRecyclerViewAdapter";

    @BindingAdapter({SET_EXPANDABLE_ADAPTER})
    public static void setExpandableAdapter(@NonNull ExpandableListView expandableListView,
                                           BaseExpandableListAdapter adapter) {
        if (adapter != null) {
            expandableListView.setAdapter(adapter);
        }
    }

    @BindingAdapter({SET_LOAD_IMAGE})
    public static void loadImage(@NonNull ImageView imageView,
                                            String url) {
        if (!TextUtils.isEmpty(url)) {
            Picasso.get().load(url).into(imageView);
        }
    }

    @BindingAdapter({SET_HORIZONTAL_RECYCLER_VIEW_ADAPTER})
    public static void setHorizontalRecyclerViewAdapter(@NonNull RecyclerView recyclerView,
                                                        RecyclerView.Adapter adapter) {
        if (adapter != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(),
                    RecyclerView.HORIZONTAL, false));
            recyclerView.setAdapter(adapter);
        }
    }

}
