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
public class _10_RegularExpressionMatching {

    public boolean isMatch(String s, String p) {
        boolean isMatch = p.charAt(0) == '.' && s.length() >= 0 ? true : false;
        for (int i = 0; i < s.length(); i++) {
            char matchChar = p.charAt(i);
            if (matchChar == s.charAt(i) || matchChar == '*') {
                isMatch = true;
            } else {
                isMatch = false;
            }
        }
        return isMatch;
    }

    public static void main(String[] args) {
        System.out.println(new _10_RegularExpressionMatching().isMatch("ab", "a"));
    }
}
