package com.sandu.memorycar.Database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "vehicle_table")
public class Vehicle {

    @PrimaryKey(autoGenerate = true)
    private int ID;

    String vehicleName, vehicleCurrentMile, vehicleImage;

    public Vehicle(String vehicleName, String vehicleCurrentMile, String vehicleImage) {
        this.vehicleName = vehicleName;
        this.vehicleCurrentMile = vehicleCurrentMile;
        this.vehicleImage = vehicleImage;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleCurrentMile() {
        return vehicleCurrentMile;
    }

    public void setVehicleCurrentMile(String vehicleCurrentMile) {
        this.vehicleCurrentMile = vehicleCurrentMile;
    }

    public String getVehicleImage() {
        return vehicleImage;
    }

    public void setVehicleImage(String vehicleImage) {
        this.vehicleImage = vehicleImage;
    }
}
