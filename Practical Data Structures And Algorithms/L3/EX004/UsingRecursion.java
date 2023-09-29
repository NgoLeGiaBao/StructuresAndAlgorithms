public class UsingRecursion {
    public static void main (String [] args) {
        System.out.println (expressionA(3));
        System.out.println (expressionB(3));
        System.out.println (expressionC(5));
        System.out.println (expressionD(6,6));
        System.out.println (expressionD(6,5));
        System.out.println (expressionD(6,4));
        System.out.println (expressionD(6,3));
        System.out.println (expressionD(6,2));
        System.out.println (expressionD(6,1));
        System.out.println (expressionE(2));
    }
    public static int expressionA (int n) {
        if (n == 1) {
            return 2*n + 1;
        }
        return (2*n + 1) + expressionA(n - 1);
    }
    public static int expressionB (int n) {
        if (n == 1) {
            return n;
        } 
        return n + expressionB(n-1);
    }
    public static int expressionC (int n) {
        if (n == 1) {
            return 1;
        }
        return n * expressionC(n-1);
    }
    public static int expressionD (int n, int r) {
        if (r == 0) {
            return 1;
        }
        return (n - r + 1) * expressionD(n, r-1);
    }
    public static double expressionE (int n) {
        if (n == 1) {
            return 3;
        }
        return Math.pow(2,n) + Math.pow(n,2) + expressionE(n-1);
    }
}