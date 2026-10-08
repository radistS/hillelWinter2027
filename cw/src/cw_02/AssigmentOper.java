package cw_02;

public class AssigmentOper {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        a += b; // a = a + b
        System.out.println("a += b: " + a); // 30

        b -= c; // b = b - c
        System.out.println("b -= c: " + b); // -10

        c *= a; // c = c * a
        System.out.println("c *= a: " + c); // 900

        a /= 2; // a = a / 2
        System.out.println("a /= 2: " + a); // 15

        b %= 3; // b = b % 3
        System.out.println("b %= 3: " + b); // -1

        int rez = 0;

        rez += 100;
        rez +=12;

        System.out.println(rez);

        a = 10;
        b = 12;
        System.out.println(++a * b + a);  // 11 * 12 + 11

        c = 10;
        System.out.println(c++ * --c);
        c = 10;
        System.out.println(++c * c++); // 10 * 11 = 110
        System.out.println(c); // 10
        // 1 - c1 = 11 -> (11)
        // 2 - c2 = 11 -> (12)
        // 3 - c1 * c2 = 11 * 11 = 121
    }

}
