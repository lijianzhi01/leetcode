import java.util.*;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class LC0001 {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int digitsum = 0;
    ListNode p = l1, q = l2, prev = l1;
    while (p != null || q != null) {
        prev = p;

        digitsum += (p == null ? 0 : p.val);
        digitsum += (q == null ? 0 : q.val);
        p.val = digitsum % 10;
        digitsum /= 10;

        if (p != null && p.next == null && q != null && q.next != null) {
            p.next = q.next;
            q.next = null;
        }

        p = (p == null) ? null : p.next;
        q = (q == null) ? null : q.next;
    }

    if (digitsum != 0) {
        ListNode last = new ListNode(digitsum);
        prev.next = last;
    }
    
    return l1;
  }
}