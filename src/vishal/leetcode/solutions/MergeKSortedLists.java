package vishal.leetcode.solutions;

import java.util.ArrayList;
import java.util.Collections;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

public class MergeKSortedLists {
    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0 ; i<lists.length ; i++) {
            while(lists[i] != null) {
                a.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        Collections.sort(a);
        ListNode head = new ListNode(0);
        ListNode x = head;
        for(int i=0 ; i<a.size() ; i++) {
            while(x.next != null) {
                x = x.next;
            }
            x.next = new ListNode(a.get(i));
        }
        return head.next;
    }
}
