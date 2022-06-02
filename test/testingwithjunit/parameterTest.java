/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingwithjunit;

import static com.sun.org.apache.regexp.internal.RETest.test;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static jdk.nashorn.internal.objects.NativeRegExp.test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author dani
 */

@RunWith (value=Parameterized.class)
public class parameterTest {
    
    float numberA, numberB;
    static float expected;
    static calculator calc;
    
    
    public parameterTest(int numberA, int numberB, int expected) {
        this.expected = expected;
        this.numberA = numberA;
        this.numberB = numberB;
    }
    
    @BeforeClass
    public static void setUpClass() {
        calc = new calculator();
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
     public void testSum() {
         float obtained = calculator.add(numberA, numberB);
         assertEquals("El valor esperado es: "+expected+" y el valor obetnido es: "+ obtained, expected, obtained, 0.001);
    }

    @Parameters
    public static Iterable<Object[]> tomarDatos() {

        int numbers[] = new int[]{8, 7, 15, 2, 0, 20, 10, -1, -9};

        List<Object[]> datos = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                datos.add(new Object[]{numbers[i], numbers[j], numbers[i] + numbers[j]});
                System.out.println(numbers[i] + numbers[j]);
            }
        }

        return datos;
    }

}
