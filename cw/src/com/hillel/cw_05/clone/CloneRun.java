package com.hillel.cw_05.clone;

import com.hillel.cw_04.SystemOutPrint;

public class CloneRun {

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest c1 = new CloneTest(12);
        CloneTest c2 = c1.clone();

        System.out.println("c1 ->>>");
        System.out.println(c1);
        System.out.println(c1.pet);
        System.out.println(c1.pet.getName());
        System.out.println("c2 ->>>");
        System.out.println(c2);
        System.out.println(c2.pet);
        System.out.println(c2.pet.getName());

        System.out.println("change c1.pet.name to 'Sharik'");
        c1.pet.setName("Sharik");
        System.out.println("------------");
        System.out.println(c1.pet.getName());
        System.out.println(c2.pet.getName());
    }
}
