package edu.handong.csee.java.hw2.converters;


public class KMToMConverter implements Convertible{

    private double kilometers;
    private double meters;

    @Override
    public void setFromValue(double fromValue) {
        // TODO Auto-generated method stub
        this.kilometers = fromValue;
    }

    @Override
    public double getConvertedValue() {
        // TODO Auto-generated method stub
    	this.meters = this.kilometers * 1000;
        return this.meters;
    }

    @Override
    public void convert() {
        // TODO Auto-generated method stub
        getConvertedValue();
        
    }
    
}
