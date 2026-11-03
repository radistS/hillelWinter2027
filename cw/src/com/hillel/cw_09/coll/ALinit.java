package com.hillel.cw_09.coll;

import java.util.ArrayList;

public class ALinit {
    public static void main(String[] args) {
        ArrayList<String> arrS = new ArrayList<>(15); // 10
        ArrayList<String> arrSt = new ArrayList<>(2_000); // 10


        System.out.println(arrS.size()); //-> 0
//        arrS.set(0, null);
        arrS.add(null);
        arrS.add(null);
        arrS.add(null);
        arrS.add(null);
        arrS.add(null);
        arrS.add(4, null);
        System.out.println(arrS.size()); //-> 6 --> mass length = 15

        arrS.trimToSize();
        System.out.println(arrS.size()); //-> 6 -->mass length = 6

        arrS.ensureCapacity(100);
        arrS.ensureCapacity(4);
        System.out.println(arrS.size()); //-> 6 -->mass length = 6
        System.out.println(arrS);
    }
}
