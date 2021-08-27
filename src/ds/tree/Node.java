package ds.tree;

public class Node {
    public int key;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val){
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
