package com.sandu.memorycar;

import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {CarDetails.class}, version = 1)
public abstract class Database extends RoomDatabase {
    public abstract carDao carDao();
}
