package com.nrahman171291.urbenagent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

public class RemoveDriver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Objects.requireNonNull(this.getSupportActionBar()).hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_remove_driver);

        EditText input_removeDriverEmail = findViewById(R.id.input_removeDriverEmail);

        Button button_submit_removeDriver = findViewById(R.id.button_submit_removeDriver);
        button_submit_removeDriver.setOnClickListener(view -> {
            String removeDriverEmail = input_removeDriverEmail.getText().toString();

            updateDB(removeDriverEmail);
        });
    }

    private void updateDB(String removeDriverEmail) {
        // Update DB Here
    }
}