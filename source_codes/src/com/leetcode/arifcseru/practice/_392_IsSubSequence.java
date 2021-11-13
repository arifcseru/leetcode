/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

/**
 *
 * @author Arifur Rahman Given two strings s and t, return true if s is a
 * subsequence of t, or false otherwise.
 *
 * A subsequence of a string is a new string that is formed from the original
 * string by deleting some (can be none) of the characters without disturbing
 * the relative positions of the remaining characters. (i.e., "ace" is a
 * subsequence of "abcde" while "aec" is not).
 */
public class _392_IsSubSequence {

    public boolean isSubsequence(String s, String t) {
        boolean subSequenceFound = true;
        int i = 0, j = 0;
        String tempStr = t;
        while (i < s.length()) {
            char si = s.charAt(i);
            int charLocation = tempStr.indexOf(String.valueOf(si));
            // System.out.println("si: " + si + ", tempStr: " + tempStr+ ", charLocation: " + charLocation);
            if (charLocation > -1) {
                j = charLocation;
                i++;
                tempStr = tempStr.substring(j+1, tempStr.length());
            } else {
                subSequenceFound = false;
                break;
            }
        }
        return subSequenceFound;
    }

    public static void main(String[] args) {
        System.out.println(new _392_IsSubSequence().isSubsequence("abc", "ahbgdc"));
        System.out.println(new _392_IsSubSequence().isSubsequence("acb", "ahbgdc"));
        System.out.println(new _392_IsSubSequence().isSubsequence("ace", "abcde"));
        System.out.println(new _392_IsSubSequence().isSubsequence("aec", "abcde"));
        System.out.println(new _392_IsSubSequence().isSubsequence("axc", "ahbgdc"));
        System.out.println(new _392_IsSubSequence().isSubsequence("aaaaaa", "bbaaaa"));
        System.out.println(new _392_IsSubSequence().isSubsequence("twn", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxtxxxxxxxxxxxxxxxxxxxxwxxxxxxxxxxxxxxxxxxxxxxxxxn"));

    }
}
