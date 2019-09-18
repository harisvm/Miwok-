package com.example.android.miwok;

import android.util.Log;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        Log.v("main", String.valueOf(position));
        if (position == 0) {
            return new Numbers_Fragment();

        } else if (position == 1) {
            return new FamilyFragment();
        } else   {
            return new ColorsFragment();
        }

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "NUMBERS";

        } else if (position == 1) {
            return "FAMILY";
        } else   {
            return "COLORS";
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
