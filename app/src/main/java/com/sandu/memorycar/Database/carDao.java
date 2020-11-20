package com.sandu.memorycar.Database;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@androidx.room.Dao
public interface carDao {
    @Query("SELECT * FROM CarDetails")
    List<CarDetails>getAll();

    @Insert
    void insertAll(CarDetails ... carDetails);
    @Delete
    void delete(CarDetails carDetails);

}
