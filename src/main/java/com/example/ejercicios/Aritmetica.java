package com.example.ejercicioslabos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class Aritmetica {

    @WebMethod(operationName = "Suma")
    public String suma (@WebParam(name = "x") double x, @WebParam(name = "y") double y)
    {
        double total = x + y;
        return "Total: " + total;
    }

    @WebMethod(operationName = "Resta")
    public String resta (@WebParam(name = "x") double x, @WebParam(name = "y") double y)
    {
        double total = x - y;
        return "Total: " + total;
    }

    @WebMethod(operationName = "Multiplicacion")
    public String multiplicacion (@WebParam(name = "x") double x, @WebParam(name = "y") double y)
    {
        double total = x * y;
        return "Total: " + total;
    }

    @WebMethod(operationName = "Division")
    public String division (@WebParam(name = "x") double x, @WebParam(name = "y") double y)
    {
        double total = x / y;
        return "Total: " + total;
    }
}

