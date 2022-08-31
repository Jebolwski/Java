package org.example;

public class Wrestler extends Fighter implements ICanWrestle {

    public Wrestler(String name){
        this.name = name;
        this.style="Wrestler";
    }

    @Override
    public void Wrestle(){
        System.out.println("Slamming people...");
    }
}
