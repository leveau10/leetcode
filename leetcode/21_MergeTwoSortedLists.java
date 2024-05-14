//https://leetcode.com/problems/merge-two-sorted-lists/
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode finalList = new ListNode();
        ListNode head = new ListNode();
        if (list1 == null && list2 == null) {
            return list1;
        }else if(list1 == null && list2 != null){
            return list2;
        }else if(list2 == null & list1 != null){
            return list1;
        }

        if (list1.val <= list2.val) {
            
            finalList = list1;
            list1 = list1.next;
            head = finalList;
        }else{
            finalList = list2;
            list2 = list2.next;
            head = finalList;
        }

        while (list1 != null && list2!=null) {
            System.out.println("OPA");
            if (list1.val <= list2.val) {
                finalList.next = list1;
                list1 = list1.next;
            }else{
                finalList.next = list2;
                list2 = list2.next;
            }
            
            finalList = finalList.next;
            if (list1 == null) {
                finalList.next = list2;
                return head;
            }else if(list2 == null){
                finalList.next = list1;
                return head;
            }
        }
        return head;
    }
}