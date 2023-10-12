public class Test {
    public static void main (String [] args) {
        IntLinkedList ill = new IntLinkedList();
        ill.addLast(5);
        ill.addLast(6);
        ill.addLast(7);
        ill.addLast(5);
        ill.print();
        System.out.println(ill.removeAt(2));
        ill.print();
        System.out.println(ill.searchKey(1));
        System.out.println(ill.checkSorted());
        System.out.println(ill.countOdd());
    }
}