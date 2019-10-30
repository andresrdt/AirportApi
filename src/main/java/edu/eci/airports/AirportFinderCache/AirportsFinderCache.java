/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.airports.AirportFinderCache;

import edu.eci.airports.model.Airport;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/**
 *
 * @author 2112076
 */
@Service
public class AirportsFinderCache {
    private ConcurrentHashMap<String, List<Airport>> cache = new ConcurrentHashMap<>();

    public void agregueKey(String key, List<Airport> value){
        cache.put(key,value);
    }

    public boolean estaEnCache(String key){
        return cache.containsKey(key);
    }

    public List getValor(String city) {
        return cache.get(city);
    }

}
