package vishal.leetcode.solutions;

/*class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}*/

public class SwapNodesInPairs {
    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {
        ListNode cur, prev;
        int temp;
        if(head == null || head.next == null){
            return head;
        } else {
            prev = head;
            cur = head.next;
        }
        while(cur != null) {
            try{
                temp = prev.val;
                prev.val = cur.val;
                cur.val = temp;
                prev = cur.next;
                cur = prev.next;
            } catch (Exception e) {
                return head;
            }
        }
        return head;
    }
}
