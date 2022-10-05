package org.example;

public class Lasagne extends Food{
    public Lasagne(int price,int deli_lev,String name){
        this.price=price;
        this.deliciousness_level=deli_lev;
        this.name=name;
    }

    @Override
    public String toString() {
        return this.name + " " + this.deliciousness_level + " " + this.price + "$";
    }
}
