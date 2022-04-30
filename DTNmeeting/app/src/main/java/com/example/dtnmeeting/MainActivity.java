package com.example.dtnmeeting;

import androidx.appcompat.app.AppCompatActivity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.hardware.SensorEventListener;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.Toast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity implements SeonsorEventListener {

    SensorManager sm;
    Sensor acc;
    String filename = "values.txt.";
    boolean flag = false;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity.main);
        Button btn1 = (Button)findViewById(R.id.b1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sm = (SensorManager)getSystemService(SENSOR_SERVICE);
                acc = sm.getDefaultSeonsor(Sensor.TYPE_ACCELEROMETER);
                gy = sm.getDefaultSensor(Sensor.TYPE_GYROSCOPE);

                if(acc != null)
                {
                    flag = true;
                    sm.registerListener((SensorEventListener) MainActivity.this, acc, SensorManager.SENSOR_DELAY_NORMAL);
                    sm.registerListener(MainActivity.this, gy, SensorManager.SENSOR_DELAY_NORMAL);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Missing accelerometer sensor", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
    @Override
    public void onSensorChanged(SensorEvent se)
    {
        if(flag == true)
        {
            float val[] = se.values;
            long time = se.timestamp;
            float gyl[] = gy.values;
            String x = "Time: "+String.valueOf(time)+" Acc_x: "+String.valueOf(val[0])+"Acc_y: "+String.valueOf(val[1])+"Acc_z: "+String.valueOf(val[2]);
            writemsg(msg);
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i)
    {

    }

    public void writemsg(String msg)
    {
        try {
            File dir = new File(MainActivity.this.getFilesDir(),"DTNmeeting");
            if(!dir.exists())
            {
                dir.mkdir();
            }
            File f1 = new File(dir, filename);
            FileWriter fw = new FileWriter(f1, true);
            fw.append(msg);
            fw.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}