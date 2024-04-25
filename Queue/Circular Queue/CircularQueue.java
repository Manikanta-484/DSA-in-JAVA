class CircularQueue{
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public CircularQueue(int size){
        capacity=size+1;
        queue=new int[capacity];
        front=rear=0;
    }

    public void enqueue(int item){
        if(isFull()){
            System.out.println("Queue is Full!");
            return;
        }
        queue[rear]=item;
        rear=(rear+1)%capacity;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        int temp=queue[front];
        front=(front+1)%capacity;
        return temp;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }
    public boolean isFull(){
        return (rear+1)%capacity==front;
    }
    public boolean isEmpty(){
        return front==rear;
    }
}