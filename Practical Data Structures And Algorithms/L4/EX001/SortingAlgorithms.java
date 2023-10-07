public class SortingAlgorithms {
    // Print Array
    private static void recursivePrint (int [] arr, int length) {
        if (length == 0){
            System.out.print (arr[0] + " ");
        } else {
            recursivePrint(arr, length-1);
            System.out.print (arr[length] + " ");
        }
    }
    public static void printArray (int [] arr) {
        recursivePrint(arr, arr.length-1);
        System.out.println();
    }
    // Selection sort: choose minimum element
    public static void selectionSort (int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }
    // Bubble sort: "bubbling up" the largest element to the right partition of the array
    public static void bubbleSort (int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    // Insert sort: insert the number to the left partition of the array
    public static void insertSort (int [] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    /**
     * The merge sort algorithm involves three steps:
     * + If the number of items to sort is 0 or 1, return
     * + Recursively sort the first and second halves separately
     * + Merge the two sorted halves into a sorted
     */
    private static void merge (int [] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int [] L = new int [n1];
        int [] R = new int [n2];

        for (int i = 0; i < n1; i++) 
            L[i] = arr[l+i];
        for (int j = 0; j < n2; j++) 
            R[j] = arr[m+1+j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
    public static void mergeSort (int [] arr, int first, int last) {
        if (first < last) {
            int middle = (first + last)/2;
            mergeSort(arr, first,middle);
            mergeSort(arr, middle+1, last);
            printArray(arr);
            merge(arr,first,middle, last);
        }
    }
    /**
    + Pick an element, called a pivot (trục), from the array.
    + Partitioning: reorder the array so that all elements with values less than the pivot
    come before the pivot, while all elements with values greater than the pivot come
    after it (equal values can go either way). After this partitioning, the pivot is in its
    final position. This is called the partition operation.
    + Recursively apply the above steps to the sub-array of elements with smaller values
    and separately to the sub-array of elements with greater values.
     */
    private static int partition (int [] arr, int low, int high) {
        int pivot = arr[high];
        // index of smaller element
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        } 
        int tmp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = tmp;
        return i+1;
    }   
    public static void quickSort (int [] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
}