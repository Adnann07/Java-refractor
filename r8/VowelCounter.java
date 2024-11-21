/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r8;

/**
public int countVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
 */
public class VowelCounter {
    private boolean noInput(String input)
    {
        return input ==  null || input.isEmpty();
    }
    
    public int countVowels(String input)
    {
        if(!noInput(input))
        {
            helpCount(input);
        
        return helpCount(input);
        }
        return 0;
    }
    public int helpCount(String input)
    {
         int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
           
    }
        return count;
      
}
}

