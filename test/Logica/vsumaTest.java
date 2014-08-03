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
 * @author juliocesar
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
        Double valor1 = 5.0;
        Double valor2 = 3.0;
        vsuma instance = new vsuma();
        Double expResult = 8.0;
        Double result = instance.vsuma(valor1, valor2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class vsuma.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        Double valor1 = 5.0;
        Double valor2 = 4.0;
        vsuma instance = new vsuma();
        Double expResult = 1.0;
        Double result = instance.restar(valor1, valor2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
