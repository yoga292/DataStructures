class SinglyLinkedList
{
    class Node 
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
        
    }
    private Node head=null;
    public void insertAtBeg(int data)
        {
            Node newNode=new Node(data);
            if(head==null)
            head=newNode;
            else
            {
                newNode.next=head;
                head=newNode;
            }
            
        }
     public void insertAtEnd(int data)
        {
            Node newNode=new Node(data);
            newNode.next=null;
            Node temp=head;
            if(head==null)
            {
                head=newNode;
                return;
            }
            while(temp.next!=null)
            {
               temp=temp.next; 
            }
            temp.next=newNode;
            
        }
    public void deleteAtBeg()
        {
            head=head.next;
        }
    public void deleteAtEnd()
        {
            Node temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }
    public void mid()
    {
        Node temp1=head;
        Node temp2=head;
        while(temp2.next!=null && temp2.next.next!=null)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        System.out.println(temp1.data);
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    
}
public class MidElement
{
	public static void main(String[] args) {
		SinglyLinkedList s=new SinglyLinkedList();
		s.insertAtBeg(5);
		s.insertAtBeg(6);
		s.insertAtBeg(7);
		s.insertAtBeg(8);
		s.insertAtBeg(9);
		s.insertAtBeg(10);
		s.insertAtEnd(4);
		s.deleteAtBeg();
		s.deleteAtEnd();
		s.display();
		s.mid();
		
	}
}
