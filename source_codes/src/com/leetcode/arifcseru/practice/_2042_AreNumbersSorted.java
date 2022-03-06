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
public class _2042_AreNumbersSorted {

    public boolean areNumbersAscending(String s) {
        s = s + " ";
        int previous = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                String numStr = "";
                while (c >= '0' && c <= '9' && i < s.length() - 1) {
                    numStr = numStr + (c - '0');
                    i++;
                    c = s.charAt(i);
                }
                if (!numStr.isEmpty()) {
                    int num = Integer.valueOf(numStr);
                    if (num > previous) {
                        previous = num;
                    } else {
                        return false;
                    }
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new _2042_AreNumbersSorted().areNumbersAscending("4 5 11 26"));
        System.out.println(new _2042_AreNumbersSorted().areNumbersAscending("hello world 5 x 5"));
        System.out.println(new _2042_AreNumbersSorted().areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"));
        // 
    }
}
