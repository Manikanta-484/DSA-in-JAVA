public class Main {
    public static void main(String[] args) {
        AVLTree avl = new AVLTree();
        avl.insert(5);
        avl.insert(10);
        avl.insert(15);
        avl.insert(20);
        avl.levelorder();

    }
}