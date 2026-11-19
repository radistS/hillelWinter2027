package com.hillel.cw_14.steams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UbnOrdered {

    public static void main(String[] args) {
            // Створюємо список із мільйона елементів і 100 000 унікальних значень.
            List<Integer> ints = IntStream.range(0, 1_000_000)
                .map(i -> i % 100_000_000)
                .boxed()
                .collect(Collectors.toList());

            // Прогріваємо обидва варіанти, щоб зменшити вплив запуску JVM на заміри.
            for (int i = 0; i < 3; i++) {
                ints.parallelStream().distinct().toArray();
                ints.parallelStream().unordered().distinct().toArray();
            }

            // Вимірюємо час паралельного distinct() зі збереженням порядку першої появи.
            long start = System.nanoTime();
            Object[] ordered = ints.parallelStream()
                .distinct()
                .toArray();
            long orderedNs = System.nanoTime() - start;

            // Виклик unordered() перед distinct() дозволяє не зберігати початковий порядок.
            start = System.nanoTime();
            Object[] unordered = ints.parallelStream()
                .unordered()
                .distinct()
                .toArray();
            long unorderedNs = System.nanoTime() - start;

            // Обидва варіанти мають повернути по 100 000 унікальних елементів.
            System.out.printf("Ordered:   %.2f ms, elements: %d%n",
                orderedNs / 1_000_000.0, ordered.length);
            System.out.printf("Unordered: %.2f ms, elements: %d%n",
                unorderedNs / 1_000_000.0, unordered.length);

            // Додатний відсоток означає, що варіант з unordered() спрацював швидше.
            System.out.printf("Time saved: %+.1f%%%n",
                100.0 * (orderedNs - unorderedNs) / orderedNs);
        }
    }
