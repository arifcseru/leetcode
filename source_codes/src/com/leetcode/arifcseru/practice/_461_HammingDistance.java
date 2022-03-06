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
public class _461_HammingDistance {

// list of tables, procedures, data dictionary prepare, 
// prepare remarks for each table
// 
    public int hammingDistance(int x, int y) {
        String xBinStr = Integer.toBinaryString(x);
        String yBinStr = Integer.toBinaryString(y);
        if (yBinStr.length() > xBinStr.length()) {
            return hammingDistance(y, x);
        }
        String yFinal = "";
        int diff = xBinStr.length() - yBinStr.length();
        for (int i = 0; i < diff; i++) {
            yFinal += "0";
        }

        yFinal += yBinStr;
        int i = 0, count = 0;
        while (i < xBinStr.length()) {
            if (xBinStr.charAt(i) != yFinal.charAt(i)) {
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        int res = new _461_HammingDistance().hammingDistance(2, 4);
        System.out.println(res);

        res = new _461_HammingDistance().hammingDistance(680142203, 1111953568);
        System.out.println(res);
    }
}
