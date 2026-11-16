package com.hillel.cw_13.ex;

public class Ex5 {
    public static void main(String[] args) {
        final DaysOff input = DaysOff.ValentinesDay;
        switch (input) {
            default:
                break;
            case ValentinesDay:
                System.out.print("1");
            case PresidentsDay:
                System.out.print("2");
//            default:
        }
    }
}

enum DaysOff {
    Thanksgiving, PresidentsDay, ValentinesDay
}
