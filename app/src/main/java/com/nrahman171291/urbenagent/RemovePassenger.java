package com.nrahman171291.urbenagent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

public class RemovePassenger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Objects.requireNonNull(this.getSupportActionBar()).hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_remove_passenger);

        EditText input_removePassengerEmail = findViewById(R.id.input_removePassengerEmail);

        Button button_submit_removePassenger = findViewById(R.id.button_submit_removePassenger);
        button_submit_removePassenger.setOnClickListener(view -> {
            String removePassengerEmail = input_removePassengerEmail.getText().toString();

            updateDB(removePassengerEmail);
        });
    }

    private void updateDB(String removePassengerEmail) {
        // Update DB Here
    }
}