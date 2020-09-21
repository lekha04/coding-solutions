import java.util.*;

//Leetcode 2
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode head;
        ListNode out = head = new ListNode(0);
        int carry = 0, rem = 0, sum = 0;

        while(c1!=null && c2!=null){
            sum = c1.val +c2.val + carry;
            carry = sum/10;
            rem = sum%10;
            out.next = new ListNode(rem);
            c1 = c1.next;
            c2 = c2.next;
            out = out.next;
        }

        while(c1!=null){
            sum = c1.val + carry;
            carry = sum/10;
            rem = sum%10;
            out.next = new ListNode(rem);
            c1 = c1.next;
            out = out.next;
        }

        while(c2!=null){
            sum = c2.val + carry;
            carry = sum/10;
            rem = sum%10;
            out.next = new ListNode(rem);
            c2 = c2.next;
            out = out.next;
        }

        if(carry>0){
            out.next = new ListNode(carry);
        }

        return head.next;
    }

    public static void main(String[] args){

    }
}
