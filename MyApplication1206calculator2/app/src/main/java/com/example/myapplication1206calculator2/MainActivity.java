package com.example.myapplication1206calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;

    Button [] btn = new Button[10];
    Button btnAdd, btnSub, btnMul, btnDiv;

    TextView tv;

    String number1, number2;

    int result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.edit1);
        et2 = (EditText) findViewById(R.id.edit2);

        for(int i=0; i<=9; i++) {
            int k = getResources().getIdentifier("button"+i, "id", getPackageName());
            btn[i] = (Button) findViewById(k);
        }

        btnAdd = (Button) findViewById(R.id.buttonAdd);
        btnSub = (Button) findViewById(R.id.buttonSub);
        btnMul = (Button) findViewById(R.id.buttonMul);
        btnDiv = (Button) findViewById(R.id.buttonDiv);

        tv = (TextView) findViewById(R.id.text1);

        for(int j=0; j<=9; j++) {
            final int index = j; //final 선언을 통해 계속 바뀌는 값을 지정해준다??
            btn[j].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(et1.isFocused()) {
                        number1 = et1.getText().toString() + index;
                        et1.setText(number1);
                    }
                    else if (et2.isFocused()) {
                        number2 = et2.getText().toString() + index;
                        et2.setText(number2);
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "먼저 에디터텍스트를 선택하세요", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = et1.getText().toString();
                number2 = et2.getText().toString();

                result = Integer.parseInt(number1) + Integer.parseInt(number2);
                tv.setText("계산결과:" + result);
            }
        });
    }
}