package com.hillel.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcTest {

    private Calc calc;

    @BeforeEach
    void initConfig(){
        calc = new Calc();
    }

    @Test
    void add() {
        Assertions.assertEquals(3, calc.add(1, 2 ));
    }

    @Test
    void div() {
        Assertions.assertEquals(1, calc.div(2, 2 ));
    }

    @Test
    void div_by_zero() {
        Assertions.assertThrows(ArithmeticException.class, () ->  calc.div(2, 0 ));
    }

    @Test
    void sub() {
        Assertions.assertEquals(0, calc.sub(2, 2 ));
    }
}
