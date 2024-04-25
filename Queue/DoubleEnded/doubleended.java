import com.sun.security.auth.NTDomainPrincipal;

public class doubleended {
    private static final int max=10;
    private int[] queue;
    private int front;
    private int rear;
    private int NItems;

    public doubleended(){
            queue=new int[max];
            front=0;
            rear=-1;
        NItems=0;
    }

    public void addfront(int item){
        if(isFull()){
            resize();
        }
        front=(front-1+queue.length)%queue.length;
        queue[front]=item;
        NItems++;
    }

    public void addrear(int item){
        if(isFull()){
            resize();
        }
        rear=(rear+1)%queue.length;
        queue[rear]=item;
        NItems++;
    }

    public int delFront(){
        if(isEmpty()){
            throw new IllegalStateException("deque is empty!!");
        }
        int temp=queue[front];
        front=(front+1)%queue.length;
        NItems--;
        return temp;
    }

    public int delReat(){
        if(isEmpty()){
            throw new IllegalStateException("deque is empty!!");
        }
        int temp=queue[rear];
        rear=(rear-1+queue.length)% queue.length;
        NItems--;
        return temp;
    }

    public boolean isEmpty(){
        return NItems==0;
    }
    public boolean isFull(){
        return NItems==queue.length;
    }

    private void resize(){
        int newmax=queue.length*2;
        int[] newqueue=new int[newmax];
        for (int i =0;i <NItems;i++){
            newqueue[i]=queue[(front+1)%queue.length];
        }
        queue=newqueue;
        front=0;
        rear=NItems-1;
    }

}
