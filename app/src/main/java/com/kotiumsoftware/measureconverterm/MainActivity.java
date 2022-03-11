package com.kotiumsoftware.measureconverterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    Button lengthBtn, speedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lengthBtn = findViewById(R.id.gotoLengthBtn);
        speedBtn = findViewById(R.id.gotoSpeedBtn);

        lengthBtn.setOnClickListener(view -> {
            Intent i = new Intent(this, ConverterActivity.class);
            i.putExtra("measure", SI.LENGTH);
            startActivity(i);
        });

        speedBtn.setOnClickListener(view -> {
            Intent i = new Intent(this, ConverterActivity.class);
            i.putExtra("measure", SI.LENGTH);
            startActivity(i);
        });
    }
}