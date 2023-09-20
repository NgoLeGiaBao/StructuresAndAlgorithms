public class TestStack {
    public static void main (String [] args) {
        MyStack<Integer> myStack = new MyStack<Integer>();
        myStack.push(4);
        myStack.push(5);
        myStack.push(9);
        myStack.push(1);
        myStack.print();
        
        System.out.println ("Element poped is: " + myStack.pop());
        myStack.print();
        System.out.println ("Size of stack is: " + myStack.size());
        System.out.println ("Stack contain 5 is: " + myStack.contains(5));
        System.out.println ("Stack contain 12 is: " + myStack.contains(12));
        System.out.println ("Empty stack is: " + myStack.isEmpty());
        
        System.out.println ("Peek of stack is: " + myStack.getPeek());
    }
}