package ds.List;

public class BasicLinkedList <X> {
    private Node first;
    private Node last;
    private int nodeCount;

    public BasicLinkedList(){
        first = null;
        last = null;
        nodeCount = 0;
    }

    public int size(){
        return nodeCount;
    }

    public void add(X item){
        // adding something for the first time.
        if(first == null){
            first = new Node(item);
            last = first;
        }

        // otherwise, we want to grab the last node and update it's value.
        else {
            Node newLastNode = new Node(item);
            last.setNextNode(newLastNode);
            last = newLastNode;
        }
        nodeCount++;
    }

    public void insert(X item, int position){
        if(size() < position){
            throw new IllegalStateException("The linkedlist is smaller than the position you entered.");
        }
        Node currentNode = first;

        // start at 1 because we are already on the first node.
        for(int i = 1; i < position && currentNode != null; i++){
            currentNode = currentNode.getNextNode();
        }

        // severs the link chain and reconnects with the new node.
        Node newNode = new Node(item);
        Node nextNode = currentNode.getNextNode();
        currentNode.setNextNode(newNode);
        newNode.setNextNode(nextNode);
        nodeCount++;
    }

    public X removeAt(int position){
        if(first == null){
            throw new IllegalStateException("The linkedlist is empty and there are no items to remove");
        }

        Node currentNode = first;
        Node prevNode = first;

        // start at 1 because we are already on the first node.
        for(int i = 1; i < position && currentNode != null; i++){
            prevNode = currentNode;
            currentNode = currentNode.getNextNode();
        }

        // now update the pointers and throw away the old first.
        X nodeItem = currentNode.getNodeItem();
        prevNode.setNextNode(currentNode.getNextNode());
        nodeCount--;
        return nodeItem;
    }

    public X get(int position){
        if(first == null){
            throw new IllegalStateException("The linkedlist is empty and there are no items to get.");
        }

        Node currentNode = first;
        for(int i = 1; i < size() && currentNode != null; i++){
            if(i == position){
                return currentNode.getNodeItem();
            }

            currentNode = currentNode.getNextNode();
        }

        // if we didn't find it then return null.
        return null;
    }


    public String toString(){
        StringBuffer contents = new StringBuffer();
        Node curNode = first;

        while (curNode != null){
            contents.append(curNode.getNodeItem());
            curNode = curNode.getNextNode();

            if(curNode != null){
                contents.append(", ");
            }
        }
        return  contents.toString();
    }

    public int find(X item){
        if(first == null){
            throw new IllegalStateException("The linkedlist is empty and there are no items to find.");
        }

        Node currentNode = first;
        for(int i = 1; i < size() && currentNode != null; i++){
            if(currentNode.getNodeItem().equals(item)){
                return i;
            }

            currentNode = currentNode.getNextNode();
        }

        // if we didn't find it then return -1.
        return -1;
    }

    public X remove(){
        if(first == null){
            throw new IllegalStateException("The linkedlist is empty and there are no items to remove");
        }

        X nodeItem = first.getNodeItem();

        // now update the first poiter and through away the old first.
        first = first.getNextNode();
        nodeCount--;
        return nodeItem;
    }

    private class Node {
        private Node nextNode;
        private X nodeItem;

        public Node(X item){
            this.nextNode = null;
            this.nodeItem = item;
        }

        public void setNextNode(Node nextNode){
            this.nextNode = nextNode;
        }

        public Node getNextNode(){
            return nextNode;
        }

        public X getNodeItem(){
            return  nodeItem;
        }
    }
}
