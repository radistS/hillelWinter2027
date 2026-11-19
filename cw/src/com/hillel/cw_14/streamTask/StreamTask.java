package com.hillel.cw_14.streamTask;

import com.hillel.cw_14.streamExample.businessObject.User;
import java.util.List;
import java.util.stream.Stream;

public class StreamTask {

    // Перетворити список рядків у список їх довжин.
    public List<Integer> getElementLength(List<String> input){
        return input.stream()
            .map(String::length)
            .toList();
    }

    // Перетворити список рядків у їх довжини та видалити дублікати.
    public List<Integer> getElementLengthAndDistinct(List<String> input){ // one, one, two
        return input.stream()
//                .distinct()    // 2
                .map(String::length)
              .distinct()    // 1
                .toList();
    }

    // Перетворити список слів у список перших літер.
    public List<String> getFirstCharacterOfString(List<String> input){
        return input.stream()
            .map(s -> s.charAt(0))
            .map(String::valueOf)
            .toList();
    }

    // Додати лог "Обробляю: <елемент>" під час обробки.
    public List<String> addLogDuringWork(List<String> input){
        return  input.stream()
            .peek(s -> System.out.println("update element : " + s))
            .toList();
    }

    // Перетворити список Person у список імен.
    public List<String> getFulName(List<User> input){
        return null;
    }

    //Напишите программу, которая сдвигает все элементы массива на одну позицию влево, а первый элемент перемещает в конец массива.
    // a b c d -> b d c a
    public List<String> rotateElements(List<String> input){
        return Stream.concat(
            input.stream().skip(1),
            input.stream().limit(1)
        ).toList();

    }

}
