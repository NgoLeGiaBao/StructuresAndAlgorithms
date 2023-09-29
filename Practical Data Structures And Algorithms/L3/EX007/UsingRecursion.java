public class UsingRecursion {
    public static void main (String [] args) {
        int [] arrA = new int [] {-3,8,1,2,0,4};
        int [] arrB = new int [] {};
        System.out.println(findMin(arrA, arrA.length-1));
        System.out.println(sum(arrA, arrA.length-1));
        System.out.println(countEven(arrA, arrA.length-1));
    }
    public static int findMin (int [] arr, int length) {
        if (length == 0)
            return arr[length];
        return arr[length] < findMin(arr,length-1) ? arr[length] : findMin(arr,length-1);
    }
    public static int sum (int [] arr, int length) {
        if (length == 0)
            return arr[length];
        return arr[length] + sum(arr, length-1);
    }
    public static int countEven (int [] arr, int length){
        if (length == 0)
            return arr[length] % 2 == 0 ? 1 : 0;
        return arr[length] % 2 == 0 ? 1 + countEven(arr,length-1) : countEven(arr,length-1);
    }
}