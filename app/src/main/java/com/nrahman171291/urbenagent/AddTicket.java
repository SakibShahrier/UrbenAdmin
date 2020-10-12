package com.nrahman171291.urbenagent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

public class AddTicket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Objects.requireNonNull(this.getSupportActionBar()).hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_add_ticket);

        EditText input_passengerEmail = findViewById(R.id.input_passengerEmail);
        EditText input_PassengerLocation = findViewById(R.id.input_PassengerLocation);

        Button button_submit_addTicket = findViewById(R.id.button_submit_addTicket);
        button_submit_addTicket.setOnClickListener(view -> {
            String passengerEmail = input_passengerEmail.getText().toString();
            String passengerLocation = input_PassengerLocation.getText().toString();

            updateDB(passengerEmail, passengerLocation);
        });
    }

    private void updateDB(String passengerEmail, String passengerLocation) {
        // Update DB Here
    }
}