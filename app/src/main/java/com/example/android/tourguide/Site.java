package com.example.android.tourguide;

/**
 * Created by tony on 02.09.17.
 */
import java.lang.String;

public class Site {
    //Add the necessary member variables to this class.

    String siteName;
    String siteAddress;
    String sitePhoneNumber;
    String siteDescription;

    //These variables will hold references to android resource IDs corresponding to an image and
    //and audio descrption
    int siteImageId;

    //Not all sites will have a corresponding audio resource. It might be good to know if the
    //Site object has one.
    boolean hasImage = false;

    //Here are the getter methods.
    public String getSiteName(){return siteName;}
    public String getSiteAddress() {return siteAddress;}
    public String getSitePhoneNumber() {return sitePhoneNumber;}
    public String getSiteDescription(){return siteDescription;}
    public int getSiteImageId(){return siteImageId;}

    //Site object constructor if no audio description is available.
    public Site(String name, String address, String phoneNumber, String description, int imageId){
        siteName = name;
        siteAddress = address;
        sitePhoneNumber = phoneNumber;
        siteDescription = description;
        siteImageId = imageId;
        hasImage = true;
    }

    //Site object constructor if there is no audio and no image.
    public Site(String name, String address, String phoneNumber, String description){
        siteName = name;
        siteAddress = address;
        sitePhoneNumber = phoneNumber;
        siteDescription = description;
        hasImage = false;
    }
}
