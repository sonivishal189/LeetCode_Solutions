package vishal.leetcode.solutions;

/*class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}*/

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        ListNode x = head;
        ListNode prev = null;

        int c = 0;

        while(cur!=null) {
            cur = cur.next;
            c++;
        }
        int pos = c - n;
        if(pos == 0) {
            return head.next;
        }
        for(int i=0 ; i<pos ; i++) {
            if(i==0) {
                prev = head;
            } else {
                prev = prev.next;
            }
            x = x.next;
        }
        if(prev != null) {
            prev.next = x.next;
        }
        return head;
    }
}
