package com.example.ansh.debt_manager.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.ansh.debt_manager.Fragment.All1;
import com.example.ansh.debt_manager.Fragment.Due1;
import com.example.ansh.debt_manager.Fragment.Paid1;

public class PageAdapter1 extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PageAdapter1(FragmentManager fm, int NumberOfTabs) {

        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                Paid1 paid1 = new Paid1();
                return paid1;
            case 1:
                Due1 due1 = new Due1();
                return due1;
            case 2:
                All1 all1 = new All1();
                return all1;

            default:
                return null;
        }

    }

    @Override
    public int getCount () {
        return mNoOfTabs;
    }
}