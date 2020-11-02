package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.CalculationsMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 Updated by Gunjan 10/31/2020
 */
public class TestMainApplication {
    // private final static Logger logger = Logger.getLogger(LogginLab.class.getName());
    @org.junit.Before
    public void setUp() throws Exception {
    }
    @org.junit.After
    public void tearDown() throws Exception {
    }
    /*@org.junit.Test
    public void testAdditionPositiveUC1() {
        assertEquals("4.0", String.valueOf(CalcMethods.addTheNumbers(2D,2D)));
    }
    @org.junit.Test
    public void testAdditionNegativeUC() {
        assertNotEquals("6.8", String.valueOf(CalcMethods.addTheNumbers(2.2D,2D)));
    }
    @org.junit.Test
    public void testAdditionPositiveUC2() {
        assertEquals("57.0", String.valueOf(CalcMethods.addTheNumbers(55D,2D)));
    }
    @org.junit.Test
    public void testSubtractionPositiveUC1() {
        assertEquals("2.0", String.valueOf(CalcMethods.subtractNumbers(8.5D,6.5D)));
    }
    @org.junit.Test
    public void testSubtractionNegativeUC() {
        assertNotEquals("0.2", String.valueOf(CalcMethods.subtractNumbers(2.2D,2D)));
    }
    @org.junit.Test
    public void testSubtractionPositiveUC2() {
        assertEquals("87.63", String.valueOf(CalcMethods.subtractNumbers(99.85D,12.22D)));
    }
    @org.junit.Test
    public void testExponentPositiveUC1() {
        assertEquals("125.0", String.valueOf(CalcMethods.exponentNumbers(5D,3D)));
    }
    @org.junit.Test
    public void testExponentNegativeUC() {
        assertNotEquals("87.6", String.valueOf(CalcMethods.exponentNumbers(6.2D,5D)));
    }
    @org.junit.Test
    public void testExponentPositiveUC2() {
        assertEquals("1024.0", String.valueOf(CalcMethods.exponentNumbers(4D,5D)));
    }
    @org.junit.Test
    public void testFactorialPositiveUC1() {
        assertEquals("24.0", String.valueOf(CalcMethods.findFactorial(4D)));
    }
    @org.junit.Test
    public void testFactorialNegativeUC() {
        assertNotEquals("87.6", String.valueOf(CalcMethods.findFactorial(4D)));
    }
    @org.junit.Test
    public void testFactorialPositiveUC2() {
        assertEquals("362880.0", String.valueOf(CalcMethods.findFactorial(9D)));
    }
    @org.junit.Test
    public void testInverseSinePositiveUC1() {
        assertEquals("1.5707963267948966", String.valueOf(CalcMethods.inversrseSine(1D)));
    }
    @org.junit.Test
    public void testInverseSineNegativeUC() {
        assertNotEquals("87.6", String.valueOf(CalcMethods.inversrseSine(4D)));
    }
    @org.junit.Test
    public void testInverseSinePositiveUC2() {
        assertEquals("NaN", String.valueOf(CalcMethods.inversrseSine(2D)));
    }*/
    @org.junit.Test
    public void testMultiplication() {
        assertEquals("8.0", String.valueOf(CalculationsMethods.multiplyNumbers(2.00, 4.00)));
    }
    @org.junit.Test
    public void testNegMultiplication() {
        assertEquals("-8.0", String.valueOf(CalculationsMethods.multiplyNumbers(-2.00, 4.00)));
    }
    @org.junit.Test
    public void testDivision() {
            assertEquals("2.0", String.valueOf(CalculationsMethods.divideNumbers(4.00, 2.00)));
        }
    @org.junit.Test
    public void testNegDivision() {
        assertEquals("-2.0", String.valueOf(CalculationsMethods.divideNumbers(-4.00, 2.00)));
    }
    @org.junit.Test
    public void testSquared() {
            assertEquals("9.0", String.valueOf(CalculationsMethods.squared(3.00)));
        }
    @org.junit.Test
    public void testNegSquared() {
        assertEquals("9.0", String.valueOf(CalculationsMethods.squared(-3.00)));
    }
    /*@org.junit.Test
    public void testNegSquared() {
        assertEquals("-8.0", String.valueOf(CalculationsMethods.squared()));
    }*/
    @org.junit.Test
    public void testModulus() {
        assertEquals("-2.0", String.valueOf(CalculationsMethods.Modulus(-10.00, 4.00)));
    }
    @org.junit.Test
    public void testNegModulus() {
        assertEquals("2.0", String.valueOf(CalculationsMethods.Modulus(10.00, 4.00)));
    }
    @org.junit.Test
    public void testSin() {
        assertEquals("-0.9880316240928618", String.valueOf(CalculationsMethods.Sin(30.00)));
    }
    @org.junit.Test
    public void testNegSin() {
        assertNotEquals("1", String.valueOf(CalculationsMethods.Sin(30.00)));
    }
    @org.junit.Test
    public void testCos() {
        assertEquals("0.5253219888177297", String.valueOf(CalculationsMethods.Cos(45.00)));
    }
    @org.junit.Test
    public void testNegCos() {
        assertNotEquals("1", String.valueOf(CalculationsMethods.Sin(45.00)));
    }
    @org.junit.Test
    public void testTan() {
        assertEquals("1.6197751905438615", String.valueOf(CalculationsMethods.Tan(45.00)));
    }

    @org.junit.Test
    public void testNegTan(){
        assertNotEquals("1", String.valueOf(CalculationsMethods.Sin(45.00)));
    }

}









