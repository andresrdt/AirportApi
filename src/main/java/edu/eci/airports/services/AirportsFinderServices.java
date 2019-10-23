/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.airports.services;

import edu.eci.airports.persistencia.HttpConnection;
import edu.eci.airports.persistencia.HttpConnectionException;
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
    /**
     * Metodo encargado de retornar los aeropuestos la ciudad en especifico
     * @throws HttpConnectionExceptio
     */
    public String OpenConnection(String name) throws HttpConnectionException{
        return hc.connection(name);
    }
}
