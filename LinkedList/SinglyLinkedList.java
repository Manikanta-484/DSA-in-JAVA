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
// question extra for sum of two list 
        linkedlist ll1 = new linkedlist();
        ll1.insertbeginning(6);
        ll1.insertbeginning(1);
        ll1.insertbeginning(7);
        ll1.display();

        linkedlist ll2 = new linkedlist();
        ll2.insertbeginning(2);
        ll2.insertbeginning(9);
        ll2.insertbeginning(5);
        ll2.display();

        sumlist s1=new sumlist();
        linkedlist result=s1.sumlist1(ll1,ll2);
        result.display();
    }
}
// class which contains method to sum two list and give new list of the result 
// calling this class is in the main method 
//You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order, 
// such that the 1's digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list.
//list1 = 7 -> 1 -> 6
//list2 =  5 -> 9 -> 2
//result = 2 -> 1 -> 9
 class sumlist {
    linkedlist sumlist1(linkedlist ll1,linkedlist ll2){
        node n1=ll1.head;
        node n2=ll2.head;
        int carry=0;
        linkedlist resultLL=new linkedlist();
        while (n1!=null|| n2!=null){
            int result=carry;
            if(n1!=null){
                result+=n1.data;
                n1=n1.next;
            }
            if(n2!=null){
                result+=n2.data;
                n2=n2.next;
            }
            resultLL.insertend(result%10);
            carry=result/10;
        }
        return resultLL;
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
