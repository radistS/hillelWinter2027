package com.hillel.cw_10.task;

/*
Поиск пересечения двух массивов:

Напишите программу, которая находит пересечение двух массивов целых чисел, используя HashSet. Ваша
программа должна вернуть новый массив с элементами, которые присутствуют в обоих массивах.
--> [6, 7, 8, 9]
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class task4 {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] arr1 = {6,7,8,9,11,12,12};

        System.out.println(Arrays.toString(peresech(arr, arr1)));
    }

    public static Integer[] peresech(Integer[] a, Integer[] b){
        Set<Integer> set = new HashSet<>(List.of(a));
        Set<Integer> result =  new HashSet<>();

        System.out.println(set.retainAll(new HashSet<>(List.of(b))));

        for (int i : b){
            if (set.contains(i)){
                result.add(i);
            }
        }
        return result.toArray(Integer[]::new);
    }

}
