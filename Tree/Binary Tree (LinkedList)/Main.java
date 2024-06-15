public class Main {
    public static void main(String[] args) {
        BinaryTreeLinedList binarytree = new BinaryTreeLinedList();

        binarytree.insert("N1");
        binarytree.insert("N2");
        binarytree.insert("N3");
        binarytree.insert("N4");
        binarytree.insert("N5");
        binarytree.insert("N6");

        binarytree.Levelorder();
        System.out.println();
        System.out.println(binarytree.getDeepestNode().value);
        binarytree.deleteNode("N3");
        System.out.println();
        binarytree.Levelorder();
    }
}