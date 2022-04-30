package com.example.myapplicationfinalexampractice1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    RadioGroup rg;
    RadioButton rb1, rb2, rb3;
    Button btn;
    TextView result_tv;

    LinearLayout layout;

    EditText ed1, ed2;
    String number1, number2;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = (RadioGroup) findViewById(R.id.radioGroup);
        rb1 = (RadioButton) findViewById(R.id.radioBtn1);
        rb2 = (RadioButton) findViewById(R.id.radioBtn2);
        rb3 = (RadioButton) findViewById(R.id.radioBtn3);
        btn = (Button) findViewById(R.id.btn);
        result_tv = (TextView) findViewById(R.id.result);
        ed1 = (EditText) findViewById(R.id.edit1);
        ed2 = (EditText) findViewById(R.id.edit2);

        layout = (LinearLayout)findViewById(R.id.problem1);

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.rgb(255,0, 0));
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.rgb(255,255, 0));
            }
        });
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.rgb(0,0, 255));
            }
        });

        TabHost tabHost = getTabHost();

        TabHost.TabSpec problem1 = tabHost.newTabSpec("problem1");
        problem1.setIndicator("문제1");
        problem1.setContent(R.id.problem1);
        tabHost.addTab(problem1);

        TabHost.TabSpec problem2 = tabHost.newTabSpec("problem2");
        problem2.setIndicator("문제2");
        problem2.setContent(R.id.problem2);
        tabHost.addTab(problem2);

        TabHost.TabSpec problem3 = tabHost.newTabSpec("problem3");
        problem3.setIndicator("문제2");
        problem3.setContent(R.id.problem3);
        tabHost.addTab(problem3);

        tabHost.setCurrentTab(0);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = ed1.getText().toString();
                number2 = ed2.getText().toString();

                result = Integer.parseInt(number1) + Integer.parseInt(number2);
                result_tv.setText("결과값:" + result);
            }
        });
    }
}