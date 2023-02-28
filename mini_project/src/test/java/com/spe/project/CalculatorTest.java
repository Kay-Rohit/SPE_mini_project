package com.spe.project;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class CalculatorTest
{
    private Calculator objCalcUnderTest;
    private static final double DELTA = 1e-15;
    @Before
    public void setUp() {
        //Arrange
        objCalcUnderTest = new Calculator();
    }
    
    @Test
    public void PowerTruePositive() {
        int x = 2; int b = 3;
        double expectedResult = 8.0;
        //Act
        double result = objCalcUnderTest.x_power_b(x, b);
        //Assert
        assertEquals("Finding factorial for true positive", expectedResult, result, DELTA);    }
}
