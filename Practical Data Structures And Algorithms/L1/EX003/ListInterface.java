import java.util.NoSuchElementException;
public interface ListInterface{
    public void addFirst(Integer item);
    public void addAfter(Node curr, Integer item);
    public void addLast(Integer item);
    public Integer removeFirst() throws NoSuchElementException;
    public Integer removeAfter(Node curr) throws NoSuchElementException;
    public Integer reomveLast() throws NoSuchElementException;
    public int size();
    public boolean contains(Integer item);
    public void print();
    public boolean isEmpty();
    public Node getHead();
    public Integer getFirst() throws NoSuchElementException;
}