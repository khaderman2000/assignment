package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Converter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        Button homeBtn = findViewById(R.id.homeBtn);
        Button calculateBtn = findViewById(R.id.calculateBtn);
        EditText fromEditTxt = findViewById(R.id.fromEditTxt);
        TextView toTxtVeiw = findViewById(R.id.toTxtVeiw);
        Spinner unitSpinner = findViewById(R.id.unitsSpinner);
        final int[] unit = {0};

        unitSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                if (item != null && item.equals("Length")) {
                    fromEditTxt.setHint("in meters");
                    fromEditTxt.setText("");
                    toTxtVeiw.setText("The result");
                    unit[0] =0;
                } else {
                    fromEditTxt.setHint("in kg");
                    fromEditTxt.setText("");
                    toTxtVeiw.setText("The result");
                    unit[0] =1;
                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }


        });
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Converter.this, MainActivity.class);
                startActivity(intent);
            }
        });
        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((fromEditTxt.getText().toString())!=null&&
                        TextUtils.isDigitsOnly(fromEditTxt.getText().toString())) {
                    if (unit[0] == 0) {
                        float number = Float.parseFloat((fromEditTxt.getText().toString()));
                        number *= 0.000621371192;
                        toTxtVeiw.setText(Float.toString(number) + "miles");
                    } else {
                        float number = Float.parseFloat((fromEditTxt.getText().toString()));
                        number *= 2.20462262;
                        toTxtVeiw.setText(Float.toString(number) + "pounds");
                    }
                    toTxtVeiw.setTextColor(Color.BLACK);
                }
                else {

                    if(unit[0]==0){
                        fromEditTxt.setHint("in meters");
                        fromEditTxt.setText("");
                        toTxtVeiw.setText("The result");

                    } else {
                        fromEditTxt.setHint("in kg");
                        fromEditTxt.setText("");
                        toTxtVeiw.setText("The result");

                    }


                }
            }
        });
    }
}