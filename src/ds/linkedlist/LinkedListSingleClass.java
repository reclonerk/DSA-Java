package ds.linkedlist;

public class LinkedListSingleClass {
    Node head;

    class Node {
        int data;
        Node next;

        Node(){}

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Pushing in front
    void push(int new_data){
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;
    }

    void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);

        linkedList.printList();
    }
}


