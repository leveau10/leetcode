//https://leetcode.com/problems/add-two-numbers/

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = l1;
        ListNode current2 = l2;
        ListNode nextl3 = new ListNode(0, null);
        ListNode currentl3 = new ListNode(0, null);
        ListNode l3 = new ListNode(0, null);
        boolean currentEmpty = false;
        boolean curren2Empty = false;
        boolean isFirst = true;
        int rest = 0;
        int l3value = 0;
        while (!(currentEmpty && curren2Empty)) {
            if ((current.val + current2.val + rest) > 9) {
                l3value = (current.val+current2.val + rest)%10;
                rest=1;
            }else{
                l3value = current.val+current2.val+rest;
                rest = 0;
            }

            if(isFirst){
                l3 = new ListNode(l3value, null);
            }else{
                nextl3 = new ListNode(l3value, null);
                currentl3.next = nextl3;
            }

            if (isFirst) {
                currentl3 = l3;
                isFirst = false;
            }else{
                currentl3 = nextl3;
            }
            
            if (current.next == null) {
                current.val = 0;
                currentEmpty = true;
            }
            else{
                current = current.next;
            }

            if (current2.next == null) {
                current2.val = 0;
                curren2Empty = true;
            }else{
               current2 = current2.next;
            }

        }
        if (rest != 0) {
            nextl3 = new ListNode(rest, null);
            currentl3.next = nextl3;
        }
        return l3;
    }
}