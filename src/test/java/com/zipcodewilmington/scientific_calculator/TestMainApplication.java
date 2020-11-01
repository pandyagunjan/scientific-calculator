package com.zipcodewilmington.scientific_calculator;
//import com.zipcodewilmington.scientificcalculator.CalcMethods;
import com.zipcodewilmington.scientificcalculator.CalcE;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.zipcodewilmington.scientificcalculator.CalcE.degRad;
import static com.zipcodewilmington.scientificcalculator.CalcE.mPlus;
import static org.junit.Assert.*;

/**
 Updated by Eric 10/31/2020
*/
public class TestMainApplication {
    // private final static Logger logger = Logger.getLogger(MainApplication.class.getName());
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
    public void testInverse(){
        assertEquals("0.25", String.valueOf(CalcE.inverse(4.00)));
    }

    @org.junit.Test
    public void testInverter(){
        assertEquals("-5.0", String.valueOf(CalcE.inverter(5.00)));
    }

    @org.junit.Test
    public void testMemoryPlus(){
        CalcE.memoryPlus(8.00);
        CalcE.memoryPlus(8.00);
        assertEquals("16.0", String.valueOf(mPlus));
    }

    @org.junit.Test
    public void testMemoryClear(){
        CalcE.memoryPlus(8.00);
        CalcE.memoryClear();
        assertEquals("0.0", String.valueOf(mPlus));
    }

    @org.junit.Test
    public void testMemoryRecall(){
        CalcE.memoryPlus(70.00);
        assertEquals("70.0", String.valueOf(CalcE.memoryRecall()));
    }

    @org.junit.Test
    public void testSwitchMode(){
        CalcE.switchUnitsMode("Rad");
        assertEquals("false", String.valueOf(degRad));
    }

    @org.junit.Test
    public void testDegRadConverter(){
        CalcE.switchUnitsMode("Rad");
        assertEquals("0.49999999999999994", String.valueOf(Math.sin(CalcE.degRadConverter(30.00))));
    }

    @org.junit.Test
    public void testLogNat(){
        assertEquals("0.0", String.valueOf(CalcE.logNat(0.00))); //nat log of e is 1, this is as close to e as I can get in java
    }

    @org.junit.Test
    public void testLog(){
        assertEquals("0.0", String.valueOf(CalcE.log(1.00)));
    }

    @org.junit.Test
    public void testLogTen(){
        assertEquals("0.0", String.valueOf(CalcE.logInv(1.00)));
    }

    @org.junit.Test
    public void testAntiLog(){
        assertEquals("1.0", String.valueOf(CalcE.inverse(1.00)));
    }
}