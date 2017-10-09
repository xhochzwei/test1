/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vektorrechnung;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author j.maly2
 */
public class VektorTest {
    
    public VektorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of plus method, of class Vektor.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        Vektor that = null;
        Vektor instance = null;
        Vektor expResult = null;
        Vektor result = instance.plus(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of minus method, of class Vektor.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        Vektor that = null;
        Vektor instance = null;
        Vektor expResult = null;
        Vektor result = instance.minus(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of skalar method, of class Vektor.
     */
    @Test
    public void testSkalar() {
        System.out.println("skalar");
        Vektor that = new Vektor(1,1,0);
        Vektor instance = new Vektor(5,-3,10);
        double expResult = 2.0;
        double result = instance.skalar(that);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of kreuz method, of class Vektor.
     */
    @Test
    public void testKreuz() {
        System.out.println("kreuz");
        Vektor that = new Vektor(1,1,1);
        Vektor instance = new Vektor(1,1,1);
        Vektor expResult = new Vektor(0.0,0.0,0.0);
        Vektor result = instance.kreuz(that);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of quersumme method, of class Vektor.
     */
    @Test
    public void testQuersumme() {
        System.out.println("quersumme");
        Vektor instance = new Vektor(1,1,0);
        double expResult = 2.0;
        double result = instance.quersumme();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.out.println("hello world");
    }

    /**
     * Test of toString method, of class Vektor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vektor instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
