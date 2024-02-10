// CIRCULAR SINGLY LINKED LIST
public class Main {
    public static void main(String[] args) {

        circularsinglyl circular=new circularsinglyl();
        circular.insertbeg(4);
        circular.insertbeg(3);
        circular.insertbeg(2);
        circular.insertbeg(1);
        circular.display();
        circular.deleteend();
        circular.display();
        circular.deleteFront();
        circular.display();
    }
}
 class node{
    int data;
    node next;
    public node(int value){
        this.data=value;
        this.next=null;
    }
}


class circularsinglyl {
    node head;
    // Insertion at the beginnnig of the list
    //Time Complexity: O(1)  Space Complexity: O(1)
    void insertbeg(int value){
        node newnode=new node(value);
        if(head==null){
            head=newnode;
            newnode.next=head;
        }else {
            newnode.next=head;
            node last=getlastnode();
            last.next=newnode;
            head=newnode;
        }
    }
    // Insertion at the End of the list
    // Time Complexity: O(1)  Space Complexity: O(1)
    void insertend(int value){
        node current=head;
        node newnode=new node(value);
        if(head==null){
            head=newnode;
            newnode.next=head;
        }else{
            node last=getlastnode();
            last.next=newnode;
            newnode.next=head;
        }
    }
    //Method to display the list
    // Time Complexity: O(N)  Space Complexity: O(1)
    void display() {
        node current=head;
        if (head == null) {
            System.out.println("list is empty");
        } else {
            do {
                System.out.print(current.data+"--->");
                current=current.next;
            } while (current!=head);
            System.out.println();
        }
    }

    // Method which returns the last node
    // Time Complexity: O(N)  Space Complexity: O(1)
    node getlastnode(){
        node temp=head;
        while (temp.next!=head){
            temp=temp.next;
        }
        return temp;
    }
    //Method to delete front node
    // Time Complexity: O(N)  Space Complexity: O(1)
    void deleteFront(){
        node last=getlastnode();
        if (head == null) {
            System.out.println("list is empty");
        }
        else if(head==last){
            head=null;
        } else{
            last.next=head.next;
            head=head.next;
        }
    }
    //Method to delete last node
    // Time Complexity: O(N)  Space Complexity: O(1)
    void deleteend(){
        node last=getlastnode();
        node current=head;
        if (head == null) {
            System.out.println("list is empty");
        }
        else if(head==last){
            head=null;
        } else{
            while (current.next!=last){
                current=current.next;
            }
            current.next=head;
        }

    }
}
