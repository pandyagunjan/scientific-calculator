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
    public void testAddition1() {
        assertEquals("4.0", String.valueOf(CalcMethods.addTheNumbers(2D,2D)));
    }
    @org.junit.Test
    public void testAddition2() {
        assertNotEquals("6.8", String.valueOf(CalcMethods.addTheNumbers(2.2D,2D)));
    }
    @org.junit.Test
    public void testAddition3() {
        assertEquals("57.0", String.valueOf(CalcMethods.addTheNumbers(55D,2D)));

    }
    @org.junit.Test
    public void testSubtraction1() {
        assertEquals("2.0", String.valueOf(CalcMethods.subtractNumbers(8.5D,6.5D)));
    }
    @org.junit.Test
    public void testSubtraction2() {
        assertNotEquals("0.2", String.valueOf(CalcMethods.subtractNumbers(2.2D,2D)));
    }
    @org.junit.Test
    public void testSubtraction3() {
        assertEquals("87.63", String.valueOf(CalcMethods.subtractNumbers(99.85D,12.22D)));

    }

    @org.junit.Test
    public void testExponent1() {
        assertEquals("125.0", String.valueOf(CalcMethods.exponentNumbers(5D,3D)));

    }

    @org.junit.Test
    public void testExponent2() {
        assertNotEquals("87.6", String.valueOf(CalcMethods.exponentNumbers(6.2D,5D)));

    }
    @org.junit.Test
    public void testExponent3() {
        assertEquals("1024.0", String.valueOf(CalcMethods.exponentNumbers(4D,5D)));

    }


}


