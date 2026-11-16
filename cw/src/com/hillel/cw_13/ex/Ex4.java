package com.hillel.cw_13.ex;

public class Ex4 {
    public static void main(String[] args) {
        boolean balloonInflated = false;
        do {
            System.out.println("--->");
            if (!balloonInflated) {
                balloonInflated = true;
                System.out.print("inflate-");
            }
            System.out.println(balloonInflated);
        } while (!balloonInflated);
        System.out.println("done");
    }
}
