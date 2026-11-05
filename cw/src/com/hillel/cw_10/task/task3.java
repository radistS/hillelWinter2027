package com.hillel.cw_10.task;

import java.awt.image.SinglePixelPackedSampleModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
Реверс слов в предложении:

Например, "Hello World" станет "World Hello".
 */
public class task3 {

    public static void main(String[] args) {
        System.out.println(reverse("Hello world")); //World hello

    }

    public static String reverse(String str) {
        LinkedList<String> words = new LinkedList<>(Arrays.asList(str.split(" ")));
        List<String> output = new ArrayList<>();
        while (!words.isEmpty()){
            output.add(words.removeLast());
        }
        return String.join(" ", output);
    }

}
