package ds.tree;

public class BinaryTree {
    Node root;

    // Constructor
    BinaryTree(){
        root = null;
    }

    Node insertBST(Node temp, int key){
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

    void inorder(Node temp){
        if(temp != null){
            inorder(temp.left);
            System.out.print(temp.key + " ");
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
