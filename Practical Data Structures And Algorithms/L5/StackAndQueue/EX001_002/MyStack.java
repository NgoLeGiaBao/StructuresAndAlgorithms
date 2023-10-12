import java.util.NoSuchElementException;
public class MyStack<E> implements StackInterface<E> {
    private Node<E> top;
    private int numNode = 0;

    public void push (E item) {
        top = new Node<E>(item, top);
        numNode++;
    }
    public E pop() {
        Node <E> tmp = top;
        if (tmp == null)
            throw new NoSuchElementException ("Can't pop element from empty stack");
        top = tmp.getNext();
        numNode--;
        return tmp.getData();
    }
    public int size () {
        return numNode;
    }
    public boolean contains (E item){
        if (top == null) 
            return false;
        Node<E> tmp = top;
        while (tmp != null) {
            if (tmp.getData().equals(item))
                return true;
            tmp = tmp.getNext();
        }
        return false;
    }
    public void print () {
        if (top != null) {
            System.out.print ("Stack: " + top.getData());
            Node<E> tmp = top.getNext();
            while (tmp != null) {
                System.out.print (" -> " + tmp.getData());
                tmp = tmp.getNext();
            }
            System.out.println();
        } else {
            System.out.print ("Stack is empty");
        }
    }
    public boolean isEmpty () {
        return numNode == 0 ? true : false;
    }
    public E peek () throws NoSuchElementException {
        if (top == null)
            throw new NoSuchElementException ("Can't get element from empty stack");
        return top.getData();
    }
}