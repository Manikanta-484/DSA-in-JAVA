class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedList {
    private Node front,rear;

    public LinkedList(){
        front=rear=null;
    }

    public void enqueue(int item){
        Node newnode=new Node(item);
        if(isEmpty()){
            front=rear=newnode;
        }else{
            rear.next=newnode;
            rear=newnode;
        }
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("queue is Empty");
            return -1;
        }
        int temp=front.data;
        if(front==rear){
            front=rear=null;
        }else {
            front=front.next;
        }
        return temp;
    }

    public boolean isEmpty(){
        return front==null;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("queue is empty ");
            return -1;
        }
        return front.data;
    }
}
