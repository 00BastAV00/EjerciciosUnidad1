package com.example.ejercicioslabos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class Temperatura {

    @WebMethod(operationName = "FToC")
    public String fahrenheitToCelsius (@WebParam(name = "fahrenheit") double x)
    {
        double n = ((x - 32) * 5/9);

        return "Total " + n;
    }

    @WebMethod(operationName = "CToF")
    public String celsiusToFahrenheit (@WebParam(name = "celsius") double x)
    {
        double n = x * 9/5 + 32;

        return "Total " + n;
    }


}
