package com.hillel.tests;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@Tag("smoke")
public class TestClazz {

    @Test
    void add(){
        assertEquals(10, 5 + 5);
    }

    @Tag("check_1")
    @ParameterizedTest
    @ValueSource(strings = {"abc", "bca", "cab"})
    void check(String str){
        assertTrue(str.contains("a"));
    }

    @Disabled
    @RepeatedTest(value = 10, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    @DisplayName("RepeatingTest")
    void customDisplayName(RepetitionInfo repInfo, TestInfo testInfo) {
        int i = 3;
        System.out.println(testInfo.getDisplayName() +
            "-->" + repInfo.getCurrentRepetition()
        );

        assertEquals(repInfo.getCurrentRepetition(), i);
    }
    @Test
    public void testAssertTrue() {
        assertTrue(true); // will pass
        assertFalse(false); // will fail
    }

    @Test
    public void testAssertFalse() {
        assertFalse(false); // will pass
//        assertFalse(true); // will fail
    }

    @Test
    public void testAssertNull() {
        assertNull(null);
//        assertNull("test"); // will fail
    }

    @Test
    public void testAssertNonNull() {
        assertNotNull("test");
//        assertNotNull(null); // will fail
    }

    @Test
    public void testAssertEquals() {
        String actual = "1";
        String expected = "1";

        assertEquals(expected, actual);
    }

    @Test
    public void testAssertNotEquals() {
        String actual = "1";
        String expected = "2";

        assertNotEquals(expected, actual);
    }

    @Test
    @Disabled
    void testAssertAll() {
        assertAll(
            () -> assertEquals("1", "1"),
            () -> assertEquals("1", "2"),
            () -> assertTrue(2 == 2)
        );
    }

}
