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
public class _202_HappyNumber {

    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        boolean isHappy = false;
        int temp = n;
        int totalSqrSum = 0;
        while (totalSqrSum != 1 && n / 10 > 0) {
            totalSqrSum = 0;
            while (n > 0 && n / 10 > 0) {
                int digit = n % 10;
                totalSqrSum += Math.pow(digit, 2);
                n = n / 10;
            }
            System.out.println("totalSqrSum: " + totalSqrSum);
            n = totalSqrSum;
            if (totalSqrSum == 1) {
                isHappy = true;
                break;
            }
        }

        return isHappy;
    }

    public static void main(String[] args) {
        System.out.println(new _202_HappyNumber().isHappy(19));
        System.out.println(new _202_HappyNumber().isHappy(23));
        System.out.println(new _202_HappyNumber().isHappy(2));
        System.out.println(new _202_HappyNumber().isHappy(123));
    }
}
