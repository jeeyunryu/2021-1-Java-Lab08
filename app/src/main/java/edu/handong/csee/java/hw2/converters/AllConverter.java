package edu.handong.csee.java.hw2.converters;
//
//myAllConverter.setFromValue(fromValue).setOriginalMeasure(originalMeasure).convertAndPrintOut();
public class AllConverter {

    private double fromValue;
    private String originalMeasure;
    private double kilometers;
    private double meters;
    private double miles;
    private double tons;
    private double grams;
    private double kilograms;
    
    public AllConverter setFromValue(double fromValue){
        this.fromValue = fromValue;
        return this;

    }

    public AllConverter setOriginalMeasure(String originalMeasure){
        this.originalMeasure = originalMeasure;
        return this;

    }


     public void convertAndPrintout(){
        if(originalMeasure.equals("KM")){

            meters = kilometers * 1000;
            miles = kilometers / 1.6;
            System.out.println(this.fromValue + " " + this.originalMeasure + " is " + meters + " " + "M" + "!");
            System.out.println(this.fromValue + " " + this.originalMeasure + " is " + miles + " " + "MILE" + "!");
        }
        if(originalMeasure.equals("TON")){
            grams = tons * 907185;
            kilograms = tons * 907.185;

            System.out.println(this.fromValue + " " + this.originalMeasure + " is " + grams + " " + "G" + "!");
            System.out.println(this.fromValue + " " + this.originalMeasure + " is " + kilograms + " " + "KG" + "!");
        }
      
    }
    
}
