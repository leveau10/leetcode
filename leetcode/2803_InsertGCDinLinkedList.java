//https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode before = head;
        if(head.next == null){
            return head;
        }
        ListNode cur = head.next;
        while (cur != null) {
            ListNode newNode = new ListNode(getCommomDivisor(before.val, cur.val), cur);
            before.next = newNode;

            before = cur;
            cur = cur.next;
        }
        return head;
    }
   private int getCommomDivisor(int num1, int num2){
        if (num1 <= num2) {
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }
        int aux = num1;
        while (aux != 0) {
            aux = num1%num2;
            num1 = num2;
            num2 = aux;
        }
        return num1;
    }
}