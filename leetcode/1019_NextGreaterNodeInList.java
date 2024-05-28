//https://leetcode.com/problems/next-greater-node-in-linked-list/
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ListNode current = head;
        int length = 0;
        while (current != null) {
            current = current.next;
            length++;
        }
        int[] result = new int[length];
        current = head;
        int index = 0;
        while (current.next !=null) {
            ListNode aux = current.next;
            while (aux !=null) {
                if (aux.val > current.val) {
                    result[index] = aux.val;
                    index++;
                    break;
                }
                if (aux.next == null) {
                    result[index] = 0;
                    index++;
                    break;
                }
                aux = aux.next;
            }
            current = current.next;
        }
        return result;
    }
}