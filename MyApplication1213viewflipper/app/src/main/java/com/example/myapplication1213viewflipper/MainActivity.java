package com.example.myapplication1213viewflipper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    Button prev, next;
    ViewFlipper vf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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