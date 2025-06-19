class ReverseGroups{
    //class - Node
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    //head
    private static Node head = null;
    //insertAtBeg()
    public void insertAtBeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    //insertAtEnd();
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        Node temp = head;
        newNode.next = null;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    //display
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //deleteAtBeg()
    public void deleteAtBeg(){
        head = head.next;
    }
    //deleteAtEnd()
    public void deleteAtEnd(){
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next=null;
    }
    //insertAtMid()
    public void insertAtMid(int p,int data){
        Node newNode = new Node(data);
        Node temp = head;
        int c = 1;
        while(c<p-1){
            temp = temp.next;
            c+=1;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
     
	public Node reverseInGroups(Node head,int k){
        Node prev = null;
        Node curr = head;
        Node next = null;
        int c = 1;
        while(curr!=null && c<=k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            c+=1;
        }
        if(next != null){
            head.next = reverseInGroups(next,k);
        }
        return prev;
		}
	 
    public static void main(String[] args){
        ReverseGroups s = new ReverseGroups();
        s.insertAtBeg(8);
        s.insertAtBeg(7);
        s.insertAtBeg(6);
        s.insertAtBeg(5);
        s.insertAtBeg(4);
		s.insertAtBeg(3);
        s.insertAtEnd(9);
		s.insertAtEnd(10);
        s.insertAtMid(4,11);
        s.display();
        head = s.reverseInGroups(head,3);
        s.display();
    }
}
