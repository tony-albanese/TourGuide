package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by tony on 03.09.17.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context fragmentContext;
    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        fragmentContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch(position){
            case 0:
                return new MuseumFragment();
            case 1:
                return new OutdoorFragment();
            case 2:
                return new HistoricalFragment();
            case 3:
                return new RestaurantFragment();
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int postion){
        switch (postion){
            case 0:
                return fragmentContext.getString(R.string.museum_tab);
            case 1:
                return fragmentContext.getString(R.string.outdoor_tab);
            case 2:
                return fragmentContext.getString(R.string.historical_tab);
            case 3:
                return fragmentContext.getString(R.string.restaurant_tab);
            default:
                return null;
        }
    }
}
