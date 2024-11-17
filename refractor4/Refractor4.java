/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refractor4;

/**
 *
 * @author HP
 */
public class Refractor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FactorialCalculator f=new FactorialCalculator();
        System.out.println(f.calculateFactorial(4));
        
        try
        {
            System.out.println(f.calculateFactorial(-6));
        }catch(IllegalArgumentException e)
        {
            System.out.println("error: "+e.getMessage());
        }
    }
    
}
