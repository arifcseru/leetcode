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
public class _66_Plus_One {

    public int[] plusOneOld(int[] digits) {
        if (digits.length == 0) {
            return new int[0];
        }

        int totalDigits = digits.length;
        if ((digits[totalDigits - 1] == 9 && totalDigits == 1)
                || (digits[totalDigits - 1] == 9 && digits[totalDigits - 2] == 9)) {
            System.out.println("Hello");
            totalDigits++;
            int[] finalDigits = new int[totalDigits];
            for (int i = 0; i < digits.length; i++) {
                finalDigits[i] = digits[i];
            }
            finalDigits[totalDigits - 2] = (digits[totalDigits - 2] + 1) / 10;
            finalDigits[totalDigits - 1] = (digits[totalDigits - 2] + 1) % 10;
            return finalDigits;
        }

        int[] finalDigits = new int[totalDigits];
        for (int i = 0; i < digits.length; i++) {
            finalDigits[i] = digits[i];
        }
        finalDigits[totalDigits - 1] = digits[totalDigits - 1] + 1;
        return finalDigits;

    }

    public int[] plusOne(int[] digits) {
        if (digits.length == 0) {
            return new int[0];
        }
        int i = digits.length - 1;
        int carry = (digits[i] + 1) / 10;
        if (carry >= 1) {
            System.out.println("Hello;");
            digits[i] = (digits[i] + 1) % 10;
        } else {
            digits[i]++;
        }
        i--;
        while (i >= 0) {
            int lastDigit = digits[i];
            if (carry >= 1) {
                lastDigit = ((lastDigit) % 10);
                digits[i] = lastDigit;
            } else {

                digits[i] = lastDigit + carry;
            }
            carry = (digits[i] + carry) / 10;
            i--;
        }
        if (carry > 0) {
            int[] extraDigits = new int[digits.length + 1];
            extraDigits[0] = carry;
            for (int j = digits.length; j > 0; j--) {
                extraDigits[j] = digits[j - 1];
            }
            return extraDigits;
        }

        return digits;

    }

    public static void main(String[] args) {
        int[] d1 = {2, 3, 4, 9, 9};
        int[] d2 = {9, 9};
        int[] d3 = {9};
        int[] digits = {4, 3, 2, 1};
        int[] finalDigits = new _66_Plus_One().plusOne(d2);
        System.out.println("Size: " + finalDigits.length);
        for (int i = 0; i < finalDigits.length; i++) {
            System.out.println(finalDigits[i]);
        }
    }
}
