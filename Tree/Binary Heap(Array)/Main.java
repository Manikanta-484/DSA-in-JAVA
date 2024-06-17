public class Main {
    public static void main(String[] args) {
        BinaryHeap bh = new BinaryHeap(5);
        bh.insert(10,"Min");
        bh.insert(5,"Min");
        bh.insert(15,"Min");
        bh.insert(1,"Min");
        bh.levelorder();
        System.out.println();
        bh.extractHeadOfBH("Min");
        bh.levelorder();

    }
}