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

import edu.eci.airports.persistencia.HttpConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.springframework.stereotype.Service;
@Service
public class HttpConnectionServices implements HttpConnection{


    @Override
    public void connection() {
        HttpResponse<String> response = Unirest.get("https://cometari-airportsfinder-v1.p.rapidapi.com/api/airports/by-text?text=Berlin")
	.header("x-rapidapi-host", "cometari-airportsfinder-v1.p.rapidapi.com")
	.header("x-rapidapi-key", "7bf61d536emsh1d8e6ba3ec8b2dbp1ecaaajsnbc1272fe637a")
	.asString();
        System.out.println(response.getBody());
        if(response ==null){
            throw new UnsupportedOperationException("api not found.");
        }
    }

}
