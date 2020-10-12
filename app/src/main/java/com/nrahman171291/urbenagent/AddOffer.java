package com.nrahman171291.urbenagent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

public class AddOffer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Objects.requireNonNull(this.getSupportActionBar()).hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_add_offer);

        EditText input_offerName = findViewById(R.id.input_offerName);
        EditText input_offerPercentage = findViewById(R.id.input_offerPercentage);

        Button button_submit_offer = findViewById(R.id.button_submit_offer);
        button_submit_offer.setOnClickListener(view -> {
            String offerName = input_offerName.getText().toString();
            double offerPercentage = Double.parseDouble(input_offerPercentage.getText().toString());

            updateDB(offerName, offerPercentage);
        });
    }

    private void updateDB(String offerName, double offerPercentage) {
        // Update DB Here
    }
}