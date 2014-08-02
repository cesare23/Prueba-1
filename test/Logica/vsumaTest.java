/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20
 */
public class vsumaTest {
    
    public vsumaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of vsuma method, of class vsuma.
     */
    @Test
    public void testVsuma() {
        System.out.println("vsuma");
        int valor1 = 4;
        int valor2 = 5;
        vsuma instance = new vsuma();
        int expResult =9;
        int result = instance.vsuma(valor1, valor2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testrestar() {
        System.out.println("restar");
        int valor1 = 5;
        int valor2 = 4;
        vsuma instance = new vsuma();
        int expResult =1;
        int result = instance.restar(valor1, valor2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
