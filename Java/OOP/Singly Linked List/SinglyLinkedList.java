public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    } 
    public void remove() 
    {
        Node last = null;
        Node current = head;
        if(head == null)
        {
            System.out.println("List is Empty");
            return;
        }
        else 
        {
            while (current.next.next != null) 
            {
                current = current.next;
            }
            last = current;
            last.next = null;
        }
    }
    public void printValues() 
    {
        if (head == null) 
        {
            System.out.println("List is Empty");
        } 
        else 
        {
            Node current = head;
            while (current != null) 
            {
                System.out.print(current.value + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }   
}