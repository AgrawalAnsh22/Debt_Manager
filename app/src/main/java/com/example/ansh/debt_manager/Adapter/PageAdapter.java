package com.example.ansh.debt_manager.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.ansh.debt_manager.Fragment.All;
import com.example.ansh.debt_manager.Fragment.Due;
import com.example.ansh.debt_manager.Fragment.Paid;

public class PageAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PageAdapter(FragmentManager fm, int NumberOfTabs){

        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                Paid paid = new Paid();
                return paid;
            case 1:
                Due due = new Due();
                return due;
            case 2:
                All all = new All();
                return all;

                default:
            return null;

        }
    }

    @Override
    public int getCount() {

        return mNoOfTabs;
    }
}
