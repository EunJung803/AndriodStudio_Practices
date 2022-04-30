package com.example.myapplication1122;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb1, rb2, rb3;
    Button btn;
    ImageView iv;
    int resource;

    LinearLayout layout;
    Button btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = (RadioGroup) findViewById(R.id.radioGroup);
        rb1 = (RadioButton) findViewById(R.id.radioBtn1);
        rb2 = (RadioButton) findViewById(R.id.radioBtn2);
        rb3 = (RadioButton) findViewById(R.id.radioBtn3);
        btn = (Button) findViewById(R.id.btn);
        iv = (ImageView) findViewById(R.id.imageView);

        layout = (LinearLayout)findViewById(R.id.linear);
        btn2 = (Button)findViewById(R.id.btn_green);
        btn3 = (Button)findViewById(R.id.btn_yellow);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = rg.getCheckedRadioButtonId(); //라디오버튼에서 check한 것에 대한 id를 가져옴

                switch (id) {
                    case R.id.radioBtn1:
                        resource = R.drawable.dog;
                        //iv.setImageResource(R.drawable.dog);
                        break;
                    case R.id.radioBtn2:
                        resource = R.drawable.cat;
                        //iv.setImageResource(R.drawable.cat);
                        break;
                    case R.id.radioBtn3:
                        resource = R.drawable.rabbit;
                        //iv.setImageResource(R.drawable.rabbit);
                        break;
                }

                if(resource == 0) {
                    Toast.makeText(getApplicationContext(), "동물을 선택해주세요!", Toast.LENGTH_SHORT).show();
                }
                else {
                    iv.setImageResource(resource);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.rgb(0,255, 0));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.YELLOW);
            }
        });
    }
}