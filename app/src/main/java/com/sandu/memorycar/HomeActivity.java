package com.sandu.memorycar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeActivity extends AppCompatActivity {

    ImageView profile_image;
    TextView profile_name;
    RecyclerView recyclerView;
    FloatingActionButton add_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //FullSCreenActivity
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //

        profile_image = findViewById(R.id.profile_image);
        profile_name = findViewById(R.id.profile_name);
        recyclerView = findViewById(R.id.recyclerView);
        add_btn = findViewById(R.id.add_btn);


    }
}