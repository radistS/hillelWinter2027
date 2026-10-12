package com.hillel.cw_03;


public class WhileEx {
    public static void main(String[] args) {

        whileExample();
        System.out.println();
        System.out.println("-------");
        doWhileExample();
    }

    static void whileExample(){
        byte a = 10;
        while (a < 10) { // false then nothing
            System.out.print (a++ + " ");
            System.out.println(a);
        }
    }

    static void doWhileExample(){
        byte a = 10;
        do {
            System.out.print(a++ + " ");
            System.out.println(a);
        } while (a < 10); // --> false

    }
}
