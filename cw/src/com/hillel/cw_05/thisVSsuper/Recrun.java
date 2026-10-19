package com.hillel.cw_05.thisVSsuper;

public class Recrun {
    public static void main(String[] args) {
        Str st = new Str(1, "Ivan", "Ivanov");
        System.out.println(st);

        System.out.println(st.id());
        System.out.println(st.email());
        System.out.println(st.name());

    }


}
