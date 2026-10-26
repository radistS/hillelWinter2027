package com.hillel.cw_07.task;
/*
### 1. Сжатий рядок (Compression)
Реалізуй метод:
String compress(String input);

Приклад:
compress("aaabccdddda") → "a3bc2d4a"
Якщо символ зустрічається один раз — не додавати цифру.
 */

public class Compress {

    public static void main(String[] args) {
        String text = "aaabccdddda";
        System.out.println(text);
        String compText = compress("aaabccdddda");
        System.out.println(compText);
        String decompText = decompress(compText);
        System.out.println(decompText);
        System.out.println(text.equals(decompText));

    }

    public static String compress(String input){
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= input.length(); i++){
            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)){
                count++;
            } else{
                sb.append(input.charAt(i - 1));
                if (count > 1){
                    sb.append(count);
                }
                count = 1;
            }
        }

        return sb.toString();
    }

    public static String decompress(String input){
       return null;
    }

}
