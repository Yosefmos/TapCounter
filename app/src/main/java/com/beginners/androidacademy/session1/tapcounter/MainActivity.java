package com.beginners.androidacademy.session1.tapcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display;

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = (TextView)findViewById(R.id.tapdemo_display);

    }

    public void increaseCounter(View view) {
        counter++;
        display.setText(Integer.toString(counter));
    }
}
