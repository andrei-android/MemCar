package com.sandu.memorycar.Database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface vehicleDao {

    @Insert
    void insert (Vehicle vehicle);

    @Query("DELETE FROM vehicle_table")
    void deleteAll();

    @Query("SELECT * from vehicle_table ORDER BY ID ASC")
    LiveData<List<Vehicle>>getAllVehicles();
}
