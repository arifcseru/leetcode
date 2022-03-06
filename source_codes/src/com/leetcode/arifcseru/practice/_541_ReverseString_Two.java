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
public class _541_ReverseString_Two {

    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int start = 0; start < a.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, a.length - 1);
            while (i < j) {
                char tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
                j--;
            }
        }
        return new String(a);
    }

    public static void main(String[] args) {
        System.out.println(new _541_ReverseString_Two().reverseStr("HelloWorld", 2));// eHllWoordl
    }
}
