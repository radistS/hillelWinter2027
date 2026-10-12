package com.hillel.cw_03;

public class FF {

    public static void main(String[] args) {
        extracted();
        System.out.println("sssss");
    }

    private static void extracted() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    return;
                }
                System.out.print(j + " ");
            }
            System.out.print(i + " ");
        }
    }

}
