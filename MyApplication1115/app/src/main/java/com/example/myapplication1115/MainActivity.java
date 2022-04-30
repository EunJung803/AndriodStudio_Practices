package com.example.myapplication1115;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb1, rb2, rb3;
    Button btn;
    ImageView iv;

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

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = rg.getCheckedRadioButtonId(); //라디오버튼에서 check한 것에 대한 id를 가져옴

                switch (id) {
                    case R.id.radioBtn1:
                        iv.setImageResource(R.drawable.dog);
                        break;
                    case R.id.radioBtn2:
                        iv.setImageResource(R.drawable.cat);
                        break;
                    case R.id.radioBtn3:
                        iv.setImageResource(R.drawable.rabbit);
                        break;
                }
            }
        });
    }
}