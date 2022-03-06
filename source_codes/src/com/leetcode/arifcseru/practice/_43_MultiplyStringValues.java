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
public class _43_MultiplyStringValues {

    /*
    23
    10
    ---
    0 0
   23 0
   -----
   23 0 
     */
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

    public String multiply(String num1, String num2) {
        if (num1.equals("0")) {
            return num1;
        } else if (num2.equals("0")) {
            return num2;
        }
        if (num1.length() < num2.length()) {
            return multiply(num2, num1);
        }

        String finalStr = "0";
        int totalZeros = 0;
        for (int i = num2.length() - 1; i >= 0; i--) {
            int carry = 0;
            StringBuilder num1Sb = new StringBuilder();
            for (int j = num1.length() - 1; j >= 0; j--) {
                int lastDigit = 0;
                int num1Int = num1.charAt(j) - '0';
                int num2Int = num2.charAt(i) - '0';
                if ((carry + (num1Int * num2Int)) / 10 > 0) {
                    lastDigit = (carry + num1Int * num2Int) % 10;
                    carry = (carry + num1Int * num2Int) / 10;
                    //  System.out.println("lastDigit: " + lastDigit + ", carry: " + carry);
                } else {
                    lastDigit = carry + (num1Int * num2Int);
                    carry = 0;
                }
                num1Sb.append(lastDigit);
                // System.out.println("num2: " + num2.charAt(i) + " , num1: " + num1.charAt(j));

            }
            if (carry > 0) {
                num1Sb.append(carry);
            }
            String fin = num1Sb.reverse().toString();
            System.out.println("num1Sb: " + fin);
            int temp = totalZeros;
            while (temp > 0) {
                fin += "0";
                temp--;
            }
            totalZeros++;
            finalStr = addStrings(finalStr, fin);
        }

        return finalStr;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        String result = new _43_MultiplyStringValues().multiply("459", "69");
//        System.out.println(result);
        String result = new _43_MultiplyStringValues().multiply("459", "69");
        System.out.println(result);
//        result = new _43_MultiplyStringValues().multiply("1", "9");
//        System.out.println(result);
    }

}
