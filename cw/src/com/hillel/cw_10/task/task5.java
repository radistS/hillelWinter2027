package com.hillel.cw_10.task;
/*
Проверка сбалансированности скобок
Описание. Используя Stack<Character>, проверить, правильно ли в строке расставлены скобки трёх типов: (), {}, [].
Пример. "{[()()]}" → true; "{[(])}" → false.
 */
import java.util.Stack;

public class task5 {

    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();
        String seq = "{{[]()[{}]}}";


        System.out.println("correct");

    }
}

/*
{ - push
    [ - push
        ( - push
            { - push
            } - pop
        ) - pop
        [ - push
        ) - pop
        (
            [
            ]
        )
    ]
}
 */
