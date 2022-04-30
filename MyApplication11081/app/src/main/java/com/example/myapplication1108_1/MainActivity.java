package com.example.myapplication1108_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    Button btn1, btn2, btn3, btn4;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.Edit1);
        et2 = (EditText) findViewById(R.id.Edit2);

        btn1 = (Button) findViewById(R.id.BtnAdd);
        btn2 = (Button) findViewById(R.id.BtnSub);
        btn3 = (Button) findViewById(R.id.BtnMul);
        btn4 = (Button) findViewById(R.id.BtnDiv);

        tv = (TextView) findViewById(R.id.TextResult);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = et1.getText().toString();
                String str2 = et2.getText().toString();

                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);

                int result = num1 + num2;

                tv.setText("계산 결과 : " + result);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = et1.getText().toString();
                String str2 = et2.getText().toString();

                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);

                int result = num1 - num2;

                tv.setText("계산 결과 : " + result);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = et1.getText().toString();
                String str2 = et2.getText().toString();

                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);

                int result = num1 * num2;

                tv.setText("계산 결과 : " + result);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = et1.getText().toString();
                String str2 = et2.getText().toString();

                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);

                int result = num1 / num2;

                tv.setText("계산 결과 : " + result);
            }
        });

    }
}