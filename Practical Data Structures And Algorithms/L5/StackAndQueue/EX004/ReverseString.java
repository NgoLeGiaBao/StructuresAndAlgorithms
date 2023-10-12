import java.util.Stack;
public class ReverseString {
    public static String reverseString (String str) {
        Stack<String> stackString = new Stack<String>();
        String k = str.replaceAll("\\s\\s+", " ").trim();
        String [] splitStr = k.split(" ");
        for (String s : splitStr) {
            System.out.println(s);
            stackString.push(s);
        }
        String reverse = "";
        while (!stackString.isEmpty())
            reverse = reverse + stackString.pop() +" ";
        return reverse;
    }
    public static void main (String [] args) {
        String str = "I   like  apple";
        System.out.println (reverseString(str));
        // System.out.println (str.replaceAll("\\s\\s+", " "));
    }
}