public class Stack {
    int maxsize;
    int stackArray[];
    int top;

    Stack(int size){
        maxsize=size;
        stackArray=new int[maxsize];
        top=-1;
        /*
        If top were initialized outside the constructor,
         you would need to remember to set it to -1 every time you
         create a new instance of the Stack.
         By initializing it in the constructor,
         you ensure that top is always correctly initialized
         when a new Stack is created.
        */
    }

    public void push(int value){
        // Time complexity: O(1) - inserting an element at the top of the stack takes constant time.
        // Space complexity: O(1) - no additional space is used relative to the number of elements in the stack.
        if(isfull()){
            System.out.println("Stack is full, cannot push "+ value);
            return;
        }
        stackArray[++top]=value;
        System.out.println("pushed "+value+" to Stack");
    }

    public int pop(){
        // Time complexity: O(1) - removing the top element of the stack takes constant time.
        // Space complexity: O(1) - no additional space is used relative to the number of elements in the stack.
        if(isempty()){
            System.out.println("Stack is empty, cannot pop");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek(){
        // Time complexity: O(1) - accessing the top element of the stack takes constant time.
        // Space complexity: O(1) - no additional space is used relative to the number of elements in the stack.
        if(isempty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isempty(){
        // Time complexity: O(1) - checking if the stack is empty takes constant time.
        // Space complexity: O(1) - no additional space is used relative to the number of elements in the stack.
        return (top==-1);
    }

    public boolean isfull(){
        // Time complexity: O(1) - checking if the stack is full takes constant time.
        // Space complexity: O(1) - no additional space is used relative to the number of elements in the stack.
        return (top==maxsize-1);
    }

    public void deletestack(){
        // Time complexity: O(1) - resetting the top index to -1 takes constant time.
        // Space complexity: O(1) - no additional space is used relative to the number of elements in the stack.
        top=-1;
        System.out.println("Stack is deleted successfully");
    }
}



public class Main {
    public static void main(String[] args) {
        Stack stack =new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("peek of the stack is "+stack.peek());
        System.out.println("is the stack full ?:  "+stack.isfull());
        System.out.println("is the stack empty ?:  "+stack.isempty());

        stack.pop();

    }
}