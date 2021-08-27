package ds.linkedlist;

public class LinkedList {
    public Node head;

    public LinkedList(){
        head = null;
    }

    // Pushing in front
    public void push(int new_data){
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public void append(int new_data){
        Node newNode = new Node(new_data);

        if(head == null){
            head = new Node(new_data);
            return;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    public void insertAfter(Node prev, int new_data){
        Node newNode = new Node(new_data);
        newNode.next = prev.next;
        prev.next = newNode;

    }
}
