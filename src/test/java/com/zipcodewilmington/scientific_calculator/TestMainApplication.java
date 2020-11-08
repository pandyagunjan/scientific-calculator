package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.CalcE;
import com.zipcodewilmington.scientificcalculator.CalcMethods;
import com.zipcodewilmington.scientificcalculator.CalculationsMethods;

import static com.zipcodewilmington.scientificcalculator.CalcE.degRad;
import static com.zipcodewilmington.scientificcalculator.CalcE.mPlus;

import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.*;


public class TestMainApplication {
    // private final static Logger logger = Logger.getLogger(LogginLab.class.getName());

    CalcMethods calcTestG= new CalcMethods();

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    //           Test Cases by Gunjan
    @org.junit.Test
    public void testAdditionPositiveUC1() {
        assertEquals("4.0", String.valueOf(calcTestG.addTheNumbers(2D, 2D)));
    }

    @org.junit.Test
    public void testAdditionNegativeUC() {
        assertNotEquals("6.8", String.valueOf(calcTestG.addTheNumbers(2.2D, 2D)));
    }

    @org.junit.Test
    public void testAdditionPositiveUC2() {
        assertEquals("57.0", String.valueOf(calcTestG.addTheNumbers(55D, 2D)));

    }

    @org.junit.Test
    public void testSubtractionPositiveUC1() {
        assertEquals("2.0", String.valueOf(calcTestG.subtractNumbers(8.5D, 6.5D)));
    }

    @org.junit.Test
    public void testSubtractionNegativeUC() {
        assertNotEquals("0.2", String.valueOf(calcTestG.subtractNumbers(2.2D, 2D)));
    }

    @org.junit.Test
    public void testSubtractionPositiveUC2() {
        assertEquals("87.63", String.valueOf(calcTestG.subtractNumbers(99.85D, 12.22D)));

    }

    @org.junit.Test
    public void testExponentPositiveUC1() {
        assertEquals("125.0", String.valueOf(calcTestG.exponentNumbers(5D, 3D)));

    }

    @org.junit.Test
    public void testExponentNegativeUC() {
        assertNotEquals("87.6", String.valueOf(calcTestG.exponentNumbers(6.2D, 5D)));

    }

    @org.junit.Test
    public void testExponentPositiveUC2() {
        assertEquals("1024.0", String.valueOf(calcTestG.exponentNumbers(4D, 5D)));

    }

    @org.junit.Test
    public void testFactorialPositiveUC1() {
        assertEquals("24.0", String.valueOf(calcTestG.findFactorial(4D)));

    }

    @org.junit.Test
    public void testFactorialNegativeUC() {
        assertNotEquals("87.6", String.valueOf(calcTestG.findFactorial(4D)));

    }

    @org.junit.Test
    public void testFactorialPositiveUC2() {
        assertEquals("362880.0", String.valueOf(calcTestG.findFactorial(9D)));

    }

    @org.junit.Test
    public void testInverseSinePositiveUC1() {
        assertEquals("1.5707963267948966", String.valueOf(calcTestG.inversrseSine(1D)));

    }

    @org.junit.Test
    public void testInverseSineNegativeUC() {
        assertNotEquals("87.6", String.valueOf(calcTestG.inversrseSine(4D)));

    }

    @org.junit.Test
    public void testInverseSinePositiveUC2() {
        assertEquals("NaN", String.valueOf(calcTestG.inversrseSine(2D)));
    }

    @org.junit.Test
    public void testInverseCoSinePositiveUC1() {
        assertEquals("0.0", String.valueOf(calcTestG.inverseCosine(1D)));

    }

    @org.junit.Test
    public void testInverseCoSineNegativeUC() {
        assertNotEquals("87.6", String.valueOf(calcTestG.inverseCosine(4D)));

    }

    @org.junit.Test
    public void testInverseCoSinePositiveUC2() {
        assertEquals("NaN", String.valueOf(calcTestG.inverseCosine(2D)));
    }

    @org.junit.Test
    public void testInverseTanPositiveUC1() {
        assertEquals("0.7853981633974483", String.valueOf(calcTestG.invserseTangent(1D)));
    }

    @org.junit.Test
    public void testInverseTanNegativeUC() {
        assertNotEquals("87.6", String.valueOf(calcTestG.invserseTangent(4D)));

    }

    @org.junit.Test
    public void testInverseTanPositiveUC2() {
        assertEquals("1.1071487177940904", String.valueOf(calcTestG.invserseTangent(2D)));
    }

    @org.junit.Test
    public void testcubeRootPositiveUC1() {
        assertEquals("1.2599210498948732", String.valueOf(calcTestG.cubeRoot(2D)));
    }

    @org.junit.Test
    public void testcubeRootNegativeUC1() {
        assertNotEquals("1.1071487177940904", String.valueOf(calcTestG.cubeRoot(2D)));
    }

    @org.junit.Test
    public void testcubeRootPositiveUC2() {
        assertEquals("1.2599210498948732", String.valueOf(calcTestG.cubeRoot(2D)));
    }

    @org.junit.Test
    public void testTenthPowPositiveUC1() {
        assertEquals("100.0", String.valueOf(calcTestG.tenthPow(2D)));
    }

    @org.junit.Test
    public void testTenthPowNegativeUC1() {
        assertNotEquals("15.0", String.valueOf(calcTestG.tenthPow(2D)));
    }

    @org.junit.Test
    public void testTenthPowPositiveUC2() {
        assertEquals("100000.0", String.valueOf(calcTestG.tenthPow(5D)));
    }
//           Test Cases by Eric

/*

    @org.junit.Test
    public void testInverse() {
        assertEquals("0.25", String.valueOf(CalcE.inverse(4.00)));
    }

    @org.junit.Test
    public void testInverter() {
        assertEquals("-5.0", String.valueOf(CalcE.inverter(5.00)));
    }

    @org.junit.Test
    public void testMemoryPlus() {
        CalcE.memoryPlus(8.00);
        CalcE.memoryPlus(8.00);
        assertEquals("16.0", String.valueOf(mPlus));
    }

    @org.junit.Test
    public void testMemoryClear() {
        CalcE.memoryPlus(8.00);
        CalcE.memoryClear();
        assertEquals("0.0", String.valueOf(mPlus));
    }

    @org.junit.Test
    public void testMemoryRecall() {
        CalcE.memoryClear();
        CalcE.memoryPlus(70.00);
        assertEquals("70.0", String.valueOf(CalcE.memoryRecall()));
    }

    @org.junit.Test
    public void testSwitchMode() {
        CalcE.switchUnitsMode("Rad");
        assertEquals("false", String.valueOf(degRad));
    }

    @org.junit.Test
    public void testDegRadConverter() {
        CalcE.switchUnitsMode("Rad");
        assertEquals("0.49999999999999994", String.valueOf(Math.sin(CalcE.degRadConverter(30.00))));
    }

    @org.junit.Test
    public void testLogNat() {
        assertEquals("0.0", String.valueOf(CalcE.logNat(0.00))); //nat log of e is 1, this is as close to e as I can get in java
    }

    @org.junit.Test
    public void testLog() {
        assertEquals("0.0", String.valueOf(CalcE.log(1.00)));
    }

    @org.junit.Test
    public void testLogTen() {
        assertEquals("0.0", String.valueOf(CalcE.logInv(1.00)));
    }

    @org.junit.Test
    public void testAntiLog() {
        assertEquals("1.0", String.valueOf(CalcE.inverse(1.00)));
    }


//           Test Cases by Munir


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
    public void testNegTan() {
        assertNotEquals("1", String.valueOf(CalculationsMethods.Sin(45.00)));
    }
*/
}



