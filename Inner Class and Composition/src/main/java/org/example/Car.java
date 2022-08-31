package org.example;

public class Car {
    private int speed;
    private String name;
    private int date;


    public Car(String name,int speed,int date){
        this.date=date;
        this.speed=speed;
        this.name=name;
    }
    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        if(this.speed>60){
            this.speed=speed;
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(this.name.length()>2){
            this.name=name;
        }
    }

    public int getDate(){
        return date;
    }

    public void setDate(int date){
        if(this.date>1950){
            this.date=date;
        }
    }

}
