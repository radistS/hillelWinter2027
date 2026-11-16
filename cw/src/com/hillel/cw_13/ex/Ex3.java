package com.hillel.cw_13.ex;

public class Ex3 {
    public static void main(String[] args) {
        var flavors = 30;
        int eaten = 0;
        switch (flavors) {
            case 30: eaten++; // -> 1
            case 40: eaten += 2; // -> 2
            default: eaten--; // -> 2
        }
        System.out.print(eaten);
    }
}
