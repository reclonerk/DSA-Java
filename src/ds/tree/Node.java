package ds.tree;

public class Node {
    int key;
    Node left;
    Node right;

    // Constructor
    Node(int val){
        this.key = val;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
