public class MyStackBalanced extends MyStack<String> {
    public String checkBalancedByMyStack (String s) {
        String [] arrString = s.split("");
        for (String c : arrString) {
            if (c.equals("{") || c.equals("(") || c.equals("[")) {
                push(c);
            } else if (c.equals("}")) {
                if (getPeek().equals("{")) {
                    pop();
                }
            } else if (c.equals("]")) {
                if (getPeek().equals("[")) {
                    pop();
                }
            }else if (c.equals(")")) {
                if (getPeek().equals("(")) {
                    pop();
                }
            }
        }
        return isEmpty() ? "Balanced":"Not balanced";
    }
    public static void main (String [] args) {
        MyStackBalanced msb = new MyStackBalanced();
        System.out.println (msb.checkBalancedByMyStack("([{[}])]"));
    }
}