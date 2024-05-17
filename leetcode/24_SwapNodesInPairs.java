//https://leetcode.com/problems/swap-nodes-in-pairs/
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        boolean first = true;
        ListNode before = head;
        ListNode cur = head.next;
        ListNode after = cur.next;
        ListNode last = head;
        while (cur != null) {
            before.next = after;
            cur.next = before;
            if (first) {
                head = cur;
                first = false;
            }else{
                last.next = cur;
                last = before;
            }
            before = after;
            if (before == null || before.next == null) {
                return head;
            }
            cur = before.next;
            after = cur.next;
        }
        return head;
    }
}