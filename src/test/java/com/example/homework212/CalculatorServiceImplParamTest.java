package com.example.homework212;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorServiceImplParamTest {
    private final CalculatorService c = new CalculatorServiceImpl();

    public static Stream<Arguments> plusParams() {
        return Stream.of(
                Arguments.of(2, 2, TestUtils.result(2, 2, "4", "+")),
                Arguments.of(6, 0, TestUtils.result(6, 0, "6", "+")),
                Arguments.of(5, 3, TestUtils.result(5, 3, "8", "+"))
        );
    }

    @ParameterizedTest
    @MethodSource("plusParams")
    void plusTest(int num1, int num2, String expectedResult) {
        String actualResult = c.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    public static Stream<Arguments> minusParams() {
        return Stream.of(
                Arguments.of(2, 2, TestUtils.result(2, 2, "0", "-")),
                Arguments.of(6, 0, TestUtils.result(6, 0, "6", "-")),
                Arguments.of(5, 3, TestUtils.result(5, 3, "2", "-"))
        );
    }

    @ParameterizedTest
    @MethodSource("minusParams")
    void minusTest(int num1, int num2, String expectedResult) {
        String actualResult = c.minus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> multiplyParams() {
        return Stream.of(
                Arguments.of(2, 2, TestUtils.result(2, 2, "4", "*")),
                Arguments.of(6, 0, TestUtils.result(6, 0, "0", "*")),
                Arguments.of(5, 3, TestUtils.result(5, 3, "15", "*"))
        );
    }

    @ParameterizedTest
    @MethodSource("multiplyParams")
    void multiplyTest(int num1, int num2, String expectedResult) {
        String actualResult = c.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> divideParams() {
        return Stream.of(
                Arguments.of(2, 2, TestUtils.result(2, 2, "1.0", "/")),
                Arguments.of(6, 1, TestUtils.result(6, 1, "6.0", "/")),
                Arguments.of(5, 2, TestUtils.result(5, 2, "2.5", "/"))
        );
    }

    @ParameterizedTest
    @MethodSource("divideParams")
    void divideTest(int num1, int num2, String expectedResult) {
        String actualResult = c.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
}
