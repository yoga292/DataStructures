class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedListMiddle {
    Node head;
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void printMiddle() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node t1 = head;
        Node t2 = head;

        while (t2 != null && t2.next != null) {
            t1 = t1.next;
            t2 = t2.next.next;
        }

        System.out.println("Middle element: " + t1.data);
    }
    public static void main(String[] args) {
        LinkedListMiddle list = new LinkedListMiddle();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.printMiddle();
    }
}
