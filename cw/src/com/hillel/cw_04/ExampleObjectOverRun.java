package com.hillel.cw_04;

import java.lang.reflect.InvocationTargetException;

public class ExampleObjectOverRun {
    public static void main(String[] args)
        throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        ExampleOver e1 = new ExampleOver(12);

        System.out.println(e1.getClass().getName());

        e1.getClass().getConstructor().newInstance(e1);// getClass()

        System.out.println(e1.hashCode());
        System.out.println(e1.toString());
        ExampleOver e2 = new ExampleOver(12);
        System.out.println(e1.equals(e2)); // true (==)


    }
}
