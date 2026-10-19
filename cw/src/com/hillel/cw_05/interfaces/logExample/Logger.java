package com.hillel.cw_05.interfaces.logExample;

public interface Logger {

    int a = 0;

    void printLog(String msg);

    default void xxx(int b){
        System.out.println(a);
    };

    default void print() {
        System.out.println("print from interface");
    }
}
