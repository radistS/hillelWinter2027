package com.hillel.cw_13.ex;

public class Ex2 {
    public static void main(String[] args) {
        var plan = 1;
        plan = plan++ + --plan;
        if (plan == 1) {
            System.out.print("Plan A"); // test 1
        } else {
            if (plan == 2)
                System.out.print("Plan B"); // test2
            else
                System.out.print("Plan C"); // test 3
        }
    }
}

