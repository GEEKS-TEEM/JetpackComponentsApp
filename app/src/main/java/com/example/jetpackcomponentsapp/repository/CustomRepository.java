package com.example.jetpackcomponentsapp.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.jetpackcomponentsapp.model.CustomModel;
import com.example.jetpackcomponentsapp.room.CustomDAO;

import java.util.List;

public class CustomRepository implements BaseRepository {
    //Todo: Finish Code for CRUD methods
    private CustomDAO customDAO;

    private static CustomRepository INSTANCE;

    public static CustomRepository getInstance(Application applicationContext) {
        if (INSTANCE == null) {
            return new CustomRepository(applicationContext);
        }
        else {
            return INSTANCE;
        }
    }

    private CustomRepository(Application applicationContext) {

    }

    @Override
    public void insert(CustomModel customModel) {

    }

    @Override
    public void update(CustomModel customModel) {

    }

    @Override
    public void delete(CustomModel customModel) {

    }

    @Override
    public void deleteAll() {

    }

    public LiveData<List<CustomModel>> getAll() {
        return ConvertList.toLiveDataListModel(
                customDAO.getAll()
        );
    }
}
