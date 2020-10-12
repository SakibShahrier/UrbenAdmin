package com.nrahman171291.urbenagent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Objects.requireNonNull(this.getSupportActionBar()).hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        Button button_updateLocation = findViewById(R.id.button_updateLocation);
        button_updateLocation.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, UpdateBusLocation.class);
            startActivity(intent);
        });
        Button button_addDriver = findViewById(R.id.button_addDriver);
        button_addDriver.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AddDriver.class);
            startActivity(intent);
        });
        Button button_addCounter = findViewById(R.id.button_addCounter);
        button_addCounter.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AddCounter.class);
            startActivity(intent);
        });
        Button AddTicket = findViewById(R.id.button_addTicket);
        AddTicket.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AddTicket.class);
            startActivity(intent);
        });
        Button button_removePassenger =  findViewById(R.id.button_removePassenger);
        button_removePassenger.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, RemovePassenger.class);
            startActivity(intent);
        });
        Button removeDriver = findViewById(R.id.button_removeDriver);
        removeDriver.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, RemoveDriver.class);
            startActivity(intent);
        });
        Button button_addOffer = findViewById(R.id.button_addOffer);
        button_addOffer.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AddOffer.class);
            startActivity(intent);
        });
    }
}