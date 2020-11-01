package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.CalcMethods;

import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.*;

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

    @org.junit.Test
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
    }


}


