package com.example.viewpager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
private ViewPager2 whatsappVp;
private WhatsappViewPagerAdapter whatsappAdapter;
private TabLayout tabTl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setupAdapter();
        connectAdapter();
        setupTabWithViewPager();

    }

    private void setupTabWithViewPager() {
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabTl, whatsappVp, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 1:
                        tab.setText("status");
                        break;
                    case 2:
                        tab.setText("call");
                        break;
                    case 0:
                    default:
                        tab.setText("chats");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }

    private void connectAdapter() {
        whatsappVp.setAdapter(whatsappAdapter);
    }

    private void setupAdapter() {
        whatsappAdapter = new WhatsappViewPagerAdapter(this);
    }

    private void initViews() {
        tabTl = findViewById(R.id.tab_tl);
        whatsappVp = findViewById(R.id.whatsapp_vp);
    }
}