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
public class _441_ArrangingCoins {

    /*
You have n coins and you want to build a staircase with these coins. 
The staircase consists of k rows where the ith row has exactly i coins. 
The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.
     */
    public int arrangeCoins(int n) {
        int temp = n, validCoins = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                temp--;
            }
            if (temp < 0) {
                break;
            } else {
                validCoins++;
            }
        }
        return validCoins;
    }

    public int arrangeCoins_Accepted(int n) {
        int i = 1; // which row we are on
        while (n > 0) { // checking to see if we have used all our coins
            i++; // increasing our row
            n = n - i; // adding coins to our row
        }
        return i - 1;
    }

    public static void main(String[] args) {
        new _441_ArrangingCoins().arrangeCoins(5);
        new _441_ArrangingCoins().arrangeCoins(8);
    }
}
