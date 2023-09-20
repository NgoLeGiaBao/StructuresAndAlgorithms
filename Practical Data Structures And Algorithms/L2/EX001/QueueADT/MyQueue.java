import java.util.NoSuchElementException;
public class MyQueue<E> implements QueueInterface<E> {
    private Node<E> front;
    private Node<E> rear;
    private int numNode = 0;

    public void enQueue (E item) {
        if (front == null) {
            front = new Node (item);
            rear = front;
        } else {
            Node<E> tmp = front;
            while (tmp.getNext()!= null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node(item));
            rear = rear.getNext();
        }
        numNode++;
    }
    public E deQueue () throws NoSuchElementException {
        if (front == null) {
            throw new NoSuchElementException ("Can't dequeue from empty list");
        } else {
            Node<E> tmp = front;
            front = front.getNext();
            numNode--;
            return tmp.getData();
        }
    }
    public int size () {
        return this.numNode;
    }
    public boolean contains (E item) {
        if (front == null) {
            return false;
        } else {
            Node<E> tmp = front;
            while (tmp != null) {
                if (tmp.getData().equals(item)) {
                    return true;
                }
                tmp = tmp.getNext();
            }
            return false;
        }
    }
    public void print () {
        if (front != null) {
            System.out.print ("Queue is: " + front.getData());
            Node <E> tmp = front.getNext();
            while (tmp != null) {
                System.out.print (" -> " + tmp.getData());
                tmp = tmp.getNext();
            }
            System.out.println();
        } else {
            System.out.println ("Queue is empty");
        }
    }
    public boolean isEmpty () {
        return this.numNode == 0?true:false;
    }
    public E getFront () {
        return this.front.getData();
    }
}