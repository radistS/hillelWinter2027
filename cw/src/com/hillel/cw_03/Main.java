package com.hillel.cw_03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        String s1 = args[0];
//        String s2 = args[1];
//        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));

        short s = 0;
        System.out.println(describe(0));
        System.out.println(describe(0L));
        System.out.println(describe(s));
        System.out.println(describe("Hello"));
        System.out.println(describe(3.14D));
        System.out.println(describe(false));
        System.out.println(describe(new ArrayList()));
    }

   private static String describe(Object obj) {
        return null;
   }


}
