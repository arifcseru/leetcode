/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class _668_FindKthSmallestNumber {

    public int findKthNumberMemoryExceeded(int m, int n, int k) {
        int[] table = new int[m * n];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                table[(i - 1) * n + j - 1] = i * j;
            }
        }
        Arrays.sort(table);
        return table[k - 1];
    }
    
     public boolean enough(int x, int m, int n, int k) {
        int count = 0;
        for (int i = 1; i <= m; i++) {
            count += Math.min(x / i, n);
        }
        return count >= k;
    }

    public int findKthNumber(int m, int n, int k) {
        int lo = 1, hi = m * n;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (!enough(mi, m, n, k)) lo = mi + 1;
            else hi = mi;
        }
        return lo;
    }


    public static void main(String[] args) {
        int res = new _668_FindKthSmallestNumber().findKthNumber(2, 3, 3);
        System.out.println(res);
    }
}
