public class CaculationExpression {
    public static int checkPriority (String ch) {
        switch (ch){
        case "+":
        case "-":
            return 1;
        case "*":
        case "/":
            return 2;
        case "^":
            return 3;
        }
        return -1;
    }
    public static double resultOfTwoOperand (double a,double b, char sub) {
        switch (sub){
            case '+':
                return b + a;
            case '-':
                return b - a;
            case '*':
                return b * a;
            case '/':
                return b / a;
            case '^':
                return Math.pow(b,a);
        }
        return 0;
    }   
    public static String covertInfixToPostfix (String infix) {
        MyStack <String> stack = new MyStack<String>();
        String postfix = "";
        String infixComplete = infix.replaceAll(" ","");
        String [] arrStr = infixComplete.split("");
        for (String ch : arrStr){
            if (Character.isLetterOrDigit(ch.charAt(0))){
                postfix += ch;
            } else if (ch.equals("(")) {
                stack.push(ch);
            } else if (ch.equals(")")) {
                while ((!(stack.isEmpty())) && (!(stack.peek().equals("(")))) {
                    postfix += stack.peek();
                    stack.pop();
                }
                if (stack.isEmpty())
                    return "Expression is not valid";
                stack.pop(); 
            } else {
                while (!stack.isEmpty() && checkPriority(stack.peek()) >= checkPriority(ch)){
                    postfix += stack.pop();
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()) {
            if (stack.peek().equals("("))
                return "Expression is not valid";
            postfix += stack.pop();
        }
        return postfix;        
    }
    public static double calculatePostfix(String infix) {
        String postfix = covertInfixToPostfix(infix);
        if (postfix.equals("Expression is not valid"))
            return -1;
        MyStack<Double> stack = new MyStack<>();
        for (int i =0; i < postfix.length(); i++) {
            if (!(Character.isLetterOrDigit(postfix.charAt(i)))) {
                stack.push(resultOfTwoOperand(stack.pop(), stack.pop(),postfix.charAt(i)));
            } else {
                stack.push((Double)Double.parseDouble(postfix.charAt(i)+""));
            }    
        }
        return stack.peek();
    }
    public static void main (String [] args) {
        System.out.println(covertInfixToPostfix("3(+8* 9+8)"));
    }
}