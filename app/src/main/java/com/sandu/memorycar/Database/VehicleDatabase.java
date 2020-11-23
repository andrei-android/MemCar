package com.sandu.memorycar.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Vehicle.class}, version = 1, exportSchema = false)
public abstract class VehicleDatabase extends RoomDatabase {
    public abstract vehicleDao vehicleDao();
    private static VehicleDatabase INSTANCE;

    static VehicleDatabase getDatabase(final Context context){
        if (INSTANCE ==null){
            synchronized (VehicleDatabase.class){
                if (INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),VehicleDatabase.class, "vehicle_database")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }return INSTANCE;
    }
}
