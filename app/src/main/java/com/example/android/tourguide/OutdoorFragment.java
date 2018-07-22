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
public class OutdoorFragment extends Fragment {

    private ArrayList<Site> outdoorSites;

    public OutdoorFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View outdoorFragmentView = inflater.inflate(R.layout.fragment_outdoor, container,false);
        ListView outdoorSiteListView = (ListView) outdoorFragmentView.findViewById(R.id.outdoor_list_view);
        generateOutdoorSites();

        SiteAdapter siteAdapter = new SiteAdapter(getActivity(), outdoorSites);
        outdoorSiteListView.setAdapter(siteAdapter);
        return outdoorFragmentView;
    }

    //This method generates the ArrayList
    private void generateOutdoorSites() {
        outdoorSites = new ArrayList<Site>();
        outdoorSites.add(new Site(getString(R.string.outdoor_eilenriede_title), getString(R.string.outdoor_eilenriede_address), getString(R.string.outdoor_eilenriede_phone), getString(R.string.outdoor_eilenriede_description), R.drawable.outdoors_eilenriede));
        outdoorSites.add(new Site(getString(R.string.outdoor_stadtpark_title), getString(R.string.outdoor_stadtpark_address), getString(R.string.outdoor_statdpark_phone), getString(R.string.outdoor_stadtpark_description), R.drawable.outdoors_stadtpark));
        outdoorSites.add(new Site(getString(R.string.outdoor_maschpark_title), getString(R.string.outdoor_maschpark_address), getString(R.string.outdoor_maschpark_phone), getString(R.string.outdoor_maschpark_description), R.drawable.outdoors_maschpark));
        outdoorSites.add(new Site(getString(R.string.outdoor_maschpark_title), getString(R.string.outdoor_maschpark_address), getString(R.string.outdoor_maschpark_phone), getString(R.string.outdoor_herrenhausergarden_description), R.drawable.outdoors_herrenhauser));
    }

}
