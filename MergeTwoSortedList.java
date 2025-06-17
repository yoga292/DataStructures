class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Main {
    public static Node mergeTwoSortedLists(Node l1, Node l2) {
        Node dummy = new Node(-1); // Temporary dummy node
        Node tail = dummy;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next;
    }
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);
        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);
        System.out.print("List 1: ");
        printList(l1);
        System.out.print("List 2: ");
        printList(l2);
        Node mergedHead = mergeTwoSortedLists(l1, l2);
        System.out.print("Merged List: ");
        printList(mergedHead);
    }
}
