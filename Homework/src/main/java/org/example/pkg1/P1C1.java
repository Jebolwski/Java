package org.example.pkg1;

import org.example.pkg2.P2C1;

public class P1C1 extends P2C1 {
    public static void main(){
        P1C2 p1c2 = new P1C2();
        p1c2.number=10;
        p1c2.number2=30;
        P2C1 p2c1 = new P2C1();
        p2c1.number=10;
        P1C1 p1c1 = new P1C1();
        p1c1.number1=10;

    }
}
