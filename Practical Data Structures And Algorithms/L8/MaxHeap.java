/*
    * Max-Heap: A[parent(i)] >= A[i]
    * Min-Heap: A[parent(i)] <= A[i]
    * Root at index 0
    + Parent(i) = (i - 1)/2
    + Left(i) = (2*i) + 1
    + Right(i) = (2*i) + 2
    * Root at index 1
    + Parent(i) = i/2
    + Left(i) = 2*i
    + Right(i) = (2*i) + 1
*/
import java.util.NoSuchElementException;
public class MaxHeap {
    int [] heap;
    int heapSize;
    int maxSize;

    public MaxHeap (int capacity){
        heapSize = 0;
        this.maxSize = capacity + 1;
        heap = new int [maxSize];
        heap [0] = -1;
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
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }
    private void shiftUp (int index) {
        while (index > 1 && heap[index] > heap[parent(index)]){
            swap(index, parent(index));
            index = parent(index);
        }
    }
    private void shiftDown (int index) {
        while (index <= heapSize){
            int maxV = heap[index];
            int maxId = index;
            if (left(index) <= heapSize && maxV < heap[left(index)]){
                maxV = heap[left(index)];
                maxId = left(index);
            }
            if (right(index) <= heapSize && maxV < heap[right(index)]){
                maxV = heap[right(index)];
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
    public void insert (int key) {
        if (heapSize == maxSize)
            throw new NoSuchElementException("Overflow Exception");
        heapSize++;
        heap[heapSize] = key;
        shiftUp(heapSize);
    }
    public int extractMax () {
        if (heapSize == 0)
            throw new NoSuchElementException("Underflow Exception");
        int maxV = heap[1];
        heap[1] = heap[heapSize];
        heapSize--;
        shiftDown(1);  
        return maxV;
    }
}