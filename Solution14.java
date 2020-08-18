/**
 * 14. 合并K个有序链表
 */

class Solution14 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);
        for(ListNode node : lists) {
            if(node != null) {
                heap.add(node);
            }
        }
        ListNode dummyHead = new ListNode(0);
        ListNode p = dummyHead;
        ListNode minNode = null;
        while(!heap.isEmpty()) {
            minNode = heap.poll();
            p.next = minNode;
            p = p.next;
            if(minNode.next != null) {
                heap.offer(minNode.next);
            }
        }
        return dummyHead.next;
    }
}