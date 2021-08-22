package com.arnoldvaz27.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton male,female;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        male = findViewById(R.id.radioButton1);
        female = findViewById(R.id.radioButton2);

        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId){
                case R.id.radioButton1:
                    Toast.makeText(MainActivity.this, "male", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.radioButton2:
                    Toast.makeText(MainActivity.this, "female", Toast.LENGTH_SHORT).show();
                    break;
            }
        });

    }
}