import java.util.NoSuchElementException;
public class MyDoubleNode {
    private DoubleNode head;
    private int numNode;

    public MyDoubleNode () {
        this.head = null;
        this.numNode = 0;
    }
    public void addFirst(double item) {
        if (head == null) {
            head = new DoubleNode (item);
        } else {
            head = new DoubleNode (head, item);
        }
        numNode++;
    }
    public void addAfter(DoubleNode curr, double item) {
        if (curr != null) {
            DoubleNode prev = curr;
            DoubleNode next = prev.getNext();
            if (next != null) {
                DoubleNode newNode = new DoubleNode (prev, next, item);
                curr.setNext(newNode);
                next.setPrev(newNode);
                numNode++;
            } else {
                addLast(item);
            }
        } else {
            addFirst(item);
        }
    }
    public void addLast(double item) {
        if (head == null) {
            addFirst(item);
        } else {
            DoubleNode tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            DoubleNode newNode = new DoubleNode (item);
            tmp.setNext (newNode);
            newNode.setPrev (tmp);
            numNode++;
        }
    }
    public double removeFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException ("Can't remove first element from empty list");
        }
        DoubleNode tmp = head;
        head = head.getNext();
        head.setPrev (null);
        numNode--;
        return tmp.getData();
    }
    public double removeAfter(DoubleNode curr) throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException ("Can't remove last from empty list");
        } else{
            if (curr == null) {
                return removeFirst();
            } else if (curr.getNext() == null) {
                throw new NoSuchElementException ("There is no next element");
            }else {
                DoubleNode prev = curr;
                DoubleNode del = curr.getNext();
                DoubleNode next = del.getNext();
                prev.setNext(next);
                next.setPrev(prev);
                numNode--;
                return curr.getData();
            }
        }
    }
    public double removeLast() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException ("Can't remove last from empty list");
        } else {
            if (head.getNext() == null) {
                return removeFirst();
            } else {
                DoubleNode tmp = head.getNext();
                DoubleNode prev = head;
                while (tmp.getNext()!= null) {
                    prev = tmp;
                    tmp = tmp.getNext();
                }
                prev.setNext(null);
                numNode--;
                return tmp.getData();
            }
        }
    }
    public void print() {
        if (head != null) {
            System.out.print (head.getData());
            DoubleNode tmp = head.getNext();
            while (tmp != null) {
                System.out.print (" -> " + tmp.getData());
                tmp = tmp.getNext();
            }
            System.out.println();
        }
    }
    public boolean isEmpty() {
        return this.numNode == 0 ? true : false;
    }
    public double getFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException ("Can't get first from empty list");
        }
        return head.getData();
    }
    public DoubleNode getHead() {
        return this.head;
    }
    public int size() {
        return this.numNode;
    }
    public boolean contains(double item) {
        DoubleNode tmp = head;
        while (tmp != null) {
            if (tmp.getData() == item) {
                return true;
            } 
            tmp = tmp.getNext();
        }
        return false;
    }
}