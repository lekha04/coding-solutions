//Problem 1.  Implement a program to reverse a Linked List

import java.util.*;
public class MyLinkedList {

    static ListNode head;

    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
        }
    }

    public ListNode reverseLinkedList(ListNode head){

        if(head==null){
            return head;
        }
        ListNode cur = head;
        ListNode prev = null;

        while(cur != null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        return prev;
    }

    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList();

        System.out.println("Before Reversing: ");
        ListNode c = list.head = new ListNode(1);

        int i = 2;
        while(i <= 10){
            System.out.print(" " + c.val);
            c.next = new ListNode(i);
            c = c.next;
            i++;
        }
        System.out.println(" " + c.val);

        head = list.reverseLinkedList(head);
        c = head;

        System.out.println("After Reversing:");

        while(c != null){
            System.out.print(" " + c.val);
            c = c.next;
        }

    }

}