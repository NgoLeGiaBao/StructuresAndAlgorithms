public class TestFraction {
    public static void main (String [] agrs) {
        MyLinkedList <Fraction> myLinkedList = new MyLinkedList<>();
            Fraction f1 = new Fraction(2,3);
            Fraction f2 = new Fraction(4,3);
            Fraction f3 = new Fraction(9,10);
            Fraction f4 = new Fraction(6,7);

            myLinkedList.addFirst(f1);
            myLinkedList.addFirst(f2);
            myLinkedList.addFirst(f3);
            myLinkedList.addFirst(f4);
            myLinkedList.print();

            myLinkedList.addAfter (myLinkedList.getHead().getNext(), new Fraction(2,10));
            myLinkedList.print();

            myLinkedList.addLast(new Fraction (8,3));
            myLinkedList.print();

            myLinkedList.removeFirst();
            myLinkedList.print();

            myLinkedList.reomveLast();
            myLinkedList.print();

            myLinkedList.removeAfter(myLinkedList.getHead().getNext());
            myLinkedList.print();

            myLinkedList.removeCurr (myLinkedList.getHead().getNext());
            myLinkedList.print();

            System.out.println ("Size of my linked list: " + myLinkedList.size());
            System.out.println ("Contain element 2/3 is: " + myLinkedList.contains(new Fraction(2,3)));
            System.out.println ("Contain element 4/3 is: " + myLinkedList.contains(new Fraction(4,3)));
            System.out.println ("List is empty is: " + myLinkedList.isEmpty());
    }
}