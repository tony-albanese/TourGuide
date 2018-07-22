package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by tony on 03.09.17.
 */

public class SiteAdapter extends ArrayAdapter<Site> {


    public SiteAdapter(Context context, ArrayList<Site> sites){
        super(context, 0, sites);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.site_list_item, parent, false);
        }

        Site currentSite = getItem(position);

        //Get all of the views in the site_list_item layout.
        ImageView siteImageView = (ImageView) listItemView.findViewById(R.id.site_image);
        TextView siteDescriptionView = (TextView) listItemView.findViewById(R.id.site_description);
        TextView siteAddressView = (TextView) listItemView.findViewById(R.id.site_address);
        TextView sitePhoneNumberView = (TextView) listItemView.findViewById(R.id.phone_number);
        TextView siteTitle = (TextView) listItemView.findViewById(R.id.site_title);

        //Make the ImageView invisible if there is no image.
        if(currentSite.hasImage){
            siteImageView.setImageResource(currentSite.getSiteImageId());
            siteImageView.setVisibility(View.VISIBLE);
        } else{
            siteImageView.setVisibility(View.GONE);
        }

        //Poluate the views with Site object information.
        siteDescriptionView.setText(currentSite.getSiteDescription());
        siteAddressView.setText(currentSite.getSiteAddress());
        sitePhoneNumberView.setText(currentSite.getSitePhoneNumber());
        siteTitle.setText(currentSite.getSiteName());


        return listItemView;
    }
}
