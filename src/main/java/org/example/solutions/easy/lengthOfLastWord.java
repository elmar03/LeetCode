package org.example.solutions.easy;

public class lengthOfLastWord {
    public int lastWord(String s) {
        String [] words = s.split(" ");
        String lastWord = words[words.length-1];
        return lastWord.length();
    }
}
