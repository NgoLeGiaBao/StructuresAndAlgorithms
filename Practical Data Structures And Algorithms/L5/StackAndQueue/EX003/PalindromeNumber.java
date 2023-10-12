import java.util.*;
public class PalindromeNumber {
    public static boolean checkPalindromeNumber (int n) {
        Stack <Integer> stack = new Stack<Integer>();
        Queue <Integer> queue = new LinkedList<Integer>();
        while (n > 0) {
            int remainder = n % 10;
            stack.push(remainder);
            queue.offer(remainder);
            n /= 10;
        }
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll())
                return false;
        }
        return true;
    }
    public static void main (String [] args) {
        System.out.println (checkPalindromeNumber(1111));
        System.out.println (checkPalindromeNumber(256652));
        System.out.println (checkPalindromeNumber(98231));
        System.out.println (checkPalindromeNumber(121));
        System.out.println (checkPalindromeNumber(1221));

    }
}