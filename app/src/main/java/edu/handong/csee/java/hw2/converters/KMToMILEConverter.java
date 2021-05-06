package edu.handong.csee.java.hw2.converters;

public class KMToMILEConverter implements Convertible{

    private double kilometers;
    private double miles;

    @Override
    public void setFromValue(double fromValue) {
        // 
        kilometers = fromValue;
        
    }

    @Override
    public double getConvertedValue() {
       
        return miles;
    }

    @Override
    public void convert() {
        miles = kilometers / 1.6;
        
    }
    
}
