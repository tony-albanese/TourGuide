package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {

    private ArrayList<Site> restaurantSites;

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View restaurantFragmentView = inflater.inflate(R.layout.fragment_restaurant, container, false);
        ListView restaurantListView = (ListView) restaurantFragmentView.findViewById(R.id.restaurant_list_view);
        generateRestuarantSites();

        //Set the adapter.
        SiteAdapter siteAdapter = new SiteAdapter(getActivity(), restaurantSites);
        restaurantListView.setAdapter(siteAdapter);
        return restaurantFragmentView;
    }

    //This method generates the ArrayList
    private void generateRestuarantSites(){
        restaurantSites = new ArrayList<Site>();
        restaurantSites.add(new Site(getString(R.string.restaurant_goldfisch_title), getString(R.string.restaurant_goldfisch_address), getString(R.string.restaurant_goldfisch_phone), getString(R.string.restaurant_goldfisch_description)));
        restaurantSites.add(new Site(getString(R.string.restaurant_shalimar_title), getString(R.string.restaurant_shalimar_address), getString(R.string.restaurant_shalimar_phone), getString(R.string.restaurant_shalimar_description)));
        restaurantSites.add(new Site(getString(R.string.restaurant_shalimar_title), getString(R.string.restaurant_shalimar_address), getString(R.string.restaurant_shalimar_phone), getString(R.string.restaurant_hofbrau_description)));
        restaurantSites.add(new Site(getString(R.string.restaurant_losteria_title), getString(R.string.restaurant_losteria_address), getString(R.string.restaurant_losteria_phone), getString(R.string.restaurant_losteria_description)));

    }
}
