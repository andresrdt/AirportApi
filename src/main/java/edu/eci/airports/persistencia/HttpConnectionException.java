/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.airports.persistencia;

/**
 *
 * @author 2112076
 */
public class HttpConnectionException extends Exception{

    public HttpConnectionException (String message) {
        super(message);
    }

    public HttpConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
