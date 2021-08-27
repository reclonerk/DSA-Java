package ds.tree;

public class BinaryTree {
    public Node root;

    // Constructor
    public BinaryTree(){
        root = null;
    }

    public Node insertBST(Node temp, int key){
        if(temp == null){
            temp = new Node(key);
            return temp;
        }

        if(key < temp.key){
            temp.left = insertBST(temp.left, key);
        } else if(key > temp.key){
            temp.right = insertBST(temp.right, key);
        }

        return temp;
    }

    public void inorder(Node temp){
        if(temp != null){
            inorder(temp.left);
            System.out.println(temp.key);
            inorder(temp.right);
        }
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
