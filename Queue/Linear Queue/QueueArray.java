public class QueueArray {
    int[] arr;
    int top;
    int beginning;

    public QueueArray(int size){
        this.arr=new int[size];
        top=-1;
        beginning=-1;
        System.out.println("THE QUEUE IS SUCCESSFULLY CREATED WITH SIZE "+size);
    }

    public boolean isFull(){
        if(top== arr.length-1){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    public void enqueue(int item){
        if(isFull()){
            System.out.println("queue is full");
        }else if(isEmpty()){
           beginning=0;
           arr[++top]=item;
            System.out.println("successfully inserted "+item);

        }
        else{
            arr[++top]=item;
            System.out.println("successfully inserted "+item);
        }
    }
    
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        } else {
            int temp = arr[beginning];
            beginning++;
            if (beginning > top) {
                beginning = -1;
                top = -1;
            }
            System.out.println(temp+" deleted");
            return temp;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        int peek=arr[beginning];
        System.out.println("peek of the queue is "+peek);
        return peek;
    }

    public void deleteQueue(){
        arr=null;
        System.out.println("queue is successfully deleted");
    }

}
