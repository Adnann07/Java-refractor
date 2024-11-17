/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refractor4;

/**
public class FactorialCalculator {

    public int calculateFactorial(int number) {
        if (number < 0) {
            return -1; // Invalid input
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
 */
public class FactorialCalculator {
     public int calculateFactorial(int number)
     {
         if (isNegative(number)) {
           throw new IllegalArgumentException("factorial is invalid");
        }
     else if(number==0)
     {
         return 1;
     }
         
         return computeFactorial(number);
     }
     
     
     private boolean isNegative(int number)
     {
         return number<0;
     }
     
     private int computeFactorial(int number)
     {
          int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
     }
     
     
}
