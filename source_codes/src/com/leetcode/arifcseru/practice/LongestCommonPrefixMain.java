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
public class LongestCommonPrefixMain {

    public String longestCommonPrefix(String[] strs) {
        String longestCommonPrefix = "";
        for (int i = 0; i < strs.length - 1; i++) {
            String firstStr = strs[i];
            String secondStr = strs[i + 1];
            for (int j = 0; j < firstStr.length(); j++) {
                if (secondStr.length() >= j && firstStr.charAt(j) == secondStr.charAt(j)) {
                    longestCommonPrefix += firstStr.charAt(j);
                    System.out.println(j + ".  Found! => " + longestCommonPrefix);
                }
            }
        }
        return longestCommonPrefix;
    }

    public static void main(String[] args) {
        String[] strs = {"Hello", "Hell"};
        System.out.println(new LongestCommonPrefixMain().longestCommonPrefix(strs));
    }
}
