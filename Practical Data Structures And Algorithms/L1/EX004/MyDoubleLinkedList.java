import java.util.NoSuchElementException;
public class MyDoubleLinkedList implements MyDoubleLinkedListInterface {
    private Node head;
    private int numNode;
    
    public MyDoubleLinkedList () {
        this.head = null;
        this.numNode = 0;
    }
    public void addFirst(double item) {
        head = new Node (item, head);
        numNode++;
    }
    public void addAfter(Node curr, double item) {
        if (curr != null) {
            curr.setNext(new Node (item, curr.getNext()));
            numNode++;
        } else {
            addFirst(item);
        }
    }
    public void addLast(double item){
        if (head != null) {
            Node tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node (item));
            numNode++;
        } else {
            addFirst(item);
        }
    }
    public double removeFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException ("Can't remove first node element from empty list");
        }
        Node tmp = head;
        head = head.getNext();
        numNode--;
        return tmp.getData();
    }
    public double removeAfter(Node curr) throws NoSuchElementException {
        if (curr == null) {
            throw new NoSuchElementException ("Can't remove after current node element list");
        } else {
            Node del = curr.getNext();
            if (del != null) {
                curr.setNext(del.getNext());
                numNode--;
                return del.getData();
            } else {
                throw new NoSuchElementException ("No next node to remove");
            }
        }
    }
    public double removeLast() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException ("Can't remove last node from empty list");
        }
        Node prev = null;
        Node tmp = head;
        while (tmp.getNext()!=null) {
            prev = tmp;
            tmp = tmp.getNext();
        }
        prev.setNext(null);
        numNode--;
        return tmp.getData();
    }
    public int size() {
        return this.numNode;
    }
    public boolean contains(double item) {
        if (head == null) {
            return false;
        }
        Node tmp = head;
        while (tmp != null) {
            if (tmp.getData() == item) {
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }
    public void print() throws NoSuchElementException{
        if (head == null) {
            throw new NoSuchElementException ("Can't print empty list");
        } else {
            Node tmp = head;
            System.out.print (tmp.getData());
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
                System.out.print (" -> " + tmp.getData());
            }
            System.out.println();
        }
    }
    public boolean isEmpty() {
        return this.size() == 0 ? true : false;
    }
    public Node getHead() {
        return this.head;
    }
    public double getFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException ("Can't get first from empty list");
        }
        return this.getHead().getData();
    }
}