package com.hillel.cw_09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ALvsLLaddLast {
    public static void main(String[] args) {
        int count = 100_000;

        for (int attempt = 1; attempt <= 5; attempt++) {
            System.out.println("Attempt #" + attempt);

            measure("ArrayList  START", new ArrayList<>(), count, true);
            measure("LinkedList START", new LinkedList<>(), count, true);

            measure("ArrayList  END  ", new ArrayList<>(), count, false);
            measure("LinkedList END  ", new LinkedList<>(), count, false);

            System.out.println();
        }
    }

    private static void measure(
        String name,
        List<String> list,
        int count,
        boolean addToStart) {

        long start = System.nanoTime();

        for (int i = 0; i < count; i++) {
            if (addToStart) {
                list.add(0, "element");
            } else {
                list.add("element");
            }
        }

        double durationMs = (System.nanoTime() - start) / 1_000_000.0;

        System.out.printf(
            "%s: %10.3f ms, size: %d%n",
            name, durationMs, list.size()
        );
    }
}
