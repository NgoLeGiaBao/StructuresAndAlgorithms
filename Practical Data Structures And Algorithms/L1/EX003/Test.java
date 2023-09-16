public class Test {
    public static void main (String [] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(1);
        myLinkedList.print();
        myLinkedList.reverseList();
        myLinkedList.print();


        myLinkedList.addFirst(11);
        myLinkedList.addFirst(9);
        myLinkedList.addFirst(25);
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(53);
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(7);
        myLinkedList.print();
        
        myLinkedList.print();
        System.out.println(myLinkedList.findMaximunNumber());
        System.out.println(myLinkedList.countEvenItemInList());
        System.out.println(myLinkedList.countPrimeItemInList());
        System.out.println(myLinkedList.getLastNode());
        myLinkedList.sortListAscending();
        System.out.println(myLinkedList.getHead());
        myLinkedList.sortListAscending();
        myLinkedList.reverseList();
        myLinkedList.print();    
        System.out.println (myLinkedList.findMaximunNumber());
        System.out.println (myLinkedList.findMinimunNumber());
        System.out.println (myLinkedList.getFirst());
        System.out.println (myLinkedList.countEvenItemInList());
        System.out.println (myLinkedList.countPrimeItemInList());
        myLinkedList.addItemXBeforeFirstEvenElement(10);
        myLinkedList.print();
        System.out.println (myLinkedList.getLastNode());
        System.out.println(myLinkedList.contains(3));
        System.out.println (myLinkedList.reomveLast());
        System.out.println(myLinkedList.removeFirst());
        myLinkedList.print();
        System.out.println(myLinkedList.contains(3));
        myLinkedList.addLast(21);
        myLinkedList.print();

        myLinkedList.addAfter (myLinkedList.findNodeWithMinValue(), 100);
        myLinkedList.print();
    }
}