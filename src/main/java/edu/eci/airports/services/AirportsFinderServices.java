/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.airports.services;

import edu.eci.airports.AirportFinderCache.AirportsFinderCache;
import edu.eci.airports.model.Airport;
import edu.eci.airports.persistencia.HttpConnection;
import edu.eci.airports.persistencia.HttpConnectionException;
import java.util.List;
import kong.unirest.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2112076
 */
@Service
public class AirportsFinderServices {
    @Autowired
    HttpConnection hc=null;
    @Autowired
    AirportsFinderCache cache=null;
    /**
     * Metodo encargado de retornar los aeropuestos la ciudad en especifico
     * @throws HttpConnectionExceptio
     */
    public List<Airport> OpenConnection(String name) throws HttpConnectionException{
         List respuesta = null;

        if(!cache.estaEnCache(name)) {
            respuesta = hc.connection(name);
            cache.agregueKey(name, respuesta);
        }
        else {
            System.out.println("cache");
            respuesta = cache.getValor(name);
        }
        return respuesta;
    }
}
