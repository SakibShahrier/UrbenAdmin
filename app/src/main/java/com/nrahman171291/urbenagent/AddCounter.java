package com.nrahman171291.urbenagent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

public class AddCounter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Objects.requireNonNull(this.getSupportActionBar()).hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_add_counter);

        EditText input_counterName = findViewById(R.id.input_counterName);
        EditText input_counterLatitude = findViewById(R.id.input_counterLatitude);
        EditText input_counterLongitude = findViewById(R.id.input_counterLongitude);

        Button button_submit_addCounter = findViewById(R.id.button_submit_addCounter);
        button_submit_addCounter.setOnClickListener(view -> {
            String counterName = input_counterName.getText().toString();
            double counterLatitude = Double.parseDouble(input_counterLatitude.getText().toString());
            double counterLongitude = Double.parseDouble(input_counterLongitude.getText().toString());

            updateDB(counterName, counterLatitude, counterLongitude);
        });
    }

    private void updateDB(String counterName, double counterLatitude, double counterLongitude) {
        // Update DB Here
    }
}