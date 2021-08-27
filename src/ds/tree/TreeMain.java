package ds.tree;

public class TreeMain {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

//        binaryTree.root = new Node(1);
//
//        binaryTree.root.left = new Node(2);
//
//        binaryTree.root.right = new Node(3);
//
//        binaryTree.root.left.left = new Node(4);
//
//        System.out.println(binaryTree);

        Node root = binaryTree.root;
        root = binaryTree.insertBST(root, 50);
        root = binaryTree.insertBST(root, 30);
        root = binaryTree.insertBST(root, 20);
        root = binaryTree.insertBST(root,40);
        root = binaryTree.insertBST(root,70);
        root = binaryTree.insertBST(root,60);
        root = binaryTree.insertBST(root,80);

        binaryTree.inorder(root);
    }
}
