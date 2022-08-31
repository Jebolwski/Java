package org.example;

public class Striker extends Fighter implements ICanStrike {

    public Striker(String name){
        this.name = name;
        this.style="Striker";
    }

    @Override
    public void Strike(){
        System.out.println("Punches...");
    }
}
