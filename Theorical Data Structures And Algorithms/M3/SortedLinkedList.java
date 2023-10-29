public class SortedLinkedList {
    private Node head;
    private int numNode;
    
    public SortedLinkedList () {
        this.head = null;
        this.numNode = 0;
    }
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
    public void add (int data) {
        if (head == null || data < head.getData()) {
            head = new Node (data, head);
        } else {
            Node tmp = head;
            while (tmp.getNext() != null && tmp.getNext().getData() < data ) {
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node(data, tmp.getNext()));
        }
        numNode++;
    }
    public boolean remove (int data) {
        if (head == null) {
            return false;
        }
        if (head.getData() == data) {
            head = head.getNext();
            numNode--;
            return true;
        }
        Node tmp = head;
        while (tmp.getNext() != null && tmp.getNext().getData() != data) {
            tmp = tmp.getNext();
        }
        Node del = tmp.getNext();
        if (del != null) {
            tmp.setNext(del.getNext());
            numNode--;
            return true;
        }
        return false;
    }
}