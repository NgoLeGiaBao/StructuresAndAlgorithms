public class Main {
    public static int [] heapSortAscending (int [] arr) {
        int [] heapSortArr = new int [arr.length]; 
        MinHeap mh = new MinHeap(arr.length+1);
        for (int i = 0; i < arr.length; i++) {
            mh.insert(arr[i]);
        }
        for (int i = 0; i < arr.length; i++){
            heapSortArr[i] = mh.extractMin();
        }
        return heapSortArr;
    }
    public static int [] heapSortDescending (int [] arr) {
        int [] heapSortArr = new int [arr.length]; 
        MaxHeap mh = new MaxHeap(arr.length+1);
        for (int i = 0; i < arr.length; i++) {
            mh.insert(arr[i]);
        }
        for (int i = 0; i < arr.length; i++){
            heapSortArr[i] = mh.extractMax();
        }
        return heapSortArr;
    }
    public static void main (String [] args) {
        int [] arr = {15, 23, 18, 63, 21, 35, 36, 21, 66, 12, 42, 35, 75, 23, 64, 78, 39};
        // int [] arr = {9,4,3,10,2};
        for (int ele : heapSortAscending(arr))
            System.out.print(ele + " ");
    }
}