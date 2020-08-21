package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextClock;

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
    }
}