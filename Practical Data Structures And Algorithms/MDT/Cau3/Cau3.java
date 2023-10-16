import java.util.Stack;
public class Cau3 {
    private static int checkOperator (String operator) {
        switch (operator){
            case "+":
                return 1;
            case "-":
                return 2;
            case "*":
                return 3;
            case "/":
                return 4;
            case "^":
                return 5;
        }
        return -1;
    }
    private static boolean isNumber (String str) {
        return str.matches("0|([1-9][0-9]*)");
    }
    public static int calculate(String[] expression) {
        Stack<Integer> stack = new Stack<Integer>();
        for (String s : expression){
            if (isNumber(s)){
                stack.push(Integer.parseInt(s));
            } else {
                int a = stack.pop();
                int b = stack.pop();
                if (checkOperator(s) == 1){
                    stack.push(b+a);
                } else if (checkOperator(s) == 2){
                    stack.push(b-a);
                } else if (checkOperator(s) == 3){
                    stack.push(b*a);
                } else if (checkOperator(s) == 4){
                    stack.push(b/a);
                }
            }
        }
        return stack.pop();
    }

    public static void main(String args[]){
		System.out.println(calculate(new String[]{"31", "12", "+"}));
		System.out.println(calculate(new String[]{"3", "4", "+","2","1","+","-"}));

    }
}