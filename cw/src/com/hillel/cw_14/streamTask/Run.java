package com.hillel.cw_14.streamTask;

import java.util.List;

public class Run {

    public static void main(String[] args) {
        StreamTask st = new StreamTask();

        System.out.println(st.getElementLengthAndDistinct(List.of("one", "one", "two")));
        System.out.println(st.rotateElements(List.of("one", "one", "two")));
    }

}
