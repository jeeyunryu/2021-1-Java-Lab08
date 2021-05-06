package edu.handong.csee.java.hw2.converters;

public class MILEToKMConverter implements Convertible{

    private double miles;
    private double kilometers;

    @Override
    public void setFromValue(double fromValue) {
        // TODO Auto-generated method stub
        miles = fromValue;
        
    }

    @Override
    public double getConvertedValue() {
        // TODO Auto-generated method stub
        return kilometers;
    }

    @Override
    public void convert() {
        // TODO Auto-generated method stub
        kilometers = miles * 1.6;
        
    }
    
}
