public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst= new BinarySearchTree();
        bst.insert(70);
        bst.insert(50);
        bst.insert(90);
        bst.insert(30);
        bst.insert(60);
        bst.insert(80);
        bst.insert(100);
        bst.insert(20);
        bst.insert(40);

        bst.preorder(bst.root);
        System.out.println();

        bst.inorder(bst.root);
        System.out.println();

        bst.levelorder();
        System.out.println();

        bst.search(bst.root,300);
        System.out.println();

        bst.deletenode(bst.root, 90);
        bst.levelorder();

        System.out.println();
        bst.deleteEntireTree();
    }
}