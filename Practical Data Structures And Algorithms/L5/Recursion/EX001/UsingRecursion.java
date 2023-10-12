public class UsingRecursion {
    public static double prod_recur (int a, int b) {
        if (b == 1) 
            return a;
        return a + prod_recur(a, b-1);
    }
    public static double bin2dec (int n, int exp) {
        if (n < 10)
            return n % 2 == 0 ? 0 : Math.pow(2,exp);
        double result = n%2 == 0 ? 0 : Math.pow(2,exp);
        return result + bin2dec(n/10,exp+1);
    }
    public static int maxDigit(int n) {
        if (n < 10) 
            return n;
        int digit = n % 10;
        return digit > maxDigit(n/10) ? digit : maxDigit(n/10);
    }
    public static int maxElement(int a[], int n) {
        if (n == 0)
            return a[n];
        int result = maxElement(a,n-1);
        return a[n] > result ? a[n] : result;
    }
    public static int searchKey (int a[], int n, int key) {
        if (n < 0)
            return -1;
        if (a[n] == key)
            return n;
        return searchKey(a,n-1,key);
    }
    public static void main (String [] args) {
        System.out.println (prod_recur(2,3));
        System.out.println (prod_recur(4,8));
        System.out.println (prod_recur(9,3));
        System.out.println(bin2dec(1000,0));
        
        System.out.println(bin2dec(111111,0));
        System.out.println(maxDigit(1341));
        System.out.println(maxDigit(1234));
        System.out.println(maxDigit(7543));
        int [] arr = {3,1,9,1,2,10,8,4};
        System.out.println(maxElement(arr,arr.length-1));
        System.out.println(searchKey(arr,arr.length-1, 8));
    }
}