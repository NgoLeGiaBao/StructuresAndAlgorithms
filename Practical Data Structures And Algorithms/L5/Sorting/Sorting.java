import java.util.Arrays;
public class Sorting {
    // Swap 
    private static void swap (int [] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    // Selection sort
    public static void selectionSort (int [] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
    }
    // Bulle sort 
    public static void bubbleSort (int [] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) 
                    swap(arr, j, j+1);
            }
        }
    }
    // Insert sort 
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
    // Merge
    private static void merge (int [] arr, int l, int m, int r) {
        // Get length of two arrays
        int n1 = m - l + 1;
        int n2 = r - m;
        // Create two arrays with length got
        int [] L = new int [n1];
        int [] R = new int [n2];
        // Add element into two arr
        int k = l;
        for (int i = 0; i < n1; i++)
            L[i] = arr[k++];
        for (int j = 0; j < n2; j++)
            R[j] = arr[k++];
        // Compare values between 2 array L and R
        int i = 0;
        int j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (L[i] < R[j]){
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        // Give remaining of L into array
        while (i < n1)
            arr[k++] = L[i++];
        // Give reaming of R into array
        while (j < n2)
            arr[k++] = R[j++];
    }
    public static void meregeSort (int [] arr, int first, int last) {
        if (first < last) {
            int middle = (first+last)/2;
            meregeSort(arr, first, middle);
            meregeSort(arr, middle+1, last);
            merge(arr, first, middle, last);
        }
    }
    private static int partition (int [] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j < high - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }
    public static void quickSort (int [] arr, int first, int last) {
        if (first < last) {
            int pi = partition(arr, first, last);
            quickSort(arr, first, pi-1);
            quickSort(arr, pi+1, last);
        }
    }
    public static void main (String [] args) {
        int [] arr = {1,0,10,3,2,9,6};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
		