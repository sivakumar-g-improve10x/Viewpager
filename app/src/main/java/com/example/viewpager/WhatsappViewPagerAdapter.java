package com.example.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class WhatsappViewPagerAdapter extends FragmentStateAdapter {

    public WhatsappViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new StatusFragment();
            case 2:
                return new CallsFragment();
            case 0:
            default:
                return new ChatsFragment();
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
