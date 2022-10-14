import org.opentest4j.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Calculator2Test {

private Calculator2 underTest;
    @BeforeEach
    void setup(){
        underTest = new Calculator2();
    }
    @Test
    @DisplayName("Should successfully sum two numbers")
    void test1() {
        final int first = 5;
        final int second = 8;
        final int expectedResult = 13;

        final int actualResult = underTest.sum(first,second);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should successfully subtract first number from the second")
    void test2() {
        final int first = 5;
        final int second = 8;
        final int expectedResult = 13;

        final int actualResult = underTest.sum(first,second);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    @DisplayName("Should successfully multiply two numbers")
        void test3() {
            final int first = 5;
            final int second = 8;
            final int expectedResult = 13;

            final int actualResult = underTest.sum(first,second);
            assertEquals(expectedResult, actualResult);

    }

    @Test
    @DisplayName("Should produce 0 when one of the numbers is equal to 0")
            void test4() {
                final int first = 5;
                final int second = 0;
                final int expectedResult = 5;

                final int actualResult = underTest.sum(first,second);
                assertEquals(expectedResult, actualResult);

    }

    @DisplayName("Should successfully divided two numbers")
    void test5() {
        final int first = 40;
        final int second = 8;
        final int expectedResult = 5;

        final int actualResult = underTest.sum(first,second);
        assertEquals(expectedResult, actualResult);
}

    @DisplayName("Should produce 0 when first number is equal to 0")
    void test7() {
        final int first = 0;
        final int second = 5;
        final int expectedResult = 0;

        final int actualResult = underTest.sum(first, second);
        assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Should throw exception when second number is equal to 0")
    void test6() {
        final int first = 5;
        final int second = 0;

        final int actualResult = underTest.sum(first, second);
        assertThrows(IllegalArgumentException.class, () -> underTest.divide(first, second));
    }}