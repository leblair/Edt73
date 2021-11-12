package com.example.edt73;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private Button calculateFat;
    private TextInputEditText inputFat1;
    private TextInputEditText inputFat2;
    private RadioButton fatMass;
    private RadioGroup formula;
    private RadioGroup gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputFat1 = findViewById(R.id.inputFat);
        inputFat2 = findViewById(R.id.inputFat2);
        calculateFat = findViewById(R.id.calculate1);
        fatMass = findViewById(R.id.fatMass);

        formula = findViewById(R.id.radioGroup1);
        gender = findViewById(R.id.radioGroup2);

        int radioSelected = formula.getCheckedRadioButtonId();
        GENDER genderValue = null;
        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int radioSelected = gender.getCheckedRadioButtonId();
                switch (radioSelected) {
                    case R.id.male:

                        break;
                    case R.id.radioBt2:
                        Toast.makeText(getApplicationContext(), "Radio Button 2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioBt3:
                        Toast.makeText(getApplicationContext(), "Radio Button 3", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });

        calculateFat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BodyMass bodyMass = new BodyMass();

                switch (radioSelected) {
                    case R.id.fatMass:
                        double result = bodyMass.relativeFatMass(Double.parseDouble(String.valueOf(inputFat1)), Double.parseDouble(String.valueOf(inputFat1)), gender);
                        break;

                }

            }
        });
    }
}