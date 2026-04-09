class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode current = head;
        ListNode nextpl = head.next;
        ListNode swap = null;

        while(nextpl != null)
        {
            swap = nextpl.next;
            nextpl.next = current;
            if (current == head) current.next = null;
            current = nextpl;
            nextpl = swap;
        }

        return current;
        
    }
}