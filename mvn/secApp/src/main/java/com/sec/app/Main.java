package com.sec.app;

import com.first.app.PinCodeGenerator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        PinCodeGenerator pcg = new PinCodeGenerator();
        System.out.println(pcg.generatePinCode(4));
    }
}
