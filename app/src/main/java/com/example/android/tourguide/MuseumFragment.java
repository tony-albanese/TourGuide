package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumFragment extends Fragment {

    //Declare an ArrayList of museum site objects that will be used to populate the ListView.
    private ArrayList<Site> museumSites;

    public MuseumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View museumFragmentView = inflater.inflate(R.layout.fragment_museum, container, false);
        ListView listView = (ListView) museumFragmentView.findViewById(R.id.museum_list_view);
        generateMuseumSites();

        SiteAdapter siteAdapter = new SiteAdapter(getActivity(), museumSites);
        listView.setAdapter(siteAdapter);
        //Retrun the inflated View.
        return museumFragmentView;
    }

    //This method will generate the museum site ArrayList.
    private void generateMuseumSites(){
        museumSites = new ArrayList<Site>();
        museumSites.add(new Site(getString(R.string.museum_sprengel_title), getString(R.string.museum_sprengel_address), getString(R.string.museum_sprengel_phone), getString(R.string.museum_sprengel_description), R.drawable.museum_sprengel_museum));
        museumSites.add(new Site(getString(R.string.museum_tower_title), getString(R.string.museum_tower_address), getString(R.string.museum_tower_phone), getString(R.string.museum_tower_description), R.drawable.museum_tower_museum));
        museumSites.add(new Site(getString(R.string.museum_kestner_title), getString(R.string.museum_kestener_address), getString(R.string.museum_kestner_phone), getString(R.string.museum_kestner_description), R.drawable.museum_kestner_museum));
        museumSites.add(new Site(getString(R.string.museum_buchdruck_title), getString(R.string.museum_buchdruck_address), getString(R.string.museum_buchdruck_phone), getString(R.string.museum_buchdruck) ,R.drawable.museum_buchdruck));
    }

}
