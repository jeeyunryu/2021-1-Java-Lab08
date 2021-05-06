package edu.handong.csee.java.hw2.converters;

public interface Convertible {
    /**set from value*/
    public void setFromValue(double fromValue);
    /**get converted value */
    public double getConvertedValue();
    /**convert fromvalue */
    public void convert();

}