package com.example.jetpackcomponentsapp.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(
        entities = {CustomEntity.class},
        version = 1
)
public abstract class CustomDatabase extends RoomDatabase {

}
