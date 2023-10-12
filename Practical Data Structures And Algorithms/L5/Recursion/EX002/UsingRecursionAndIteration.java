public class UsingRecursionAndIteration {
    public static int expressionAUseRec(int n) {
        if (n == 0)
            return 1;
        return 2 * expressionAUseRec(n-1);
    }
    public static int expressionAUseIteration (int n) {
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= 2;
        return result;
    }
    public static double expressionBUseRec (int n) {
        if (n == 0)
            return 1/2;
        return expressionBUseRec(n-1) + ((n+1)/2);
    } 
    public static double expressionBUseIteration (int n) {
        double result = 0;
        for (int i = 0; i <= n; i++)
            result += ((i+1)/2);
        return result;
    }
    public static int expressionCUseRec(int x) {
        if (x == 1)
            return 1;
        return x + expressionCUseRec(x-1);
    }
    public static int expressionCUseIteration(int n){
        int result = 0;
        for (int i = 2; i <= n; i++)
            result += i;
        return result;
    }
    public static int expressionDUseRec (int x) {
        if (x <= 1)
            return 0;
        return (x * (x-1)) + expressionDUseRec(x-1);
    }
    public static int expressionDUseIteration (int n){
        int result = 0;
        for (int i = 1; i <= n; i++)
            result += (i * (i-1));
        return result;
    }
    public static int expressionEUseRec (int n) {
        if (n == 1)
            return 1;
        return n * expressionEUseRec(n-1);
    }
    public static int expressionEUseIteration (int n) {
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }   
    public static void main (String [] args) {
        System.out.println (expressionAUseRec(5));
        System.out.println(expressionAUseIteration(5));
        System.out.println (expressionBUseRec(5));
        System.out.println (expressionBUseIteration(5));
        System.out.println (expressionCUseRec(5));
        System.out.println (expressionCUseRec(5));
        System.out.println (expressionDUseIteration(5));
        System.out.println (expressionDUseRec(5));
        System.out.println (expressionEUseRec(5));
        System.out.println (expressionEUseIteration(5));

    }
}