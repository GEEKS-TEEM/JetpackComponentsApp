package com.example.jetpackcomponentsapp.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jetpackcomponentsapp.R;
import com.example.jetpackcomponentsapp.databinding.CustomBinder;
import com.example.jetpackcomponentsapp.model.CustomModel;
import com.example.jetpackcomponentsapp.view.CustomListeners;
import com.example.jetpackcomponentsapp.view.holder.CustomViewHolder;

import java.util.ArrayList;
import java.util.List;


public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    private Context context;
    private CustomListeners customListeners;

    private CustomBinder customBinder;


    private List<CustomModel> list = new ArrayList<>();

    public CustomAdapter(Context context,CustomListeners customListeners) {
        this.context = context;
        this.customListeners = customListeners;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        customBinder = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.item_sample,
                parent,
                false
                );
        return new CustomViewHolder(context,customListeners,customBinder);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        customBinder.setCustomModel(list.get(position));
        holder.bindDataToViewHolder(list.get(position),position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setItems(List<CustomModel> items) {
        list.clear();
        list.addAll(items);
        notifyDataSetChanged();
    }
}
