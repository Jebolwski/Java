package org.example;

public class Pizza extends Food {

    public Pizza(int price,int deli_lev,String name){
        this.price=price;
        this.deliciousness_level=deli_lev;
        this.name=name;
    }

    public Pizza(){}

    @Override
    public String toString() {
        return this.name + " " + this.deliciousness_level + " " + this.price + "$";
    }
}
