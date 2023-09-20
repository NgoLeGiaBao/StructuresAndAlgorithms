public class MyStackRecursive extends MyStack<Double> {
    public static Double recursive (Double n) {
        if (n == 1.0) {
            return 3.0;
        }
        return Math.pow(2,n) + Math.pow(n,2) + recursive(n -1);
    }
    public Double recursiveByMyStack (Double n) {
        for (Double i = n; i >= 1; i--) {
            if (i == 1) {
                push(3.0);
            } else {
                push(Math.pow(2,i) + Math.pow(i,2));
            }
        }
        while (top.getNext() != null) {
            Double arg1 = pop();
            Double arg2 = pop();
            push(arg1 + arg2);
        }
        return getPeek();
    }
    public static void main (String [] args) {
        System.out.println(recursive(5.0));
        MyStackRecursive myStackRecursive = new MyStackRecursive();
        System.out.println(myStackRecursive.recursiveByMyStack(1.0));
    }
}