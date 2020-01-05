package com.example.jetpackcomponentsapp.room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface CustomDAO {

    @Insert
    void insert(CustomEntity customEntity);

    @Update
    void update(CustomEntity customEntity);

    //@Delete
    //fun delete(CustomEntity customEntity);

    @Query("DELETE FROM custom_table WHERE Id = :id")
    void delete(int id);

    @Query("DELETE FROM custom_table")
    void deleteAll();

    @Query("SELECT * FROM custom_table")
    LiveData<List<CustomEntity>> getAll();
}
