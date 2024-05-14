//https://leetcode.com/problems/reverse-nodes-in-k-group/
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode current = head.next;
        if (head.next == null) {
            return head;
        }
        ListNode before = head;
        ListNode beforeFirst = head;
        ListNode first = head;
        ListNode after = head.next.next;
        if (after == null) {
            if (k ==1) {
                return head;
            }else{
                current.next = before;
                before.next = null;
                head = current;
                return head;
            }
        }
        ListNode aux = head;
        
        boolean firstPass = true;
        while (after != null) {
            if (!firstPass) {
                before = current;
                current = after;
                if(after!=null){

                    after = after.next;
                }
            }
            for (int i = 0; i < k-1; i++) {
                current.next = before;
                before = current;
                current = after;
                if(after != null){

                    after = after.next;
                }
            
            }
            if (firstPass) {
                head = before;
                firstPass = false;
            }
            if (!firstPass) {
                beforeFirst.next = before;
            }
            first.next = current;
            beforeFirst = first;
            first = current;
            aux = current;
            for (int i = 0; i < k-1; i++) {
                if (aux!=null){
                    if (aux.next == null) {
                        return head;
                    }
                    aux = aux.next;

                }
            }
        }
        return head;
    }
}