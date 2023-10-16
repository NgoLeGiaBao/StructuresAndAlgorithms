public class Test {
    public static void main (String [] agrs) {
        CharLinkedList cll = new CharLinkedList();
        System.out.println(cll.largestCharPostition());
        System.out.println(cll.addAfterFirstKey('E','b'));
        cll.addFirst('c');
        cll.addFirst('b');
        cll.addFirst('d');
        cll.addFirst('A');
        System.out.println(cll.addAfterFirstKey('E','b'));
        System.out.println(cll.largestCharPostition());

        cll.print();
    }   
}