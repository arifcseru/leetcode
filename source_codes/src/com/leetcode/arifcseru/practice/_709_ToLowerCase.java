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
public class _709_ToLowerCase {

    public String toLowerCase(String s) {
        String finalStr = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                finalStr += Character.toLowerCase(s.charAt(i));
            } else {
                finalStr += s.charAt(i);
            }
        }
        return finalStr;
    }

    public static void main(String[] args) {
        System.out.println(new _709_ToLowerCase().toLowerCase("Hello"));
    }
}
