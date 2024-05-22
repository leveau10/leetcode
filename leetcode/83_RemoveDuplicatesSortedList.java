//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 // Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode before = head;
        if (before == null || before.next == null){
            return head;
        }
        ListNode current = head.next;
        ListNode after = head.next.next;
         while (current != null) {
            if (before.val == current.val) {
                before.next = after;
            }else{
                before = current;
            }
            current = after;
            if (after == null) {
                return head;
            }
            after = after.next;
        }
        return head;
    }
}