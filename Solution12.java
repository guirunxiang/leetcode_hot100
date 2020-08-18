/**
 * 12.合并两个有序链表
 * 
 */

class Solution12 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2;
        ListNode dummyHead = new ListNode(0);
        ListNode q = dummyHead;
        while(p1 != null && p2 != null) {
            if(p1.val < p2.val) {
                q.next = p1;
                q = q.next;
                p1 = p1.next;
                q.next = null;
            }
            else if(p1.val > p2.val) {
                q.next = p2;
                q = q.next;
                p2 = p2.next;
                q.next = null;
            }
            else {
                q.next = p1;
                q = q.next;
                p1 = p1.next;
                q.next = p2;
                q = q.next;
                p2 = p2.next;
                q.next = null; 
            }
        }

        if(p1 != null) {
            q.next = p1;
        }
        if(p2 != null) {
            q.next = p2;
        }

        return dummyHead.next;
    }
}