public class CheckPrimeUsingRecursion {
    public static void main (String [] args) {
        System.out.println (checkPrime(18,2));
        System.out.println (checkPrime(5,2));
        System.out.println (checkPrime(9,2));
    }
    public static boolean checkPrime (int n, int d) {
        if (n == 2 || d == n) {
            return true;
        }
        if (n % d == 0) {
            return false;
        }
        return checkPrime (n, d+1);
    }
}