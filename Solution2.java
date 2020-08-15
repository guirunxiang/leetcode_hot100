/**
 * 2.两数相加
 * 给出两个非空的链表用来表示两个非负的整数。 其中，它们各自的
 * 位数是按照逆序的方式存储的，并且它们的每个节点只能存储一位数字
 * 如果我们将两个数字相加起来，则会返回一个新的链表来表示它们的和。
 * 可以假设除了数字0之外，这两个数都不会以0开头。
 * 
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 */

/**
 * Definition for singly-linked list
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *     }
 * } 
 */

 class Solution2 {
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode dummy = new ListNode(0);
         ListNode p = dummy;
         int carry = 0;
         while(l1 != null || l2 != null) {
             int x = l1 == null ? 0 : l1.val;
             int y = l2 == null ? 0 : l2.val;
             int sum = x + y + carry;
             carry = sum / 10;
             sum = sum % 10;
             ListNode node = new ListNode(sum);
             p.next = node;
             p = p.next;
             if(l1 != null)l1 = l1.next;
             if(l2 != null)l2 = l2.next;
         }
         if(carry != 0) {
             p.next = new ListNode(carry);
         }
         return dummy.next;
     }
 }