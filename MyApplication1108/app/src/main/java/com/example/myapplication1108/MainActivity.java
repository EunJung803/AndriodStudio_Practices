package com.example.myapplication1108;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2, text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView) findViewById(R.id.textView1);
        text2 = (TextView) findViewById(R.id.textView2);
        text3 = (TextView) findViewById(R.id.textView3);

        text1.setText("안녕하세요?");
        text1.setTextColor(Color.RED);

        text2.setTextSize(30);
        text2.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);

        text3.setText("가나다라마바사아자차카타파하가나다라마바사아자차카타파하");
        text3.setSingleLine();
    }
}