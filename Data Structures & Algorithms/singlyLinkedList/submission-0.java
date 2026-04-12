class LinkedList {
    private class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private ListNode head;
    private ListNode tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public int get(int i) {
        ListNode curr = head;
        int index = 0;
        while (curr != null) {
            if (index == i) return curr.val;
            curr = curr.next;
            index++;
        }
        return -1;
    }

    public void insertHead(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertTail(int val) {
        ListNode newNode = new ListNode(val);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public boolean remove(int i) {
        if (head == null) return false;
        if (i == 0) {
            head = head.next;
            if (head == null) tail = null;
            return true;
        }
        ListNode curr = head;
        for (int index = 0; index < i - 1; index++) {
            if (curr == null || curr.next == null) return false;
            curr = curr.next;
        }
        if (curr.next == null) return false;
        if (curr.next == tail) tail = curr;
        curr.next = curr.next.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> res = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            res.add(curr.val);
            curr = curr.next;
        }
        return res;
    }
}
