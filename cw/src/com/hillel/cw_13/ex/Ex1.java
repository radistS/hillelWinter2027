package com.hillel.cw_13.ex;

public class Ex1 {
    public static void main(String[] args) {
        int height = 2, length = 3;
        boolean w = height > 1 | --length < 4;
        System.out.println(height);
        System.out.println(length);
        var x = height != 2 ? length++ : height;
        System.out.println(height);
        System.out.println(length);
        boolean z = height % length == 0;
        System.out.println(w + "-" + x + "-" + z);
    }
}
