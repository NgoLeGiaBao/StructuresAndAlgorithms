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
        if (head == null) {
            head = new Node (data, head);
        } else {
            if (data < head.getData()) {
                head = new Node (data, head);
            } else {
                Node prev = head;
                Node tmp = head.getNext();
                while (tmp != null) {
                    if (data < tmp.getData()) {
                        prev.setNext(new Node(data, tmp));
                        numNode++;
                        return ;
                    }
                    prev = tmp;
                    tmp = tmp.getNext();
                }
                if (prev.getData() <= data) {
                    prev.setNext(new Node(data));
                }
            }
        }
        numNode++;
    }
    public boolean remove (int data) {
        if (head == null) {
            return false;
        } else {
            if (head.getData() == data) {
                head = head.getNext();
                numNode--;
                return true;
            } else {
                Node prev = head;
                Node tmp = head.getNext();
                while (tmp != null) {
                    if (tmp.getData() == data) {
                        prev.setNext(tmp.getNext());
                        numNode--;
                        return true;
                    }
                    prev = tmp;
                    tmp = tmp.getNext();
                }
                return false;
            }
        }
    }
}