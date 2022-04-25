package com.big.amazingwaterfalls;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class WaterfallsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waterfalls);
        ViewPager viewPager = findViewById(R.id.viewPager);
        AdapterImage adapter = new AdapterImage(this);
        viewPager.setAdapter(adapter);
    }
}