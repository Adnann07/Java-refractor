/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refractor3;

/**
 *
 * @author HP
 */
public class Refractor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentGrades s1= new StudentGrades();
        System.out.println(s1.getGrade(100));
        System.out.println(s1.getGrade(80));
        System.out.println(s1.getGrade(-5));
    }
    
}
