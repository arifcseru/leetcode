/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arifur Rahman
 */
public class _119_PascalTriangle_2 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> lastRow = new ArrayList();
        for (int i = 0; i < rowIndex; i++) {
            for (int j = i; j < rowIndex; j++) {
                System.out.println(j);
            }
            System.out.println();
        }
        return lastRow;
    }

    public static void main(String[] args) {
        new _119_PascalTriangle_2().getRow(3);
    }
}
