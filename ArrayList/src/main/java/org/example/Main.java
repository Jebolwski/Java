package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {


        // **********************************
        int messi[] = new int[4];
        for (int mess : messi){
            System.out.println(mess);
        }
        // **********************************






        // **********************************
        ArrayList liste = new ArrayList();
        liste.add("MESSİ");
        liste.add("RONALDO");
        liste.add(1);
        liste.add(true);
        for (Object item : liste){
            System.out.println(item);
        }
        // **********************************




        // **********************************
        Headphone rampage = new Headphone("Rampage");
        Headphone razor = new Headphone("Razor");
        Headphone steelseries = new Headphone("Steelseries");

        ArrayList<Headphone> headphoneArrayList = new ArrayList<Headphone>();
        headphoneArrayList.add(rampage);
        headphoneArrayList.add(razor);
        headphoneArrayList.add(steelseries);

        for (Headphone headphone : headphoneArrayList){
            System.out.println(headphone.name);
        }
        // **********************************



        // **********************************
        HashMap<Headphone, String> headphoneHashMap = new HashMap<Headphone, String>();
        headphoneHashMap.put(razor,"8");
        headphoneHashMap.put(steelseries,"9");
        headphoneHashMap.put(rampage,"6");

        for (Headphone item : headphoneHashMap.keySet()){
            System.out.println(item.name+" "+headphoneHashMap.get(item));
        }
        // **********************************
    }
}