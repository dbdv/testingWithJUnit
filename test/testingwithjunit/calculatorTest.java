/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingwithjunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dani
 */
public class calculatorTest {
    
    static calculator calc;
    String testName;
    
    public calculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        calc = new calculator();
        System.out.println("Welcome to the testing class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("La operación ha finalizado.");
    }
    
    /*@Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    */

    /**
     * Test of add method, of class calculator.
     */
    @Before
    public void testing(){
        
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    
    @After
    public void testFinished(){
        System.out.println("Prueba finalizada, campos en 0");
    }
    
    @Test
    public void testAdd() {
        /*float a = 0.0F;
        float b = 0.0F;
        float expResult = 0.0F;
        float result = calculator.add(a, b);
        */
        assertEquals(4, calculator.add(2, 2), 0.001);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    

    /**
     * Test of substract method, of class calculator.
     */
   /* @Before
    public void testingSubstraction(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() );
    }*/
    
    @Test
    public void testSubstract() {
        /*float a = 0.0F;
        float b = 0.0F;
        float expResult = 0.0F;
        float result = calculator.substract(a, b);
        */
        assertEquals(0, calculator.substract(2, 2), 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /*
    @After
    public void testSubstractFinished(){
        System.out.println("Prueba finalizada, campos en 0");
    }*/

    /**
     * Test of multiply method, of class calculator.
     */
    /*
    @Before
    public void testingMultiply(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() );
    }
    */
    @Test
    public void testMultiply() {
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /*
    @After
    public void testMultiplyFinished(){
        System.out.println("Prueba finalizada, campos en 0");
    }
    */
    /**
     * Test of divide method, of class calculator.
     */
    /*
    @Before
    public void testingDivide(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() );
    }
    */
    
    @Test
    public void testDivide() {
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /*
    @After
    public void testDivideFinished(){
        System.out.println("Prueba finalizada, campos en 0");
    }
    */
}
