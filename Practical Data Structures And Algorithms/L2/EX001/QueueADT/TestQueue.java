public class TestQueue {
    public static void main (String [] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.enQueue(4);
        myQueue.enQueue(5);
        myQueue.enQueue(7);
        myQueue.enQueue(9);
        myQueue.print();
        System.out.println ("Element dequeued is: " + myQueue.deQueue());
        myQueue.print();
        System.out.println ("Size of queue is: " + myQueue.size());
        System.out.println ("Empty queue is: " + myQueue.isEmpty());
        System.out.println ("Front of queue is: " + myQueue.getFront());
        System.out.println ("Queue containing 7 is: "+ myQueue.contains(7));
        System.out.println ("Queue containing 10 is: "+ myQueue.contains(10));
    }
}