//Leetcode 876
public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast.next!=null){
            slow = slow.next;
        }

        return slow;
    }

    public ListNode middleNode2(ListNode head){
        ListNode cur = head;
        int count = 1;

        while(cur!=null){
            cur = cur.next;
            count++;
        }

        for(int i=0; i<=count/2; i++){
            head = head.next;
        }

        return head;
    }
}
