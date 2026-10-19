package com.hillel.cw_05.absrt;

public class Main {
    public static void main(String[] args) {
        System.out.println(Human.className);

        Human hm = new Human() {
            @Override
            void print() {
                System.out.println("Hello from anonymous class");
            }
        };

        hm.setName("John");
        hm.setAge(30);
        hm.print();
        System.out.println(hm.toString());

        new MyClass().print().print();
    }
}

class MyClass  {
    public Human print(){
        Human hm = new Human() {
            @Override
            void print() {
                System.out.println("Hello from MyClass class");
            }
        };
        return hm;
    }
}
