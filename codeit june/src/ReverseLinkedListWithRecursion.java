public class ReverseLinkedListWithRecursion {
    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        return reverseListHelper(cur, prev);
    }

    public static ListNode reverseListHelper(ListNode cur, ListNode prev){
        if(cur==null){
            return prev;
        }
        ListNode next = cur.next;
        cur.next = prev;
        prev = cur;
        cur = next;

        return reverseListHelper(cur, prev);
    }

}
