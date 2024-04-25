public class Main {
    public static void main(String[] args) {
        QueueArray queueArray=new QueueArray(5);
        queueArray.enqueue(2);
        queueArray.enqueue(3);
        queueArray.enqueue(4);
        queueArray.enqueue(5);
        queueArray.enqueue(10);
        queueArray.peek();
        queueArray.dequeue();
        queueArray.peek();
        queueArray.deleteQueue();
    }
}