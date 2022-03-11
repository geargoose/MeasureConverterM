package com.kotiumsoftware.measureconverterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;

public class ConverterActivity extends AppCompatActivity {

    Spinner inputSpinner, outputSpinner;
    EditText input, output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        inputSpinner = findViewById(R.id.spinnerInputPicker);
        outputSpinner = findViewById(R.id.spinnerOutputPicker);
        input = findViewById(R.id.fieldInputNumber);
        output = findViewById(R.id.fieldOutputNumber);

        switch (getIntent().getStringExtra("measure")) {
            case "length":
                inputSpinner.setAdapter();
                break;
            case "speed":
                break;
        }


    }
}