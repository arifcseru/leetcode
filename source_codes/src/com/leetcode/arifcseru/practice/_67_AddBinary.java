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
public class _67_AddBinary {

    public String addBinary_ExceptionForLongString(String a, String b) {
        int res = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);

        return Integer.toBinaryString(res);
    }

    public String addBinary(String a, String b) {
        StringBuilder total = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }
            total.append(sum % 2);
            carry = sum / 2;
//            System.out.println("a.charAt(i): " + a.charAt(i) + ", b.charAt(j): " + b.charAt(j) 
//                    + ", Sum: " + sum + ", Carry: " + carry + ", sum % 2: " + sum % 2);
            i--;
            j--;
        }
        if (carry != 0) {
            total.append(carry);
        }
        return total.reverse().toString();
    }

    public static void main(String[] args) {
        // System.out.println(new _67_AddBinary().addBinary("1010", "101"));
        System.out.println(new _67_AddBinary().addBinary("1010", "1011"));
    }
}
