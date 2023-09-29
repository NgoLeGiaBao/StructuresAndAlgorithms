public class MyLinkedList {
    public Node head;
    public void print () {
        if (head == null) {
            System.out.println ("This is empty list");
        } else {
            Node tmp = head;
            System.out.print (tmp.getData());
            while (tmp.getNext()!= null) {
                tmp = tmp.getNext();
                System.out.print (" -> " + tmp.getData());
            }
            System.out.println();
        }
    }
    public Node recursiveSortedList (Node curr, Integer item) {
        if (curr == null || curr.getData() > item) 
            return new Node (item, curr);
        curr.setNext(recursiveSortedList(curr.getNext(), item));
        return curr;
    }
    public int countNodeWithEvenNumber (Node curr) {
        if (curr == null)
            return 0;
        return curr.getData() % 2 == 0 ? 1 + countNodeWithEvenNumber(curr.getNext()) : countNodeWithEvenNumber(curr.getNext());
    }
    public int sumNodeWithInteger (Node curr) {
        if (curr == null) 
            return 0;
        return sumNodeWithInteger(curr.getNext()) + curr.getData();
    }
    public void addSortedList (Integer item){
        head = recursiveSortedList(head, item);  
    }
    public static void main (String [] args) {
        MyLinkedList mll = new MyLinkedList();
        mll.addSortedList(5);
        mll.addSortedList(3);
        mll.addSortedList(6);
        mll.addSortedList(6);
        mll.addSortedList(67);
        mll.print();
        System.out.println(mll.countNodeWithEvenNumber(mll.head));
        System.out.println(mll.sumNodeWithInteger(mll.head));
    }
}