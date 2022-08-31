package org.example;

public class CarValidator {
    public static boolean isValid(Car car){
        if(car.getName().length()>2 && car.getDate()>1950 && car.getSpeed()>80){
            System.out.println("This is a car that can be created");
            return true;
        }
        else{
            System.out.println("This car cant be created");
            return  false;
        }
    }
}
