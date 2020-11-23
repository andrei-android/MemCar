package com.sandu.memorycar.Database;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class VehicleViewModel extends AndroidViewModel {
    private VehicleRepository repository;
    private LiveData<List<Vehicle>>allVehicles;

    public VehicleViewModel(@NonNull Application application) {
        super(application);

        repository = new VehicleRepository(application);
        allVehicles = repository.getAllVehicles();
    }
    LiveData<List<Vehicle>> getAllVehicles(){
        return allVehicles;
    }

    public void insert(Vehicle vehicle){repository.insert(vehicle);}
}
