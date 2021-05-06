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
    	miles = kilometers / 1.6;
        return miles;
    }

    @Override
    public void convert() {
    	getConvertedValue();
        
        
    }
    
}
