public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(5);
        bt.insert("N1");
        bt.insert("N2");
        bt.insert("N3");
        bt.insert("N4");
        bt.insert("N5");
        bt.preorder(1);
        System.out.println();
        bt.inorder(1);
        System.out.println();
        bt.postorder(1);
        System.out.println();
        bt.levelOrder();
        System.out.println();
        bt.search("N5");
        bt.search("N7");
        System.out.println(bt.search("N3"));
        bt.delete("N2");
        bt.levelOrder();



    }
}