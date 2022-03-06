/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

/**
 *
 * @author User
 */
public class _409_LongestPalindrome {

    public int longestPalindrome(String s) {
        int[] charArray = new int['z' - 'A' + 1];
        for (int i = 0; i < s.length(); i++) {
            charArray[s.charAt(i) - 'A']++;
        }
        int total = 0;
        boolean hasAnOdd = false;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] % 2 == 0) {
                total += charArray[i];
            } else {
                hasAnOdd = true;
                total += (charArray[i] - 1);
            }
        }
        return hasAnOdd ? total + 1 : total;
    }

    public static void main(String[] args) {
        new _409_LongestPalindrome().longestPalindrome("abccccdd");
    }
}
