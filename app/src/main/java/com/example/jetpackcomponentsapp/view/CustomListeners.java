package com.example.jetpackcomponentsapp.view;

import com.example.jetpackcomponentsapp.model.CustomModel;

public interface CustomListeners {

    void onUpdate(CustomModel item, int position);

    void onDelete(CustomModel item, int position);
}
