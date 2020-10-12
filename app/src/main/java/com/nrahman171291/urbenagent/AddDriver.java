package com.nrahman171291.urbenagent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

public class AddDriver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Objects.requireNonNull(this.getSupportActionBar()).hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_add_driver);

        EditText input_driverEmail = findViewById(R.id.input_driverEmail);
        EditText input_driverLatitude = findViewById(R.id.input_driverLatitude);
        EditText input_driverLongitude = findViewById(R.id.input_driverLongitude);

        Button button_submit_addDriver = findViewById(R.id.button_submit_addDriver);
        button_submit_addDriver.setOnClickListener(view -> {
            String driverEmail = input_driverEmail.getText().toString();
            double driverLatitude = Double.parseDouble(input_driverLatitude.getText().toString());
            double driverLongitude = Double.parseDouble(input_driverLongitude.getText().toString());

            updateDB(driverEmail, driverLatitude, driverLongitude);
        });
    }

    private void updateDB(String driverEmail, double driverLatitude, double driverLongitude) {
        // Update DB Here
    }
}