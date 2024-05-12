//leetcode.com/problems/remove-nth-node-from-end-of-list/

import java.util.ArrayList;
import java.util.List;
//Definition for singly-linked list.
class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode current = head;
    List<ListNode> values = new ArrayList<>();
    ListNode nodeToRemove;
    while (current != null) {
      values.add(current);
      current = current.next;
    }
    
    if(n == 1){
      if (values.size() == 1) {
        head = null;
      }else{
        nodeToRemove = values.get(values.size()-2);
        nodeToRemove.next = nodeToRemove.next.next;
      }
    }else if ((values.size()-n) == 0) {
      nodeToRemove = values.get(values.size()-n);
      head = head.next;
    }else{
      ListNode nodeBefore = values.get(values.size()-n-1);
      nodeBefore.next = nodeBefore.next.next;
    }
    return head;
  } 
}