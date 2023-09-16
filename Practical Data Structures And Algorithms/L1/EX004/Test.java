public class Test {
    public static void main (String [] args) {
        MyDoubleLinkedList mdll = new MyDoubleLinkedList();
        mdll.addFirst(2);
        mdll.addLast(1);
        mdll.addAfter (mdll.getHead(), 3);
        mdll.addFirst(8);
        mdll.addLast(4);
        mdll.print();
        mdll.removeFirst();
        mdll.removeLast();
        mdll.removeAfter(mdll.getHead());
        mdll.print();
        System.out.println ("Size of my double linked list is: " + mdll.size());
        System.out.println ("Double linked list contains 1: " + mdll.contains(1));
        System.out.println ("Double linked list contains 3: " + mdll.contains(3));
        System.out.println ("Double linked list is empty: " + mdll.isEmpty());
        System.out.println ("First element in double linked list is: " + mdll.getFirst());

    }
}