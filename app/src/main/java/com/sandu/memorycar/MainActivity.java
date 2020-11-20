package com.sandu.memorycar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

import com.sandu.memorycar.Database.Database;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Database db = Room.databaseBuilder(getApplicationContext(), Database.class, "CarDetails").build();
    }
}