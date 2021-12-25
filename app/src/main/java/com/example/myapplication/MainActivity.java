package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import com.example.myapplication.model.System;


public class MainActivity extends AppCompatActivity {

    ImageButton btnSystem;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnSystem = findViewById(R.id.btn_buka_operating_system);
        button = findViewById(R.id.dialog_button);
        btnSystem.setOnClickListener(view -> bukaOperatingSystemActivity());
        button.setOnClickListener(view -> MainActivity2());
    }


    private void bukaOperatingSystemActivity() {
        Log.d("MAIN","Buka activity System");
        Intent intent = new Intent(this, OperatingSystemActivity.class);
        startActivity(intent);
    }

    private void MainActivity2() {
        Log.d("MAIN","Buka Activity 2");
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }


}