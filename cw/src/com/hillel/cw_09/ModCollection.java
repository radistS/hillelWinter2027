package com.hillel.cw_09;

import java.util.ArrayList;
import java.util.List;

public class ModCollection {

    static void main() {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        intList.add(7);

        System.out.println(intList);

        List<Integer> listResult = intList.stream().limit(3).toList();
        System.out.println(listResult);

        List<Integer> listResult1 = intList.stream().skip(2).limit(3).toList();
        List<Integer> listResult2 = intList.stream().limit(3).skip(2).toList();
        System.out.println(listResult1);
        System.out.println(listResult2);


    }

}
