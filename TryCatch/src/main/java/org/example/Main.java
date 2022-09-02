package org.example;

public class Main {
    public static void main(String[] args) {
        try{
            int[] dizi = new int[]{1,2,3,4,5,6};
            System.out.println(dizi[5]);
        }catch (Exception exception){
            System.out.println("Hata Oluştu.");
        }finally {
            System.out.println("Bittim.");
        }
    }
}