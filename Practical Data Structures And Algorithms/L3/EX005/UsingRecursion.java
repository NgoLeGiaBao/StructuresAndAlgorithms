public class UsingRecursion {
    public static void main (String [] args) {
        System.out.println(covertADecimalNumberToBinary(16));
    }
    public static int covertADecimalNumberToBinary (int n) {
        if (n > 0) {
            return (10 * covertADecimalNumberToBinary(n/2)) + (n%2);
        } else {
            return 0;
        }
    }
}