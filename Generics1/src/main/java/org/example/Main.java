package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pizza italianPizza = new Pizza();
        italianPizza.name="Italian Pizza";
        italianPizza.deliciousness_level=9;
        italianPizza.price=100;

        Pizza turkoPizza = new Pizza();
        turkoPizza.name="Turkish Pizza";
        turkoPizza.deliciousness_level=7;
        turkoPizza.price=40;

        Pizza romanianPizza = new Pizza();
        romanianPizza.name="Romanian Pizza";
        romanianPizza.deliciousness_level=8;
        romanianPizza.price=80;

        Lasagne italianLasagne = new Lasagne(34,8,"Italian Pizza");

        ArrayList<Food> FoodList = new ArrayList<>();
        FoodList.add(turkoPizza);
        FoodList.add(italianLasagne);
        FoodList.add(romanianPizza);

        System.out.println(FoodList);

        announce("Messi",14,4,"Blue","Argentina",169,165);

    }

     static void announce(String name,int wins,int losses,String corner_color,String fighting_out_of,int height,int weight){
        System.out.println("Fighting out of the "+corner_color+" corner."+" He stands "+height+" cm tall, weign-in at "+weight+" pounds ,"
                +" introducing "+name+"!");
    }
}