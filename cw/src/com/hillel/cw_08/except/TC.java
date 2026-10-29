package com.hillel.cw_08.except;


public class TC {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(exceptionExample());
    }

    private static String exceptionExample() throws InterruptedException {
        try {
            System.out.println("1");
            if (true)
//            if (false)
                throw new RuntimeException();

            System.out.println("2");
            return "r1";
        } catch (RuntimeException ex) {
            System.out.println("3");
            return "r2";
        } finally {
            System.out.println("4");

        }
    }
}
