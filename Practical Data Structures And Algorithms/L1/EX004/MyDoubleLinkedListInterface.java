import java.util.NoSuchElementException;
public interface MyDoubleLinkedListInterface{
    public void addFirst(double item);
    public void addAfter(Node curr, double item);
    public void addLast(double item);
    public double removeFirst() throws NoSuchElementException;
    public double removeAfter(Node curr) throws NoSuchElementException;
    public double removeLast() throws NoSuchElementException;
    public int size();
    public boolean contains(double item);
    public void print();
    public boolean isEmpty();
    public Node getHead();
    public double getFirst() throws NoSuchElementException;
}