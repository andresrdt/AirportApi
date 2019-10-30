/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.airports.model;
import com.google.gson.annotations.SerializedName;

import javax.xml.stream.Location;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 2112076
 */


public class Airport {
    private @SerializedName("airportId") String airportId;
    private @SerializedName("code") String code;
    private @SerializedName("name") String name;
    private @SerializedName("cityId") String cityId;
    private @SerializedName("city") String city;
    private @SerializedName("countryCode") String countryCode;
    private @SerializedName("location") Locations location;
    private @SerializedName("themes") List themes;
    private @SerializedName("pointsOfSale") List pointsOfSale;

    public Airport(String airportId) {
        this.airportId = airportId;
    }

    public String getAirportId() {
        return airportId;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getCityId() {
        return cityId;
    }

    public String getCity() {
        return city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public Locations getLocation() {
        return location;
    }

    public List<Object> getThemes() {
        return themes;
    }

    public List<Object> getPointsOfSale() {
        return pointsOfSale;
    }

    public void setAirportId(String airportId) {
        this.airportId = airportId;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }



    public void setThemes(ArrayList<Object> themes) {
        this.themes = themes;
    }

    public void setPointsOfSale(ArrayList<Object> pointsOfSale) {
        this.pointsOfSale = pointsOfSale;
    }
}