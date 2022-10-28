package com.example.timetable_vlsu;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.timetable_vlsu.fragments.BakFragment;
import com.example.timetable_vlsu.fragments.MagFragment;
import com.example.timetable_vlsu.fragments.SpecFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
       switch (position){
           case 0:
               return new BakFragment();
           case 1:
               return new SpecFragment();
           case 2:
               return new MagFragment();
           default:
               return new BakFragment();
       }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
