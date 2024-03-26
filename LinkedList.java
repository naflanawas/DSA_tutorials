class Node { //single node in the linkedlist
     int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null; //making next node to be null purposely
    }
}
public class LinkedList {
    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList link=new LinkedList();
        link.insert(5);
        link.insert(5);
        link.insert(8);
        link.insert(3);
        link.insert(0);
        link.insert(9);
        link.display();
    }


}
