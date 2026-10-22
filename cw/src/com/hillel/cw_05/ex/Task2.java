package com.hillel.cw_05.ex;

public class Task2 {

    // state

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        if (a > b) {
           int d = 7;
           A ca = new A();
           int d1 = ca.d;
        }

        int c = a++ + --b + ++a - b--;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }


}

class A {

    public int d = 0;

}
