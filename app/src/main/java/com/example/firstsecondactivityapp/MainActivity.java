package com.example.firstsecondactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name, number;
    TextView phone;
    Button btn, phoneBtn, imgBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Hooks
        name = findViewById(R.id.nameET);
        number = findViewById(R.id.numberET);
        btn = findViewById(R.id.btn);
        //Pass Data on Button Click

        phoneBtn = (Button) findViewById(R.id.phoneBtn);

        phoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivityForResult(i, 1);
            }

        });
        phone = findViewById(R.id.number);
        // Get text from Intent
        Intent intent = getIntent();

        String getNumber = intent.getStringExtra("number");

        // Set Text

        number.setText(getNumber);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Get data from input field
                String getName = name.getText().toString();
                String getNumber = number.getText().toString();
                //Pass data to 2nd activity
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", getName);
                intent.putExtra("number", getNumber);
                startActivity(intent);
            }

        });






    }
}