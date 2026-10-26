package com.hillel.cw_07.str;

public class CreateString {
    public static void main(String[] args) {

        // БЛОК 1. Рядки в String Pool (який розташований у heap)

        // 1. Рядковий літерал
        String a = "Java";

        // 2. Конкатенація констант: компілятор обчислює "Java"
        String b = "Ja" + "va";

        // 3. Конкатенація з константною змінною
        final String PREFIX = "Ja";
        String c = PREFIX + "va";

        // 4. Явне інтернування: отримуємо канонічний рядок із пулу
        String temporary = new String("Java");
        String d = temporary.intern();

        System.out.println(a == b); // true
        System.out.println(a == c); // true
        System.out.println(a == d); // true


        // БЛОК 2. Окремі об’єкти String у heap, поза String Pool

        // 1. new створює окремий об’єкт.
        // Сам літерал "Java" при цьому перебуває в пулі.
        String e = new String("Java");

        // 2. Конкатенація під час виконання
        String prefix = "Ja"; // Не константна змінна
        String f = prefix + "va";

        // 3. concat() з непорожнім рядком
        String g = prefix.concat("va");

        // 4. Перетворення StringBuilder на String
        String h = new StringBuilder()
            .append("Ja")
            .append("va")
            .toString();

        // 5. Створення рядка з масиву символів
        String i = new String(new char[]{'J', 'a', 'v', 'a'});

        System.out.println(a == e); // false
        System.out.println(a == f); // false
        System.out.println(a == g); // false
        System.out.println(a == h); // false
        System.out.println(a == i); // false

        System.out.println(a.equals(e)); // true: однаковий вміст
    }
}
