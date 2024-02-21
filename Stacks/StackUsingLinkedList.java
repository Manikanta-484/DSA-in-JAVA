class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackLL {
    private Node top;

    public StackLL() {
        this.top = null;
    }

    public void push(int value) {
        // Time complexity: O(1) - inserting a new element at the top of the stack takes constant time.
        // Space complexity: O(1) - no additional space is used relative to the number of elements in the stack.
        Node newnode = new Node(value);
        newnode.next = top;
        top = newnode;
        System.out.println("pushed " + value + " to stack");
    }

    public int pop() {
        // Time complexity: O(1) - removing the top element of the stack takes constant time.
        // Space complexity: O(1) - no additional space is used relative to the number of elements in the stack.
        if (isempty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    public int peek() {
        // Time complexity: O(1) - accessing the top element of the stack takes constant time.
        // Space complexity: O(1) - no additional space is used relative to the number of elements in the stack.
        if (isempty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public boolean isempty() {
        // Time complexity: O(1) - checking if the stack is empty takes constant time.
        // Space complexity: O(1) - no additional space is used relative to the number of elements in the stack.
        return (top == null);
    }
}


public class Main {
    public static void main(String[] args) {
        StackLL stack =new StackLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("peek of the stack is "+stack.peek());
        System.out.println("is the stack empty ?:  "+stack.isempty());
        stack.pop();

    }
}