package org.example;

public class Main {
    public static void main(String[] args) {
        Car honda = new Car("Honda",70,1998);

        if (CarValidator.isValid(honda)){
            CarManager manager = new CarManager();
            manager.car=honda;
            manager.Read();
        }



    }
}