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
class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class _21_MergeTwoSortedList {
// 2,3,3,4,5
// 3,4,5
// 2,3,3,3,4,4,5

//  Definition for singly-linked list.
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode tempNode = new ListNode(0);
        ListNode currentNode = tempNode;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                currentNode.next = l1;
                l1 = l1.next;
            } else {
                currentNode.next = l2;
                l2 = l2.next;
            }
            currentNode = currentNode.next;
        }
        if (l1 != null) {
            currentNode.next = l1;
            l1 = l1.next;
        }
        if (l2 != null) {
            currentNode.next = l2;
            l2 = l2.next;
        }
        return tempNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(3, new ListNode(4, new ListNode())));

        ListNode l2 = new ListNode(4, new ListNode(5, new ListNode(6, new ListNode())));

        ListNode l3 = new _21_MergeTwoSortedList().mergeTwoLists(l1, l2);
        while (l3.next != null) {
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }
}
