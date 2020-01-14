package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class userCreateActivity extends AppCompatActivity {

    String name;
    int age, height;
    float weight, bmi;
    boolean isFat;

    EditText nameInput, ageInput, heightInput, weightInput;

    TextView BMIdisplay;

    Button doneButton, cancelButton, calculateBMIButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_create);

        nameInput = (EditText) findViewById(R.id.nameInput);
        ageInput = (EditText) findViewById(R.id.ageInput);
        heightInput = (EditText) findViewById(R.id.heightInput);
        weightInput = (EditText) findViewById(R.id.weightInput);
        BMIdisplay = (TextView) findViewById(R.id.BMIdisplay);

        calculateBMIButton = (Button) findViewById(R.id.calculateBMIButton);
        calculateBMIButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weight = Float.parseFloat(weightInput.getText().toString());
                height = Integer.parseInt(heightInput.getText().toString());
                bmi = (weight / (height*height)) * 10000;
                String bmiString = String.valueOf(bmi);
                BMIdisplay.setText("Your BMI Fatty: " + bmiString);

            }
        });

    }
}
