package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
                float number = Float.parseFloat((fromEditTxt.getText().toString()));
                number *=100;
                toTxtVeiw.setText(Float.toString(number)+"cm");
            }
        });
    }
}