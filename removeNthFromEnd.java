class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class main {
    public static Node removeNthFromEnd(Node head, int n) {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if (n == length) {
            return head.next;
        }
        int tar = length - n;
        temp = head;
        for (int i = 1; i < tar; i++) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }
     public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.print("Original List: ");
        printList(head);
        int n = 2;
        head = removeNthFromEnd(head, n);
        System.out.print("Updated List after removing " + n + "th node from end: ");
        printList(head);
    }
}
