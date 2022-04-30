package com.example.myapplicationfinalexam1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.Toast;
import android.widget.ViewFlipper;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    ImageView im1, im2;
    RadioGroup rg;
    RadioButton rb1, rb2;
    EditText ed;
    Button btn;
    String gita;
    Button prev, next;
    ViewFlipper vf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = (RadioGroup) findViewById(R.id.radioGroup);
        rb1 = (RadioButton) findViewById(R.id.radioBtn1);
        rb2 = (RadioButton) findViewById(R.id.radioBtn2);
        btn = (Button) findViewById(R.id.btn);
        ed = (EditText) findViewById(R.id.edt);


        TabHost tabHost = getTabHost();

        TabHost.TabSpec problem1 = tabHost.newTabSpec("problem1");
        problem1.setIndicator("문제1");
        problem1.setContent(R.id.problem1);
        tabHost.addTab(problem1);

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "먹고 싶은 디저트는 도넛", Toast.LENGTH_SHORT).show();
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "먹고 싶은 디저트는 아이스크림", Toast.LENGTH_SHORT).show();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gita = ed.getText().toString();
                Toast.makeText(getApplicationContext(), "먹고 싶은 디저트는 "+gita, Toast.LENGTH_SHORT).show();
            }
        });


        TabHost.TabSpec problem2 = tabHost.newTabSpec("problem2");
        problem2.setIndicator("문제2");
        problem2.setContent(R.id.problem2);
        tabHost.addTab(problem2);



        tabHost.setCurrentTab(0);



        TabHost.TabSpec problem3 = tabHost.newTabSpec("problem3");
        problem3.setIndicator("문제2");
        problem3.setContent(R.id.problem3);
        tabHost.addTab(problem3);

        prev = (Button) findViewById(R.id.btnPrev);
        next = (Button) findViewById(R.id.btnNext);
        vf = (ViewFlipper) findViewById(R.id.viewFlipper);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vf.showPrevious();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vf.showNext();
            }
        });

    }
}