/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class _290_WordPattern {

    public boolean wordPattern(String pattern, String s) {
        Map<String, String> map = new HashMap<>();
        String[] strs = s.split(" ");
        for (int i = 0; i < pattern.length(); i++) {
            String key = String.valueOf(pattern.charAt(i));
            if (map.containsKey(key)) {
            String val = map.get(key);
            // System.out.println("map.get(key): " + val);
                if (!val.equals(strs[i])) {
                    return false;
                }
            } else if (map.containsValue(strs[i])) {
                return false;
            }

            map.put(key, strs[i]);

        }
        return true;
    }

    public boolean wordPatternNew(String pattern, String str) {
        String[] strs = str.split(" ");

        //prevent out of boundary problem
        if (strs.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            if (map.containsKey(key)) {
                String value = map.get(key);
                if (!value.equals(strs[i])) {
                    return false;
                }
            } else if (map.containsValue(strs[i])) {
                return false;
            }
            map.put(key, strs[i]);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new _290_WordPattern().wordPattern("abba", "dog cat cat dog"));
        System.out.println(new _290_WordPattern().wordPattern("abba", "dog dog dog dog"));
        // System.out.println(new _290_WordPattern().wordPattern("abba", "dog cat cat fish"));
    }
}
