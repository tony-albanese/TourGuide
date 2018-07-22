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
public class HistoricalFragment extends Fragment {

    private ArrayList<Site> historicalSites;

    public HistoricalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View historicalFragmentView = inflater.inflate(R.layout.fragment_historical, container, false);
        ListView listView = (ListView) historicalFragmentView.findViewById(R.id.historical_list_view);
        generateHistoricalSites();

        SiteAdapter siteAdapter = new SiteAdapter(getActivity(), historicalSites);
        listView.setAdapter(siteAdapter);

        return historicalFragmentView;
    }

    //This method generates the ArrayList
    private void generateHistoricalSites(){
        historicalSites= new ArrayList<Site>();
        historicalSites.add(new Site(getString(R.string.historical_aegidien_title), getString(R.string.historical_aegidian_address),getString(R.string.historical_aegidian_phone), getString(R.string.historical_aegidien_description), R.drawable.historical_aegidian));
        historicalSites.add(new Site(getString(R.string.historical_leibniz_title), getString(R.string.historical_leibniz_address), getString(R.string.historical_leibniz_phone), getString(R.string.historical_leibniz_description),R.drawable.historical_leibniz ));
        historicalSites.add(new Site(getString(R.string.historical_marienburg_title), getString(R.string.historical_marienburg_address), getString(R.string.historical_marienburg_phone), getString(R.string.historical_marienburg_description), R.drawable.historical_marienburb));
        historicalSites.add(new Site(getString(R.string.historical_kirche_title), getString(R.string.historical_kirche_address), getString(R.string.historical_kirche_phone), getString(R.string.historical_kirche_description), R.drawable.historical_kirche));
    }

}
