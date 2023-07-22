package com.example.homework212;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorServiceImplTest {
    private final CalculatorService c = new CalculatorServiceImpl();

    @Test
    public void testCalculateSum1() {
        // подготовка входных данных
        int num1 = 2;
        int num2 = 2;
        // подготовка ожидаемого результата
        String expectedResult = TestUtils.result(2, 2, "4", "+");
        // начало теста
        String actualResult = c.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculateSum2() {
        // подготовка входных данных
        int num1 = 6;
        int num2 = 0;
        // подготовка ожидаемого результата
        String expectedResult = TestUtils.result(6, 0, "6", "+");
        // начало теста
        String actualResult = c.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculateDifference1() {
        // подготовка входных данных
        int num1 = 2;
        int num2 = 2;
        // подготовка ожидаемого результата
        String expectedResult = TestUtils.result(2, 2, "0", "-");
        // начало теста
        String actualResult = c.minus(num1, num2);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testCalculateDifference2() {
        // подготовка входных данных
        int num1 = 6;
        int num2 = 0;
        // подготовка ожидаемого результата
        String expectedResult = TestUtils.result(6, 0, "6", "-");
        // начало теста
        String actualResult = c.minus(num1, num2);
        assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testCalculateProduct1() {
        // подготовка входных данных
        int num1 = 2;
        int num2 = 2;
        // подготовка ожидаемого результата
        String expectedResult = TestUtils.result(2, 2, "4", "*");
        // начало теста
        String actualResult = c.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testCalculateProduct2() {
        // подготовка входных данных
        int num1 = 6;
        int num2 = 0;
        // подготовка ожидаемого результата
        String expectedResult = TestUtils.result(6, 0, "0", "*");
        // начало теста
        String actualResult = c.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testCalculateQuotient1() {
        // подготовка входных данных
        int num1 = 2;
        int num2 = 2;
        // подготовка ожидаемого результата
        String expectedResult = TestUtils.result(2, 2, "1.0", "/");
        // начало теста
        String actualResult = c.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testCalculateQuotient2() {
        // подготовка входных данных
        int num1 = 0;
        int num2 = 6;
        // подготовка ожидаемого результата
        String expectedResult = TestUtils.result(0, 6, "0.0", "/");
        // начало теста
        String actualResult = c.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testCalculateQuotientByZero() {
        // подготовка входных данных
        int num1 = 1;
        int num2 = 0;
        // подготовка ожидаемого результата
        String expectedMessage = "На ноль делить нельзя";
        // начало теста
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    c.divide(num1, num2);
                });
        assertEquals(expectedMessage, exception.getMessage());

    }
}
