//https://leetcode.com/problems/delete-node-in-a-linked-list/
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

//first solution
class Solution {
    public void deleteNode(ListNode node) {
        ListNode cur = node;
        ListNode after = node.next;
        while(after != null){
            cur.val = after.val;
            if(after.next == null){
                cur.next = null;
                break;
            }
            cur = after;
            after = after.next;
        }
    }
}

//second solution
class Solution2 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
