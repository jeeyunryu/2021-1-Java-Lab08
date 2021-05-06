package edu.handong.csee.java.hw2.converters;

public class TONToGConverter implements Convertible{

    private double tons;
    private double grams;

    @Override
    public void setFromValue(double fromValue) {
        
        tons = fromValue;
        
    }

    @Override
    public double getConvertedValue() {
      
        return grams;
    }

    @Override
    public void convert() {
        grams = tons * 907185;
        
    }
    
}
