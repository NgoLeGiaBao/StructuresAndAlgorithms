public class TestSortingAlgorithms {
    public static void main (String [] args) {
        int [] arr = new int [] {3,7,8,5,2,1,9,5,4}; 
        SortingAlgorithms.printArray(arr);
        // SortingAlgorithms.selectionSort(arr);
        // SortingAlgorithms.insertSort(arr);
        // SortingAlgorithms.printArray(arr);
        // SortingAlgorithms.bubbleSort(arr);
        SortingAlgorithms.quickSort(arr, 0, arr.length-1);
        SortingAlgorithms.printArray(arr);
    }
}