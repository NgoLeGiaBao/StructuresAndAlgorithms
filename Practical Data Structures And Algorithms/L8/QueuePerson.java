import java.util.NoSuchElementException;
public class QueuePerson {
    Person [] heap;
    int heapSize;
    int maxSize;

    public QueuePerson (int capacity){
        heapSize = 0;
        this.maxSize = capacity + 1;
        heap = new Person [maxSize];
        heap [0] = null;
    }
    private int parent (int i){
        return i/2;
    }
    private int left (int i) {
        return i * 2;
    }
    private int right (int i){
        return (i * 2) + 1;
    }
    private void swap (int i, int j) {
        Person tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }
    private void shiftUp (int index) {
        while (index > 1 && heap[index].getID() > heap[parent(index)].getID()){
            swap(index, parent(index));
            index = parent(index);
        }
    }
    private void shiftDown (int index) {
        while (index <= heapSize){
            int maxV = heap[index].getID();
            int maxId = index;
            if (left(index) <= heapSize && maxV < heap[left(index)].getID()){
                maxV = heap[left(index)].getID();
                maxId = left(index);
            }
            if (right(index) <= heapSize && maxV < heap[right(index)].getID()){
                maxV = heap[right(index)].getID();
                maxId = right(index);
            }
            if (maxId != index){
                swap(index, maxId);
                index = maxId;
            } else {
                break;
            }
        }
    }
    public void insert (Person p) {
        if (heapSize == maxSize)
            throw new NoSuchElementException("Overflow Exception");
        heapSize++;
        heap[heapSize] = p;
        shiftUp(heapSize);
    }
    public Person extractMax () {
        if (heapSize == 0)
            throw new NoSuchElementException("Underflow Exception");
        Person pp = heap[1];
        heap[1] = heap[heapSize];
        heapSize--;
        shiftDown(1);  
        return pp;
    }
}