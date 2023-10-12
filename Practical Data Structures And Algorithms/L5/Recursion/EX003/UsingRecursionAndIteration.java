public class UsingRecursionAndIteration {
    public static double expressionAUseRec(int n) {
        if (n == 0)
            return 2;
        return 2 - ((1/2)*expressionAUseRec(n-1));
    }
    public static double expressionAUseIteration (int n) {
        int result = 2;
        for (int i = 1; i <= n; i++)
            result = 2 - (1/2 * result);
        return result; 
    }
    public static int expressionBUseRec (int n) {
        if (n < 10)
            return 1;
        return 1 + expressionBUseRec(n/10);
    }
    public static int expressionBUseIteration (int n) {
        int count = 0;
        while (n > 0){
            n /= 10;
            count++;
        }
        return count;
    }
    public static int expressionCUseRec(int n, int k) {
        if (k == 1)
            return n;
        return n + expressionCUseRec(n, k-1);
    }
    public static int expressionCUseIteration(int n, int k) {
        int result = 0;
        for (int i = 1; i <= k; i++)
            result += n;
        return result;
    }
    public static int expressionDUseRec (int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return expressionDUseRec(n-1) + expressionDUseRec(n-2);
    }
    public static int expressionDUseInteration (int n) {
        int n1 = 0;
        int n2 = 1;
        for (int i = 2; i <= n; i++){
            int tmp = n1 + n2;
            n1 = n2;
            n2 = tmp;
        }
        return n == 0 ? n1 : n2;
    }
    public static void main (String [] args) {
        System.out.println (expressionAUseRec(5));
        System.out.println (expressionAUseIteration(5));
        System.out.println(expressionBUseRec(1000));
        System.out.println(expressionBUseIteration(1000));
        System.out.println(expressionCUseRec(5,5));
        System.out.println(expressionCUseIteration(5,5));
        System.out.println (expressionDUseRec(4));
        System.out.println (expressionDUseInteration(4));
    }
}