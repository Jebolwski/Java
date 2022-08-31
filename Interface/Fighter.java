package org.example;

public class Fighter {

    String name;
    String style;
    int wins;

    int losses;


    public void win(){
        this.wins+=1;
        System.out.println(this.wins+"-"+this.losses);
    }

    public void lose(){
        this.losses+=1;
        System.out.println(this.wins+"-"+this.losses);
    }
}
