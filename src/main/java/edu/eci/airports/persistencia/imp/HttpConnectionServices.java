/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.airports.persistencia.imp;

/**
 *
 * @author 2112076
 */

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import edu.eci.airports.model.Airport;
import edu.eci.airports.persistencia.HttpConnection;
import edu.eci.airports.persistencia.HttpConnectionException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.springframework.stereotype.Service;
@Service
public class HttpConnectionServices implements HttpConnection{

    /**
     *
     * @throws HttpConnectionException
     */
    @Override
    public List<Airport> connection(String name) {
        HttpResponse<String> response = Unirest.get("https://cometari-airportsfinder-v1.p.rapidapi.com/api/airports/by-text?text="+name)
	.header("x-rapidapi-host", "cometari-airportsfinder-v1.p.rapidapi.com")
	.header("x-rapidapi-key", "7bf61d536emsh1d8e6ba3ec8b2dbp1ecaaajsnbc1272fe637a")
	.asString();
        System.out.println(response.getBody());
        if(response ==null){
            try {
                throw new HttpConnectionException("api not found.");
            } catch (HttpConnectionException ex) {
                Logger.getLogger(HttpConnectionServices.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Gson gson = new Gson();
        Type lis = new TypeToken<ArrayList<Airport>>(){}.getType();
        List<Airport> res = gson.fromJson(response.getBody(),lis);
        System.out.println("LLegaaaa  22222 ");
        System.out.println(res);
        return res;
        //return response.getBody();
    }

}
