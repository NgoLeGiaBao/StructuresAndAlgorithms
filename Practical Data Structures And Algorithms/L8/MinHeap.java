import java.util.NoSuchElementException;
public class MinHeap {
    int [] heap;
    int heapSize;
    int maxSize;
    
    public MinHeap (int capacity) {
        this.maxSize = capacity;
        heap = new int [maxSize + 1];
        this.heapSize = 0;
        this.heap[0] = -1;
    }

    private int parent (int i){
        return i / 2;
    }
    private int left (int i) {
        return i * 2;
    }
    private int right (int i) {
        return (i * 2) + 1;
    }
    private void swap (int i, int j) {
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }
    private void shiftUp (int index) {
        while (index > 1 && heap[index] < heap[parent(index)]) {
            swap (index, parent(index));
            index = parent(index);
        }
    }
    private void shiftDown (int index) {
        while (index <= heapSize){
            int minV = heap[index];
            int minId = index;
            if (left(index) <= heapSize && heap[left(index)] < minV) {
                minV = heap[left(index)];
                minId = left(index);
            }
            if (right(index) <= heapSize && heap[right(index)] < minV) {
                minV = heap[right(index)];
                minId = right(index);
            }
            if (minId != index) {
                swap(index, minId);
                index = minId;
            } else {
                break;
            }
        }
    }
    public void insert (int key) {
        if (heapSize == maxSize) 
            throw new NoSuchElementException ("Overflow exception");
        heapSize++;
        heap[heapSize] = key;
        shiftUp(heapSize);
    }
    public int extractMin () {
        if (heapSize == 0)
            throw new NoSuchElementException ("Underflow exception");
        int minV = heap[1];
        heap[1] = heap[heapSize];
        heapSize--;
        shiftDown(1);
        return minV;
    }
}