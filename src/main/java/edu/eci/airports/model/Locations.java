/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.airports.model;

/**
 *
 * @author 2112076
 */
import com.google.gson.annotations.SerializedName;

public class Locations {

    private @SerializedName("longitude") String longitude;
    private @SerializedName("latitude") String latitude;

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
