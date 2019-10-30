/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.airports.persistencia;

import edu.eci.airports.model.Airport;
import java.util.List;
import kong.unirest.HttpResponse;

/**
 *
 * @author 2112076
 */
public interface HttpConnection {
        public List<Airport> connection(String name) ;
}
