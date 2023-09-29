public class UsingIteration {
    public static void main (String [] args) {
        int [] arrA = new int [] {1,8,9,3,0,2};
        int [] arrB = new int [] {};
        try {
            System.out.println (findMinimum(arrA, arrA.length));
            System.out.println (findMinimum(arrB, arrB.length));
        } catch (Exception e) {
            System.out.println (e.getMessage());
        }
        try {
            System.out.println (findSum(arrA, arrA.length));
            System.out.println (findSum(arrB, arrB.length));
        } catch (Exception e) {
            System.out.println (e.getMessage());
        }
        try {
            System.out.println (findEvenSum(arrA, arrA.length));
            System.out.println (findEvenSum(arrB, arrB.length));
        } catch (Exception e) {
            System.out.println (e.getMessage());
        }
    }
    public static int findMinimum (int [] arr, int length) throws Exception {
        if (length == 0) {
            throw new Exception ("Can't find minimum from empty array");
        } else {
            int min = arr[0];
            for (int i = 1; i < length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            return min;
        }
    }
    public static int findSum (int [] arr, int length) throws Exception {
        if (length == 0) {
            throw new Exception ("Can't find minimum from empty array");
        } else {
            int sum = 0;
            for (int i = 0; i < length; i++) {
                sum += arr[i];
            }
            return sum;
        }
    }
    public static int findEvenSum (int [] arr, int length) throws Exception {
        if (length == 0) {
            throw new Exception ("Can't find minimum from empty array");
        } else {
            int sumEven = 0;
            for (int i = 0; i < length; i++) {
                if (arr[i] % 2 == 0) {
                    sumEven += arr[i];
                }
            }
            return sumEven;
        }
    }
}