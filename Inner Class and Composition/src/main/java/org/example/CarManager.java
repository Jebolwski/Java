package org.example;

public class CarManager {
    Car car;

    public CarManager(){
        System.out.println("Car Manager çalıştırıldı.");
    }

    public void Add(){
        System.out.println("Add Car.");
    }

    public void Remove(){
        System.out.println("Remove Car.");
    }

    public void Edit(){
        System.out.println("Edit Car.");
    }

    public void Read(){
        System.out.println("Info : "+car.getName()+" "+car.getSpeed()+" "+car.getDate());
    }
}
