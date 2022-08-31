package org.example;

public class Main {
    public static void main(String[] args) {
        Wrestler colby = new Wrestler("Colby");
        System.out.println(colby.name);
        colby.Wrestle();
        for (int i=0;i<15;i++){
            if(i==11 || i==14){
                colby.lose();
            }
            else{
                colby.win();
            }
        }



    }
}