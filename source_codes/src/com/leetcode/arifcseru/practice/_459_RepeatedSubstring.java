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
public class _459_RepeatedSubstring {

    public boolean repeatedSubstringPattern_Outdated(String s) {
        int len = s.length();
        int i = len / 2;
        int j = 0;
        while (i > 0) {
            String substr = s.substring(0, i);
            String temp = "";
            while (j < len) {
                temp += substr;
                // System.out.println("temp: " + temp + ", s:" + s);
                if (temp.equals(s)) {
                    return true;
                }
                j++;
            }
            j = 0;
            i--;
        }
        return false;
    }

    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        int i = len / 2;
        while (i > 0) {
            String substr = s.substring(0, i);
            if ((s.length() - substr.length()) == substr.length() && (substr + substr).equals(s)) {
                return true;
            }
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < (len / substr.length()); j++) {
                temp.append(substr);
            }

            // System.out.println("s.length() / substr.length():" + s.length() / substr.length() + ", temp: " + temp + ", s:" + s);
            if (temp.toString().equals(s)) {
                return true;
            }
            i--;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new _459_RepeatedSubstring().repeatedSubstringPattern("bcbcbc"));
        System.out.println(new _459_RepeatedSubstring().repeatedSubstringPattern("abcabcabcabc"));
        System.out.println(new _459_RepeatedSubstring().repeatedSubstringPattern("abab"));
        System.out.println(new _459_RepeatedSubstring().repeatedSubstringPattern("aba"));
        System.out.println(new _459_RepeatedSubstring().repeatedSubstringPattern("babbabbabbabbab"));

    }
}
