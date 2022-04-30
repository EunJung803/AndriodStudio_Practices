package com.example.myapplication1115quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb1, rb2, rb3;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = (RadioGroup) findViewById(R.id.radioGroup);
        rb1 = (RadioButton) findViewById(R.id.radioBtn1);
        rb2 = (RadioButton) findViewById(R.id.radioBtn2);
        rb3 = (RadioButton) findViewById(R.id.radioBtn3);
        btn = (Button) findViewById(R.id.btn);
        tv = (TextView) findViewById(R.id.tv);

        tv.setTextColor(Color.RED);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = rg.getCheckedRadioButtonId(); //라디오버튼에서 check한 것에 대한 id를 가져옴

                switch (id) {
                    case R.id.radioBtn1:
                        Toast.makeText(getApplicationContext(), "미국으로 출발~", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioBtn2:
                        Toast.makeText(getApplicationContext(), "일본으로 출발~", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioBtn3:
                        Toast.makeText(getApplicationContext(), "유럽으로 출발~", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioBtn4:
                        Toast.makeText(getApplicationContext(), "동남아로 출발~", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}