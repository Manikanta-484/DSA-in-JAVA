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

    //getlastnode method to find the last node of the list 
    node getlastnode(){
        if(head==null){
            return null;
        }
        node current =head;
        while (current.next!=null){
            current=current.next;
        }
        return current;
    }

    // to find the size of the list 
    int size(){
        int size=0;
        node current=head;
        while (current!=null){
            size++;
            current=current.next;
        }
        return size;
    }

    // to rotate the list by given number
    /* Singly Linked List - Rotate
       Implement the following on the SinglyLinkedList class:
          Rotate
       This function should rotate all the nodes in the list by some 
       number passed in. For instance, if your list looks like
       1 -> 2 -> 3 -> 4 -> 5 and you rotate by 2,
       the list should be modified to 3 -> 4 -> 5 -> 1 -> 2. 
       The number passed in  to rotate can be any integer.
        Time Complexity : O(N), where N is the length of the list.
        Space Complexity : O(1)   */
    public void rotate(int num){
        if(head==null || num<=0){
            return;
        }
        int rotation =num%size();
        if(rotation==0){
            return;
        }
        node tail=getlastnode();
        node newtail=head;
        for(int i=1;i<rotation;i++){
            newtail=newtail.next;
        }
        node newhead =newtail.next;
        tail.next=head;
        newtail.next=null;
        head=newhead;
    }

    // method to remove a node at the given index eg 1->2->3->4->5  if void remove(2);   result list will be  1->3->4->5
    public void remove(int index) {
        if (index < 0) {
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }

        node current = head;
        node prev = null;
        int i = 0;
        while (current != null && i < index) {
            prev = current;// this will point the prev node 
            current = current.next;  // this will point the node that should be deleted
            i++;
        }
        if (current != null) {
            prev.next = current.next;
        }
    }


}
