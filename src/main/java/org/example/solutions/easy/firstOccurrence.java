package org.example.solutions.easy;

public class firstOccurrence {
    public int strStr(String haystack, String needle) {

        int n= needle.length();
        int k = haystack.length();
        for(int i = 0; i<k && k-i>=n; i++){
            if(haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
