package edu.handong.csee.java.hw2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import edu.handong.csee.java.hw2.converters.*;

/**
 * Perform and print possible unit conversions.
 */
public class AllConverter extends IntegratedConverter{
    private double value;
    private String name;
    private String [][]target = {
        {"KM","TON"},
        {"M","KG"},
        {"MILE","G"}
    };
    /**
     * set the value
     */
    public AllConverter setFromValue(double fromValue){
        this.value = fromValue;
        return this;
    }
    /**
     * set the name value
     */
    public AllConverter setOriginalMeasure(String origin){
        this.name = origin;
        return this; 
    }
    /**
     * Perform and print possible unit conversions.
     */
    public void convertAndPrintOut(){
        if(name.equals(target[0][0])){
            for(int i = 1; i < 3; i++){
                String convertName = "edu.handong.csee.java.hw2.converters." + name + "To" + target[i][0] + "Converter";
                try {
                    Class<?> converterClass = (Class<?>) Class.forName(convertName);
                    Constructor<?> constructor = (Constructor<?>) converterClass.getConstructor();
                    Convertible myConverter = (Convertible) constructor.newInstance();
                    myConverter.setFromValue(value);
                    myConverter.convert();
                    System.out.println(value +" " + name + " is " + myConverter.getConvertedValue() + " " + target[i][0]);
                } catch(ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    System.out.println("The converter (" + convertName + ") for " + name + " to " + target[i][0] + " does not exist!!");
                }
            }
        }else if(name.equals(target[0][1])){
            for(int i = 1; i < 3; i++){
                String convertName = "edu.handong.csee.java.hw2.converters." + name + "To" + target[i][1] + "Converter";
                try {
                    Class<?> converterClass = (Class<?>) Class.forName(convertName);
                    Constructor<?> constructor = (Constructor<?>) converterClass.getConstructor();
                    Convertible myConverter = (Convertible) constructor.newInstance();
                    myConverter.setFromValue(value);
                    myConverter.convert();
                    System.out.println(value +" " + name + " is " + myConverter.getConvertedValue() + " " + target[i][1]);
    
                } catch(ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    System.out.println("The converter (" + convertName + ") for " + name + " to " + target[i][1] + " does not exist!!");
                }
            }
        }else{
            System.out.println("AllConverter cannot support the measure!");
            }
        }
}