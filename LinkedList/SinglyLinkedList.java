// SINGLY LINKED LIST
public class Main {
    public static void main(String[] args) {
        linkedlist singly=new linkedlist();
        singly.insertbeginning(4);
        singly.insertbeginning(3);
        singly.insertbeginning(2);
        singly.insertbeginning(1);
        singly.display();
        singly.deleteend();
        singly.display();
        singly.deleteFront();
        singly.display();
    }
}
class node{
    int data;
    node next;

    public node(int value) {
        this.data = value;
        this.next = null;
    }
}
class linkedlist{
    node head;

    // Insertion at the beginning of the list
    //Time Complexity: O(1)  Space Complexity: O(1)
    void insertbeginning(int value){
        node newnode =new node(value);
        newnode.next=head;
        head=newnode;
    }

    // Insertion at the end of the list
    // Time Complexity: O(N)  Space Complexity: O(1)
    void insertend(int value){
        node newnode =new node(value);

        if(head==null){
            head=newnode;
        }else{
            node current=head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=newnode;
        }
    }

    //method to display
    //Time Complexity: O(N)   Space Complexity: O(1)
    void display(){
        node current =head;
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            while (current!=null){
                System.out.print(current.data+"-->");
                current=current.next;
            }
            System.out.println();
        }
    }

    // deletion at the front of the list
    //Time Complexity: O(1)   Space Complexity: O(1)
    void deleteFront(){
        if(head==null){
            System.out.println("list is empty");
        }
        else if(head.next==null){
            head=null;
        }
        else {
            head=head.next;
        }
    }

    //deletion at the end of the list
    //Time Complexity: O(N)    Space Complexity: O(1)
    void deleteend(){
        node current=head;
        if(head==null){
            System.out.println("list is empty");
        }
        else if(head.next==null){
            head=null;
        }
        else{
            while (current.next.next!=null){
                current=current.next;
            }
            current.next=null;

        }
    }


}