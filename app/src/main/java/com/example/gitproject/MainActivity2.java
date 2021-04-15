package com.example.gitproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_task_two);

        EditText text = findViewById(R.id.input_text);
        EditText personName = findViewById(R.id.input_PersonName);
        EditText phone = findViewById(R.id.input_phone);
        EditText number = findViewById(R.id.input_number_task2);
        EditText password = findViewById(R.id.input_Password);
        EditText Email = findViewById(R.id.input_eMail);
    }
}