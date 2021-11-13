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
public class _415_AddStrings {

    public String addStrings(String num1, String num2) {
        if (num1.length() < num2.length()) {
            return addStrings(num2, num1);
        }
        String leadingZeros = "";
        for (int i = num2.length(); i < num1.length(); i++) {
            leadingZeros += "0";
        }
        num2 = leadingZeros + num2;

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder finalRes = new StringBuilder();
        int carry = 0, lastDigit = 0;
        while (i >= 0 || j >= 0) {
            int valOne = num1.charAt(i) - '0';
            int valTwo = num2.charAt(j) - '0';
            if ((carry + valOne + valTwo) / 10 > 0) {
                lastDigit = (carry + valOne + valTwo) % 10;
                carry = (carry + valOne + valTwo) / 10;
                System.out.println("lastDigit: " + lastDigit + ", carry: " + carry);
            } else {
                lastDigit = carry + valOne + valTwo;
                carry = 0;
            }
            finalRes.append(lastDigit);
            System.out.println("num1Int: " + valOne + ", num2Int: " + valTwo);
            i--;
            j--;
        }
        if (carry > 0) {
            finalRes.append(carry);
        }
        System.out.println("i: " + i + ", j:" + j);

        return finalRes.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new _415_AddStrings().addStrings("12", "234"));
    }
}
