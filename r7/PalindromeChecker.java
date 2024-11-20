/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r7;

/**
 *
 * @author HP
 */
public class PalindromeChecker {
    public boolean isPalindrome(String str)
    {
        if(str.isEmpty() || str==null)
        {
            return false;
        }
        int length=str.length();
        return checkPalindrome(str,length);
        
    }
    private boolean checkPalindrome(String str,int length)
    {
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false; // Not a palindrome
            }
        }
        return true;
    }
    
}
