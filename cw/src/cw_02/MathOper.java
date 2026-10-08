package cw_02;

public class MathOper {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        double c = 10;
        double d = 3;

        double i =  a / (double) b;

        var j =  a / (double) b;

        var f = a + b;

        System.out.println("a + b = " + (a + b)); // сложение -> 13
        System.out.println("a - b = " + (a - b)); // вычитание -> 7
        System.out.println("a * b = " + (a * b)); // умножение -> 30
        System.out.println("a / b = " + a / b); // деление -> 3.3
        System.out.println("a / b = " + c / d); // деление -> 3.3
        System.out.println("a / b = " + i); // деление -> 3.3
        System.out.println("a / b = " + j); // деление -> 3.3

        System.out.println("a % b = " + (a % b)); // остаток от деления -> 1
    }

}
