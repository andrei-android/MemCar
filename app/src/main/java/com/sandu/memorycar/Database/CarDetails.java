package com.sandu.memorycar.Database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "CarDetails")
public class CarDetails {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public int mileage, oilChangeMiles, breakPadsChangeMiles;
    public String insDue, oilChangeDue;

    public CarDetails(int mileage, int oilChangeMiles, int breakPadsChangeMiles, String insDue, String oilChangeDue) {
        this.mileage = mileage;
        this.oilChangeMiles = oilChangeMiles;
        this.breakPadsChangeMiles = breakPadsChangeMiles;
        this.insDue = insDue;
        this.oilChangeDue = oilChangeDue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getOilChangeMiles() {
        return oilChangeMiles;
    }

    public void setOilChangeMiles(int oilChangeMiles) {
        this.oilChangeMiles = oilChangeMiles;
    }

    public int getBreakPadsChangeMiles() {
        return breakPadsChangeMiles;
    }

    public void setBreakPadsChangeMiles(int breakPadsChangeMiles) {
        this.breakPadsChangeMiles = breakPadsChangeMiles;
    }

    public String getInsDue() {
        return insDue;
    }

    public void setInsDue(String insDue) {
        this.insDue = insDue;
    }

    public String getOilChangeDue() {
        return oilChangeDue;
    }

    public void setOilChangeDue(String oilChangeDue) {
        this.oilChangeDue = oilChangeDue;
    }
}
