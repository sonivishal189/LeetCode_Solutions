package vishal.leetcode.solutions;

/*class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}*/

public class AddTwoNumbers {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0, c=0;
        ListNode ln = new ListNode(0);
        ListNode res = ln;
        while(l1 != null || l2!=null || c!=0) {
            sum = c;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            ln.next = new ListNode(sum%10);
            c = sum/10;
            ln = ln.next;
        }
        return res.next;
    }
}
