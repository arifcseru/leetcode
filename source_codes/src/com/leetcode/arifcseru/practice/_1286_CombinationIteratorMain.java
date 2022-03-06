/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

import java.util.PriorityQueue;

/**
 *
 * @author User
 */
public class _1286_CombinationIteratorMain {

    public static void main(String[] args) {
        CombinationIterator ci = new CombinationIterator("abc", 2);
        String res = ci.next();
        System.out.println(res);
        System.out.println(ci.hasNext());
        res = ci.next();
        System.out.println(res);
        System.out.println(ci.hasNext());
        res = ci.next();
        System.out.println(res);
        System.out.println(ci.hasNext());

    }

}

class CombinationIterator {

    PriorityQueue<String> pq = new PriorityQueue<>();
    public CombinationIterator(String characters, int combinationLength) {
        generateComb(characters, combinationLength, 0, new StringBuilder());
    }
    public String next() {
        return pq.poll();
    }
    public boolean hasNext() {
        return !pq.isEmpty();
    }
    private void generateComb(String ch, int len, int st, StringBuilder sb){
        if(len == 0){
            pq.add(sb.toString());
            return;
        }
        for(int i=st; i<=ch.length()-len; i++){
            sb.append(ch.charAt(i));
            generateComb(ch, len-1, i+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
