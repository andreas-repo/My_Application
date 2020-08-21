package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAustria(View view) {
        TextClock clock = findViewById(R.id.my_clock);
        clock.setTimeZone("Europe/Vienna");
    }

    public void onClickIndia(View view) {
        TextClock clock = findViewById(R.id.my_clock);
        clock.setTimeZone("Asia/Kolkata");
    }

    public void onClickNorthAmerica(View view) {
        TextClock clock = findViewById(R.id.my_clock);
        clock.setTimeZone("America/New York");
    }

    public void onClickJapan(View view) {
        TextClock clock = findViewById(R.id.my_clock);
        clock.setTimeZone("Japan/Tokyo");

        //test how to get string value and set given value as value of TextView object
        String i = getString(R.string.app_name);
        TextView viewTest = findViewById(R.id.test_text);
        viewTest.setText(i);
    }
}