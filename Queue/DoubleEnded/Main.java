public class Main {
    public static void main(String[] args) {
        doubleended deque =new doubleended();
        deque.addfront(1);
        deque.addrear(2);
        deque.addfront(3);
        deque.addrear(4);

        while (!deque.isEmpty()){
            System.out.println("removed: "+deque.delFront());
        }
    }
}