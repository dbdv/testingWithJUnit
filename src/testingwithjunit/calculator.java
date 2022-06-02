/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingwithjunit;

/**
 *
 * @author dani
 */
public class calculator {

    public static float add(float a, float b) {
        return a + b ;
    }
    
    public static float substract(float a, float b){
        return a-b;
    }
    
    public static float multiply(float a, float b){
        return a*b;
    }
    
    public static float divide(float a, float b){
        if(b == 0)
                throw new ArithmeticException("No se puede dividir por 0;");
        return a/b;
    }
}
