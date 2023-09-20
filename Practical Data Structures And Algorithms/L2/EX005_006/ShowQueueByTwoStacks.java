public class ShowQueueByTwoStacks <E>{
    public void showQueueByTwoStacks (E [] arr) {
        MyStack<E> myStackFirst = new MyStack<>();
        MyStack<E> myStackSecond = new MyStack<>();
        MyQueue <E> myQueue = new MyQueue<>();
        for (E obj : arr) {
            myStackFirst.push(obj);
            myQueue.enQueue(obj);
        }
        System.out.println ("First stack and queue:");
        myStackFirst.print();
        myQueue.print();

        while (myStackFirst.size() > 0) {
            myStackSecond.push(myStackFirst.pop());
        }
        System.out.println ("Second stack and queue:");
        myStackSecond.print();
        myQueue.print();
    }
    public static void main (String [] args) {
        ShowQueueByTwoStacks <Integer> sqbts = new ShowQueueByTwoStacks<>();
        sqbts.showQueueByTwoStacks(new Integer [] {1});
    }
}