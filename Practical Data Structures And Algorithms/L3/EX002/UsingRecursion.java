public class UsingRecursion {
    public static void main (String [] args) {
        System.out.println (factorial(5));
        System.out.println (power(2,5));
        System.out.println (countDigit(1111));
        System.out.println (countDigit(11));
        System.out.println (findGCD(7,5));
    }
    public static int factorial (int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial (n - 1);
    }
    public static int power (int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power (x, n - 1);
    }
    public static int countDigit (int number) {
        if (number <= 10) {
            return 1;
        } 
        return 1 + countDigit (number/10);
    }
    public static int findGCD (int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD (b, a % b);
    }
}