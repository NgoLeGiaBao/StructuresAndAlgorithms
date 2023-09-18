import java.util.NoSuchElementException;
public interface MyDoubleNodeInterface {
    public void addFirst(double item);
    public void addAfter(DoubleNode curr, double item);
    public void addLast(double item);
    public double removeFirst() throws NoSuchElementException;
    public double removeAfter(DoubleNode curr) throws NoSuchElementException;
    public double removeLast() throws NoSuchElementException;
    public void print();
    public boolean isEmpty();
    public double getFirst() throws NoSuchElementException;
    public DoubleNode getHead();
    public int size();
    public boolean contains(double item);
}