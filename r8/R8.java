/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package r8;

/**
 *
 * @author HP
 */
public class R8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VowelCounter v=new VowelCounter();
        System.out.println(v.countVowels("abcdefghijklmnpo"));
        System.out.println(v.countVowels("adnan"));
        
    }
    
}
