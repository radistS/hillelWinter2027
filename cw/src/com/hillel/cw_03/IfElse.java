package com.hillel.cw_03;

public class IfElse {
    public static void main(String[] args) {
        int a = 21;
        int b = 20;

//        if (a > b){
//
//        } else
//        {
//
//        }
//
//        if (compare(a, b))
//            System.out.println("TRUE");
//        else if (a == b) {
//            System.out.println("==");
//        } else {
//            System.out.println("FALSE");
//        }
//
//        if (a == b){
//            System.out.println("equals");
//            System.out.println("aaa");
//        }
//
//        boolean rez = (a > b) ? true : false;

        String str = (a > b) ? print1() : print2();

        System.out.println(str);

        boolean bool = a == 20; // false

        boolean boo;
        if (boo = true){
        } else {
        }

        if (!bool){
            System.out.println("false");
        }

        A ca = new A();
        if(ca.b){
            //
        }

        byte by = 10; // byte -> int
        int in = 100; // int

        if (by < in){ // int < int

        }
    }

    private static boolean compare(int a, int b) {
        return a < b;
    }

    static String print1() {
        System.out.println("print1");
        return "1";
    }

    static String print2() {
        System.out.println("print2");
        return "2";
    }
}

class A {
    public boolean b;
}
