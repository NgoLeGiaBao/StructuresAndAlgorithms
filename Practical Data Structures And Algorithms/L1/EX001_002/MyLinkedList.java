import java.util.NoSuchElementException;
public class MyLinkedList <E> implements ListInterface<E> {
    private Node<E> head;
    private int numNode;

    public MyLinkedList(){
        this.head = null;
        this.numNode = 0;
    }
    public void addFirst(E item) {
        head = new Node<E> (item, head);
        numNode++;
    }
    public void addAfter(Node<E> curr, E item) {
        if (item == null) {
            this.addFirst(item);
        } else {
            Node<E> newNode = new Node<E> (item, curr.getNext());
            curr.setNext(newNode);
            numNode++;
        }
    }
    public void addLast(E item) {
        if (item == null) {
            this.addFirst(item);
        } else {
            Node<E> tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            Node<E> newNode = new Node<E> (item, null);
            tmp.setNext(newNode);
            numNode++;
        }
    }
    public E removeFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException ("Can't remove element from an empty list");
        } else {
            Node<E> tmp = head;
            head = head.getNext();
            numNode--;
            return tmp.getData();
        }
    }
    public E removeAfter(Node<E> curr) throws NoSuchElementException {
        if (curr == null) {
            throw new NoSuchElementException ("Can't remove element from an empty list");
        } else {
            Node<E> delNode = curr.getNext();
            if (delNode != null) {
                curr.setNext(delNode.getNext());
                numNode--;
                return delNode.getData();
            } else {
                throw new NoSuchElementException("No next node to remove");
            }
        }
    }
    public E reomveLast() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't remove element from an empty list");
        } else {
            Node <E> preNode = null;
            Node <E> delNode = head;
            if (delNode.getNext() == null) {
                return removeFirst();
            }
            while (delNode.getNext() != null) {
                preNode = delNode;
                delNode = delNode.getNext();
            }
            preNode.setNext(delNode.getNext());
            numNode--;
            return delNode.getData();
        }
    }
    public int size(){
        return this.numNode;
    }
    public boolean contains(E item) {
        Node<E> tmp = head;
        while(tmp != null) {
            if (tmp.getData().equals(item)) {
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }
    public void print(){
        if (head != null) {
            Node<E> tmp = head;
            System.out.print ("List: " + tmp.getData());
            tmp = tmp.getNext();
            while (tmp != null) {
                System.out.print(" -> " + tmp.getData());
                tmp = tmp.getNext();
            }
            System.out.println();
        }
    }
    public boolean isEmpty() {
        return this.size() == 0 ? true : false;
    }
    public Node<E> getHead(){
        return this.head;
    }
    public E getFirst() throws NoSuchElementException {
        if (this.head == null) {
            throw new NoSuchElementException("Can't get element from an empty list");
        } else {
            return this.head.getData();
        }
    }
    public E removeCurr (Node<E> curr) throws NoSuchElementException {
        if (this.head == null) {
            throw new NoSuchElementException ("Can't remove current node from empty list");
        } else {
            if (head == curr) {
                return removeFirst();
            } else {
                Node<E> prev = head;
                Node<E> tmp = head.getNext();
                while (tmp != null) {
                    if (tmp == curr) {
                        prev.setNext(tmp.getNext());
                        numNode--;
                        return curr.getData();
                    }
                    prev = tmp;
                    tmp = tmp.getNext();
                }
            }
            throw new NoSuchElementException("Can't find current node in my linked list");
        }
    }
}