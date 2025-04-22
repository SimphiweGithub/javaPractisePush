/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javaapplication40;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simphwe Khumalo
 */
public class JavaApplication40Test {
    
    public JavaApplication40Test() {
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
     * Test of main method, of class JavaApplication40.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JavaApplication40.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of booleanReturn method, of class JavaApplication40.
     */
    @Test
    public void testBooleanReturn() {
        System.out.println("booleanReturn");
        boolean expResult = true;
        boolean result = JavaApplication40.booleanReturn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testStringReturn() {
        System.out.println("StringReturn");
        String expResult = "Name";
        String result = JavaApplication40.StringReturn();
        assertEquals(expResult, result);
       
        
        // TODO review the generated test code and remove the default call to fail.
        
    }@Test
    public void testassertFalseEquals() {
        System.out.println("StringReturn");
        int ll =5;
        int age = 0;
        //assertTrue(JavaApplication40.assertFalseEquals()==ll);
        assertTrue(JavaApplication40.assertFalseEquals()>0);
       
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    
}
