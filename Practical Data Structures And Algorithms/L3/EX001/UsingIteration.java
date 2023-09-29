public class UsingIteration {
    public static void main (String [] args) {
        System.out.println ("Factorial of 5! = " + factorial(5));
        System.out.println ("3^0 = " + power(3,0));
        System.out.println ("Digits in 123 is: " + countDigits(123));
        System.out.println("Prime number 5 is: " + checkPrime(5));
        System.out.println("Prime number 9 is: " + checkPrime(9));
        System.out.println ("GCD of 15 and 18 is: " + findGCD(15,18));
    }
    public static int factorial (int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static int power (int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        return result;
    }
    public static int countDigits (int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    public static boolean checkPrime (int n) {
        if (n < 2) 
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static int findGCD (int a, int b) {
        if (a == b) 
            return a;
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}