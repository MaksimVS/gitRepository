package com.example.gitproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_task_one);

        TextView outputOne = findViewById(R.id.output_text_one);
        EditText inputNumberTask1 = findViewById(R.id.input_number_task1);
        Button btnPay = findViewById(R.id.btn_pay);
        Button btnNewScreen = findViewById(R.id.btn_newScreen);
        TextView outputTwo = findViewById(R.id.output_text_Two);
        CheckBox checkBox = findViewById(R.id.check_mark);
        Switch switchOne = findViewById(R.id.switch_one);
        ToggleButton btnExit = findViewById(R.id.btn_exit);

        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Integer numberSum = Integer.valueOf(inputNumberTask1.getText().toString());
                    if (numberSum > 0) {
                        outputTwo.setText("Благодарим за сотрудничество!");
                    } else {
                        outputTwo.setText("Деньги положительными циферками пишутся!:) ");
                    }
                } catch (NumberFormatException exception) {
                    outputTwo.setText("\"Деньги положительными ЦИФЕРКАМИ пишутся!:) \"");
                }
            }
        });

       btnNewScreen.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, MainActivity2.class);
               startActivity(intent);
           }
       });
    }
}