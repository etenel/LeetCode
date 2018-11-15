package com.eternel.jet.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class OddEvenLinkedList {
    /**
     * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
     * <p>
     * You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
     *
     * @param args
     */
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        ListNode oddEvenList = oddEvenList(listNode);
        System.out.print(oddEvenList.val + ",");
        while (oddEvenList.next != null) {
            System.out.print(oddEvenList.next.val + ",");
            oddEvenList = oddEvenList.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head != null) {
            List<Integer> list = new ArrayList<>();
            list.add(head.val);
            ListNode next = head.next;
            while (next != null) {
                list.add(next.val);
                next = next.next;
            }
            ArrayList<Integer> objects = new ArrayList<>();
            for (int i = 0; i < list.size(); i += 2) {
                objects.add(list.get(i));
            }
            for (int i = 1; i < list.size(); i += 2) {
                objects.add(list.get(i));
            }
            next = head.next;
            int i = 1;
            while (i < objects.size()) {
                next.val = objects.get(i);
                next = next.next;
                i++;
            }
        }
        return head;
    }

    public static ListNode oddEvenList2(ListNode head) {
        if (head != null) {
            ListNode odd = head;
            ListNode even = odd.next;
            ListNode enenHead = odd.next;
            if(even!=null&&even.next!=null) {
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;
            }
            odd.next = enenHead;
        }
        return head;
    }

}
