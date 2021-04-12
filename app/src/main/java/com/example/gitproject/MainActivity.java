package com.example.gitproject;

import androidx.appcompat.app.AppCompatActivity;

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
        setContentView(R.layout.activity_main_task);

        TextView outputOne = findViewById(R.id.output_text_one);
        EditText inputNumber = findViewById(R.id.input_number);
        Button btnPay = findViewById(R.id.btn_pay);
        TextView outputTwo = findViewById(R.id.output_text_Two);
        CheckBox checkBox = findViewById(R.id.check_mark);
        Switch switchOne = findViewById(R.id.switch_one);
        ToggleButton btnExit = findViewById(R.id.btn_exit);

        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Integer numberSum = Integer.valueOf(inputNumber.getText().toString());
                    if (numberSum > 0) {
                        outputTwo.setText("Поставьте галочку и перейдите на следующую страницу");
                    } else {
                        outputTwo.setText("Деньги положительными циферками пишутся!:) ");
                    }
                } catch (NumberFormatException exception) {
                    outputTwo.setText("\"Деньги положительными ЦИФЕРКАМИ пишутся!:) \"");
                }
            }
        });
    }
}