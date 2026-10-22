package com.hillel.cw_06.task;

import java.util.Scanner;

/*
9. Нарисовать треугольник
    Types of Triangles
    1.  Left
    2.  Right
    3.  Center
    Enter a number (1-3):  3
    How many rows?: 6
 */
public class Triangle {
    public static void main(String[] args) {
        System.out.println(" Types of Triangles");
        System.out.println(" 1.  Left");
        System.out.println(" 2.  Center");
        System.out.println(" 3.  Right");
        System.out.println(" Enter a number (1-3):");

        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        System.out.println("How many rows?:");
        int rows = scanner.nextInt();

        if (type == 1) {
            drawLeft(rows);
        } else if (type == 2) {
            drawCenter(rows);
        } else if (type == 3) {
            drawRight(rows);
        }
    }


    /*
      #
     ##
    ###
   ####
    */
    private static void drawRight(int rows) {

    }
    /*
      #
     ###
    #####
   #######
    */
    private static void drawCenter(int rows) {
    }

    /*
   #
   ##
   ###
   ####
    */
    private static void drawLeft(int rows) {
    }

}
