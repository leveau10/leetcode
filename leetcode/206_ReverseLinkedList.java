//https://leetcode.com/problems/reverse-linked-list/
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode before = head;
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head.next;
        ListNode after = cur.next;
        boolean first = true;
        while (cur != null) {
            if (first) {
                before.next = null;
                first = false;
            }
            cur.next = before;
            before = cur;
            cur = after;
            if (cur == null) {
                head = before;
                return head;
            }
            after = cur.next;
        }
        return head;
    }
}