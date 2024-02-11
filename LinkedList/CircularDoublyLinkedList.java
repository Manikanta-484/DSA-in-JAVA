// Circular doubly linked list node
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

// Circular doubly linked list implementation
class circulardoublylinkedlist {
    doublynode head;

    // Time complexity: O(1)
    // Space complexity: O(1)
    void insertbeg(int value) {
        doublynode newnode = new doublynode(value);
        if (head == null) {
            head = newnode;
            head.next = head;
            head.prev = head;
        } else {
            doublynode tail = head.prev;
            newnode.next = head;
            head.prev = newnode;
            newnode.prev = tail;
            tail.next = newnode;
            head = newnode;
        }
    }

    // Time complexity: O(1)
    // Space complexity: O(1)
    void insertEnd(int value) {
        doublynode newnode = new doublynode(value);
        if (head == null) {
            head = newnode;
            head.next = head;
            head.prev = head;
        } else {
            doublynode tail = head.prev;
            newnode.prev = tail;
            newnode.next = head;
            tail.next = newnode;
            head.prev = newnode;
        }
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    void display() {
        doublynode temp = head;
        if (head == null) {
            System.out.println("List is empty ");
        } else {
            do {
                System.out.print(temp.data + "--->");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }
    }

    // Time complexity: O(1)
    // Space complexity: O(1)
    void deleteFront() {
        if (head == null) {
            System.out.println("List is empty ");
        } else if (head.next == head) {
            head = null;
        } else {
            doublynode tail = head.prev;
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty ");
        } else if (head.next == head) {
            head = null;
        } else {
            doublynode tail = head.prev;
            doublynode secondLastTail = tail.prev;
            secondLastTail.next = head;
            head.prev = secondLastTail;
        }
    }

    void deleteDuplicates() {
        if (head == null || head.next == head) {
            return; // No duplicates in an empty list or list with only one node
        }
        
        HashSet<Integer> set = new HashSet<>();
        Node current = head;

        do {
            if (set.contains(current.data)) {
                Node prevNode = current.prev;
                Node nextNode = current.next;
                prevNode.next = nextNode;
                nextNode.prev = prevNode;
            } else {
                set.add(current.data);
            }
            current = current.next;
        } while (current != head);
    }
}

public class Main {
    public static void main(String[] args) {
        circulardoublylinkedlist circulardoubly = new circulardoublylinkedlist();
        circulardoubly.insertbeg(4);
        circulardoubly.insertbeg(3);
        circulardoubly.insertbeg(2);
        circulardoubly.insertbeg(1);
        circulardoubly.display();
        circulardoubly.deleteEnd();
        circulardoubly.display();
        circulardoubly.deleteFront();
        circulardoubly.display();
    }
}
