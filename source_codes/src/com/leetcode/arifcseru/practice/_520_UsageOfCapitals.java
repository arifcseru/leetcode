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
public class _520_UsageOfCapitals {

    public boolean detectCapitalUse(String word) {
        int totalCapital = 0;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z' && !(word.charAt(i + 1) >= 'a' && word.charAt(i + 1) <= 'z')) {
                return false;
            } else if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                char c = word.charAt(i);
                while (c >= 'A' && c <= 'Z' && i < word.length()) {
                    c = word.charAt(i);
                    totalCapital++;
                    i++;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {

    }
}
