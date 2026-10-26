package com.hillel.cw_07.task;

/*
### 2. Сума чисел у рядку
Метод повинен знайти всі числа у рядку та повернути їхню суму.
int sumNumbers(String input);
Приклад: sumNumbers("abc12de3f100") → 7
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumNumbersInString {

    public static void main(String[] args) {
        System.out.println(sumNumbers("abc12de3f100"));
        System.out.println(sumNumbersChar("abc12de3f100"));
        System.out.println(sumNumbersRegExp("abc12de3f100"));
    }

    public static int sumNumbers(String input){
        int sum = 0;

        String[] str = input.split("");
        for (String s : str){
            try{
                int i = Integer.parseInt(s);
                sum += i;
            } catch (NumberFormatException ex){
                continue;
            }
        }
        return sum;
    }

    public static int sumNumbersChar(String input){
        int sum = 0;
        for (char ch : input.toCharArray()){
            if (Character.isDigit(ch)){
                sum += (ch - '0');
            }
        }
        return sum;
    }

    public static int sumNumbersRegExp(String input){
       int sum = 0;
       Matcher math = Pattern.compile("\\d").matcher(input);

       while (math.find()){
           sum += Integer.parseInt(math.group());
       }
       return sum;
    }

}
