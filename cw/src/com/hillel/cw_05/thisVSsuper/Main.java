package com.hillel.cw_05.thisVSsuper;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------");
        Child child2 = new Child("Ivan", "Ivanov", "Ivan", "Ivanov");
        System.out.println(child2);

        Child ch = new Child("1", "2");
        System.out.println(ch);
    }
}
