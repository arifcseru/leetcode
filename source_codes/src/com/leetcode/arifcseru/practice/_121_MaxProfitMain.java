/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

import java.util.Arrays;

/**
 *
 * @author Arifur Rahman
 */
public class _121_MaxProfitMain {

    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        // int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices = {7,6,4,3,1};
        System.out.println(new _121_MaxProfitMain().maxProfit(prices));
    }
}
