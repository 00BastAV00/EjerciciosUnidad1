package com.example.laboratorioarielle;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class Temperatura {

    @WebMethod(operationName = "FToC")
    public String fahrenheitToCelsius (@WebParam(name = "fahrenheit") double x) {
        double n = ((x - 32) * 5/9);
        return "" + x + "° grados farenheit equivalen a " + n + "° grados celcius";
    }

    @WebMethod(operationName = "CToF")
    public String celsiusToFahrenheit (@WebParam(name = "celsius") double x) {
        double n = x * 9/5 + 32;
        return "" + x + "° grados celcius equivalen a " + n + "° grados farenheit";
    }
}