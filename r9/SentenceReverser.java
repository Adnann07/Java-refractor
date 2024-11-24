/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r9;

/**
public class SentenceReverser {

    public String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            reversedSentence.append(reversedWord).append(" ");
        }
        return reversedSentence.toString().trim();
    }
}
 */
public class SentenceReverser {
    public String reverseWords(String sentence)
    {
        if(sentence == null || sentence.isEmpty())
        {
            return "";
        }
        
        String[] words=sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();
        
        for(String word:words)
        {
            reversedSentence.append(reverseWord(word)).append(" ");
        }
        return reversedSentence.toString().trim();
    }
    private String reverseWord(String word)
    {
        return new StringBuilder(word).reverse().toString();
    }
}
