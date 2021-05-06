package edu.handong.csee.java.hw2.converters;

//import java.util.TooManyListenersException;

public class TONToKGConverter implements Convertible{

    private double tons;
    private double kilograms;

    @Override
    public void setFromValue(double fromValue) {
    
        tons = fromValue;

    }

    @Override
    public double getConvertedValue() {
      
        return kilograms;
    }

    @Override
    public void convert() {
       
        kilograms = tons * 907.185;
        
    }
    
}
