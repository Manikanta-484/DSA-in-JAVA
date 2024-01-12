public class Main {
    public static void main(String[] args) {
        SingleDAarray sda =new SingleDAarray(10);
        sda.insert(0,0);
       sda.insert(1,10);
       sda.insert(2,20);
//    sda.insert(1,30);
//    sda.insert(12,40);

    // accessing Elements of the array
        var firstElement =sda.arr[1];
        System.out.println(firstElement);

    // Array Traversal
       sda.traverseArray();

    }
}