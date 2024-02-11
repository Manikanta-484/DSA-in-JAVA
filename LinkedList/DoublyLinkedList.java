// Doubly linked list node
class doublynode {
    int data;
    doublynode next;
    doublynode prev;

    public doublynode(int value) {
        this.data = value;
        this.next = null;
        this.prev = null;
    }
}

class doublylinkedlist {
    doublynode head;
    doublynode tail;

    // Time complexity: O(1)
    // Space complexity: O(1)
    void insertbeg(int value) {
        if (head == null) {
            doublynode newnode = new doublynode(value);
            head = newnode;
            tail = head;
        } else {
            doublynode newnode = new doublynode(value);
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }

    // Time complexity: O(1)
    // Space complexity: O(1)
    void insertend(int value) {
        if (head == null) {
            doublynode newnode = new doublynode(value);
            head = newnode;
            tail = head;
        } else {
            doublynode newnode = new doublynode(value);
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    void display() {
        doublynode temp = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (temp != null) {
                System.out.print(temp.data + "--->");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Time complexity: O(1)
    // Space complexity: O(1)
    void deleteFront() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Time complexity: O(1)
    // Space complexity: O(1)
    void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        doublylinkedlist doubly = new doublylinkedlist();
        doubly.insertbeg(4);
        doubly.insertbeg(3);
        doubly.insertbeg(2);
        doubly.insertbeg(1);
        doubly.display();
        doubly.deleteEnd();
        doubly.display();
        doubly.deleteFront();
        doubly.display();
    }
}
