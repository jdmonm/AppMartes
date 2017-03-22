package com.example.andresmontoya.appmartes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView label1;
    Button boton1;
    Button boton2;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        label1 = (TextView) findViewById(R.id.label1);
        boton1 = (Button) findViewById(R.id.button);
        boton2 = (Button) findViewById(R.id.button2);
        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                label1.setText("se presiono el boton 1");
                Toast.makeText(getApplicationContext(), "se oprimio el boton 1",Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                label1.setText("se presiono el boton 2");
                Toast.makeText(getApplicationContext(), "se oprimio el boton 2",Toast.LENGTH_SHORT).show();

                break;
            default:
                break;
        }
    }
}
