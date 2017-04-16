package com.example.andresmontoya.appmartes;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Actividad2 extends AppCompatActivity implements View.OnClickListener {

    RadioGroup radioGroup;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        button = (Button)findViewById(R.id.button3);
        button.setOnClickListener(this);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if(i == R.id.radioButton){
                    Toast.makeText(getApplicationContext(),"usted oprimio el boton 1",Toast.LENGTH_SHORT);
                }else if(i == R.id.radioButton2){
                    Toast.makeText(getApplicationContext(),"usted oprimio el boton 2",Toast.LENGTH_SHORT);
                }else if(i == R.id.radioButton3){
                    Toast.makeText(getApplicationContext(),"usted oprimio el boton 3",Toast.LENGTH_SHORT);
                }else{
                    Toast.makeText(getApplicationContext(),"usted oprimio el boton 4",Toast.LENGTH_SHORT);
                }
            }
        });
    }


    @Override
    public void onClick(View view) {
        super.onBackPressed();
    }
}
