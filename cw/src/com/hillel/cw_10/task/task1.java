package com.hillel.cw_10.task;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

/*
Удаление дубликатов из списка:

Дана коллекция ArrayList с повторяющимися элементами. Напишите программу, которая удаляет все
 дубликаты из списка, сохраняя порядок элементов, и выводит обновленный список.
 */
public class task1 {

    public static void main(String[] args) {
        List<Integer> input = List.of(1,1,2,3,4,5,5,6,7,6,7,8,7,6,7);

        LinkedHashSet<Integer> integers = new LinkedHashSet<>(input);

        System.out.println(integers);


    }

}
