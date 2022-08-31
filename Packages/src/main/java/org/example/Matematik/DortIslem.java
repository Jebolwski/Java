package org.example.Matematik;

public class DortIslem {
    public static int ekle(int... sayilar){
        int toplam = 0;
        for (int sayi : sayilar){
            toplam+=sayi;
        }
        return toplam;
    }

    public static int cikar(int sayi1, int sayi2){
        int toplam = sayi1 - sayi2;
        return toplam;
    }

}
