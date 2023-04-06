package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private ViewPager2 whatsappVp;
private WhatsappViewPagerAdapter whatsappAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setupAdapter();
        connectAdapter();

    }

    private void connectAdapter() {
        whatsappVp.setAdapter(whatsappAdapter);
    }

    private void setupAdapter() {
        whatsappAdapter = new WhatsappViewPagerAdapter(this);
    }

    private void initViews() {
        whatsappVp = findViewById(R.id.whatsapp_vp);
    }
}