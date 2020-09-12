package com.bjmasc.ecommerce.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bjmasc.ecommerce.BR;

import java.util.List;
import java.util.Map;

public abstract class DataBindingRecyclerViewAdapter extends RecyclerView.Adapter<DataBindingRecyclerViewHolder> {

    protected List<ViewModel> mViewModels;

    public DataBindingRecyclerViewAdapter(List<ViewModel> viewModels) {
        try {
            this.mViewModels = viewModels;
            onViewModelListChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public DataBindingRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(viewType, parent, false);

        return new DataBindingRecyclerViewHolder<>(DataBindingUtil.bind(v));
    }

    @Override
    public void onBindViewHolder(DataBindingRecyclerViewHolder holder, int position) {
        holder.getBinding().setVariable(BR.vm, mViewModels.get(position));
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemViewType(int position) {
        return getViewModelLayoutMap().get(mViewModels.get(position).getClass());
    }

    @Override
    public int getItemCount() {
        return mViewModels == null ? 0 : mViewModels.size();
    }

    public abstract Map<Class, Integer> getViewModelLayoutMap();

    public void onViewModelListChanged() {
        notifyDataSetChanged();
    }
}