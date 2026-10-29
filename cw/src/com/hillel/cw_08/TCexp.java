package com.hillel.cw_08;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Objects;

public class TCexp {

    public static void main(String[] args) throws InterruptedException {
        try {
            System.out.println("1");

            String[] str = new String[5];
            String s = str[5];
            File f = new File("");
            FileInputStream fis = new FileInputStream(f);


            System.out.println("2");
        } catch (FileNotFoundException ex) {
            System.out.println("3");
        }
//        } finally {
//            System.out.println("4");
//        }
        Thread.sleep(50);
        System.out.println("5");
    }


}
