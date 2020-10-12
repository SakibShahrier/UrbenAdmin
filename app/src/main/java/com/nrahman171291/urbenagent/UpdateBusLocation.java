package com.nrahman171291.urbenagent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.text.style.AlignmentSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class UpdateBusLocation extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private EditText email;
    private ListView listView;
    private Button abdullahpur, azampur, jashim, airport, khilkhet, bGate, nBazar, rampura, malibagh, motijheel;
    private String userEmail;
    private double lat, lon;
    private Handler handler = new Handler();
    private int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_bus_location);

        init(); // Finding all views
        userEmail = email.getText().toString().trim();


        delay.run();
    }

    private Runnable delay = new Runnable() {
        @Override
        public void run() {
            textView.setText("" + i);
            Toast.makeText(UpdateBusLocation.this, "Currently queued " + i, Toast.LENGTH_SHORT).show();
            ++i;
            handler.postDelayed(delay, 3000);
        }
    };

    private void init(){

        abdullahpur = findViewById(R.id.abdullahPur);
        azampur = findViewById(R.id.azampur);
        jashim = findViewById(R.id.jashimuddin);
        airport = findViewById(R.id.airport);
        khilkhet = findViewById(R.id.khilkhet);
        bGate = findViewById(R.id.bGate);
        nBazar = findViewById(R.id.nBazar);
        rampura = findViewById(R.id.rampura);
        malibagh = findViewById(R.id.malibagh);
        motijheel = findViewById(R.id.motijheel);
        textView = findViewById(R.id.orField);
        email = findViewById(R.id.driverEmail);
        listView = findViewById(R.id.detailLocation);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.abdullahPur:{

                updateDB(userEmail, lat, lon);
                break;
            }
            case R.id.azampur:{

                updateDB(userEmail, lat, lon);
                break;
            }
            case R.id.jashimuddin:{

                updateDB(userEmail, lat, lon);
                break;
            }
            case R.id.airport:{

                updateDB(userEmail, lat, lon);
                break;
            }
            case R.id.khilkhet:{

                updateDB(userEmail, lat, lon);
                break;
            }
            case R.id.bGate:{

                updateDB(userEmail, lat, lon);
                break;
            }
            case R.id.nBazar:{

                updateDB(userEmail, lat, lon);
                break;
            }
            case R.id.rampura:{

                updateDB(userEmail, lat, lon);
                break;
            }
            case R.id.malibagh:{

                updateDB(userEmail, lat, lon);
                break;
            }
            case R.id.motijheel:{

                updateDB(userEmail, lat, lon);
                break;
            }
        }
    }

    private void updateDB(String email, double lat, double lon){

        // Update DB Here


    }
}