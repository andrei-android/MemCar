package com.sandu.memorycar.Database;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class VehicleRepository {
    private vehicleDao vDao;
    private LiveData<List<Vehicle>> allVehicles;

    VehicleRepository(Application application){
        VehicleDatabase db = VehicleDatabase.getDatabase(application);
        vDao = db.vehicleDao();
        allVehicles = vDao.getAllVehicles();
    }

    LiveData<List<Vehicle>>getAllVehicles(){
        return allVehicles;
    }

    public void insert (Vehicle vehicle){
        new insertAsyncTask(vDao).execute(vehicle);
    }

    private static class insertAsyncTask extends AsyncTask<Vehicle, Void, Void>{
        private vehicleDao asyncTaskDao;
        insertAsyncTask(vehicleDao dao){
            asyncTaskDao = dao;
        }
        @Override
        protected  Void doInBackground(final Vehicle... params){
            asyncTaskDao.insert(params[0]);
            return null;
        }
    }
}
