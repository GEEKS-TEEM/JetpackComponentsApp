package com.example.jetpackcomponentsapp.repository;

import com.example.jetpackcomponentsapp.model.CustomModel;

public interface BaseRepository {

    void insert(CustomModel customModel);

    void update(CustomModel customModel);

    void delete(CustomModel customModel);

    void deleteAll();
}
