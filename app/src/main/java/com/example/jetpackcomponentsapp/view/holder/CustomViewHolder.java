package com.example.jetpackcomponentsapp.view.holder;

import android.content.Context;
import android.view.View;

import com.example.jetpackcomponentsapp.databinding.CustomBinder;
import com.example.jetpackcomponentsapp.model.CustomModel;
import com.example.jetpackcomponentsapp.view.CustomListeners;

public class CustomViewHolder extends BaseViewHolder {

    private CustomBinder customBinder;

    public CustomViewHolder(Context context, CustomListeners customListeners, CustomBinder customBinder ) {
        super(context,customListeners,customBinder .getRoot());
        this.customBinder = customBinder;
    }

    @Override
    public void bindDataToViewHolder(final CustomModel item, final int position) {
        setId(item.getId());
        customBinder.imageView.setImageResource(item.getIcon());
        customBinder.buttonEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getListener().onUpdate(item,position);
            }
        });
        customBinder.buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getListener().onDelete(item,position);
            }
        });
    }
}
