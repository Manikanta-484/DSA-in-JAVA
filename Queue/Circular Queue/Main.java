public class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Is full? " + queue.isFull());

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());

        queue.enqueue(6);
        queue.enqueue(7);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Is empty? " + queue.isEmpty());
        System.out.println("peek "+queue.peek());
        queue.dequeue();
        System.out.println("Is empty? " + queue.isEmpty());
    }
}