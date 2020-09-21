//Leetcode 21
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists3(ListNode l1, ListNode l2){

        ListNode cur1 = l1;
        ListNode cur2 = l2;

        ListNode head;
        ListNode out = head = new ListNode(0);
        out = out.next;

        while(cur1!=null && cur2!=null){
            if(cur1.val <= cur2.val){
                out = new ListNode(cur1.val);
                cur1 = cur1.next;
            }
            else {
                out = new ListNode(cur2.val);
                cur2 = cur2.next;
            }

            out = out.next;
        }

        while(cur1!=null){
            out = new ListNode(cur1.val);
            cur1 = cur1.next;
            out = out.next;
        }

        while(cur2!=null){
            out = new ListNode(cur2.val);
            cur2 = cur2.next;
            out = out.next;
        }

        return head.next;
    }

}
