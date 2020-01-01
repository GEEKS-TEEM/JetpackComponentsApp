package com.example.jetpackcomponentsapp.view.holder;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jetpackcomponentsapp.model.CustomModel;
import com.example.jetpackcomponentsapp.view.CustomListeners;

abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    /**Main */
    private Context context;
    private CustomListeners customListeners;
    /**Data */
    private int id;

    public BaseViewHolder(Context context, CustomListeners customListeners, @NonNull View itemView) {
        super(itemView);
        this.context = context;
        this.customListeners = customListeners;
    }

    void setId(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }

    Context getContext() {
        return context;
    }

    CustomListeners getListener() {
        return customListeners;
    }

    abstract public void bindDataToViewHolder(CustomModel item, int position);
}
