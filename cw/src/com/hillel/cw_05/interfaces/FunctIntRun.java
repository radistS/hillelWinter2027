package com.hillel.cw_05.interfaces;

public class FunctIntRun {

    public static void main(String[] args) {
        FunctInt fi = (srt, a) -> {
            System.out.println(srt.toUpperCase());
            System.out.println(srt.toUpperCase());
            System.out.println(srt.toUpperCase());
            System.out.println(srt.toUpperCase());

        };
        fi.print("aaaa", 1);
        fi.print("bbbb", 2);
        fi.print("cccc", 3);
        fi.print("ssss", 3);
        fi = (str, a) -> System.out.println("new version " + a);

        fi.print("aaa", 1);
        print("ssss");
    }

    public static void print(String str1) {
        FunctInt fi = (str, a) -> System.out.println("new version method");
        fi.print(str1, 1);
    }
}
