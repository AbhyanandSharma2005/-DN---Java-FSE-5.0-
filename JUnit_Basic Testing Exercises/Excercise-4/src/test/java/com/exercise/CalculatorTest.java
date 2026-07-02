package com.exercise;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    // Setup method - runs before each test
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup completed");
    }

    // Teardown method - runs after each test
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown completed");
    }

    @Test
    public void testAddition() {

        // Arrange
        int a = 5;
        int b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(8, result);
    }

    @Test
    public void testMultiplication() {

        // Arrange
        int a = 4;
        int b = 6;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(24, result);
    }
}