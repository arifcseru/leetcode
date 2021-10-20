/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

/**
 *
 * @author Arifur Rahman
 */
public class _344_ReverseString {

    public void reverseString(char[] s) {
        char[] prepared = new char[s.length];
        int j = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            prepared[j] = s[i];
            j++;
        }
        j = 0;
        for (int i = 0; i < prepared.length; i++) {
            s[j] = prepared[i];
            j++;
        }
    }

    public String getReverseString(String str) {
        String reverseStr = "";
        char[] s = str.toCharArray();
        reverseString(s);
        for (int i = 0; i < s.length; i++) {
            reverseStr += s[i];
        }
        return reverseStr;
    }

    public String reverseWords(String s) {
        String reverseWords = "";
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            word = getReverseString(word);
            if (i == words.length - 1) {
                reverseWords += word;
            } else {
                reverseWords += word + " ";
            }
        }

        return reverseWords;
    }

    public static void main(String[] args) {
        String s = "this is good to see";

        System.out.println(new _344_ReverseString().reverseWords(s));
    }
}
