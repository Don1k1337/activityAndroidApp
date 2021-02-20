package com.example.firstsecondactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    ImageView imageView;
    TextView name, number;
    private Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.set_name);
        number = findViewById(R.id.editTextPhone);
        // Get text from Intent
        Intent intent = getIntent();
        String getName = intent.getStringExtra("name");
        String getNumber = intent.getStringExtra("number");

        // Set Text
        name.setText(getName);
        number.setText(getNumber);
        // Back button logic
        Button backbtn = (Button) findViewById(R.id.backBtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
            }
        });



       number = (EditText) findViewById(R.id.editTextPhone);
       Button sentBtn = (Button) findViewById(R.id.sentPhoneBtn);
       sentBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent();
               i.putExtra("editTextValue", "number");
               setResult(RESULT_OK, i);
               finish();

           }
       });


    }


}