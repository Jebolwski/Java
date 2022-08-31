package org.example;

public class SamboFighter extends Fighter implements ICanSub,ICanWrestle  {

    public SamboFighter(String name){
        this.name = name;
        this.style="Sambo";
    }


    @Override
    public void Wrestle(){
        System.out.println("Slamming people...");
    }

    @Override
    public void Sub(){
        System.out.println("Arms breaking...");
    }
}
