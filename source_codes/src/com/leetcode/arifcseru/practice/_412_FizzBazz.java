/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author User
 */
public class _412_FizzBazz {

    public List<String> fizzBuzz(int n) {
        List<String> finalList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                finalList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                finalList.add("Fizz");
            } else if (i % 5 == 0) {
                finalList.add("Buzz");
            } else {
                finalList.add(String.valueOf(i));
            }

        }
        return finalList;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>();
        map.put(4, 3);
        map.put(1, 4);
        map.put(12, 5);
        map.put(31, 1);
        map.put(48, 23);
        Set<Integer> keys = map.keySet();
        Set<Integer> nums = new HashSet<>();
        nums.addAll(keys);
        /*
        nums.add(4);
        nums.add(1);
        nums.add(12);
        nums.add(9);
         */
        

        System.out.println(keys);
        System.out.println(nums);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("key: " + key + ", value: " + value);
        }
    }
}
