package org.example;

public class Bread extends Food{
    @Override
    public String toString() {
        return this.name + " " + this.deliciousness_level + " " + this.price + "$";
    }
}
