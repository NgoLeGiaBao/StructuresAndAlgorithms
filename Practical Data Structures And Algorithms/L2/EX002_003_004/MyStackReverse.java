public class MyStackReverse extends MyStack<String>{
    public void reverseString (String s) {
        String [] arrString = s.split("");
        for (String ch : arrString) {
            if (!ch.equals(" "))
            push(ch);
        }
        print();
    }
    public static void main (String [] args) {
        MyStackReverse msr = new MyStackReverse();
        msr.reverseString("Gia Bao");
    }
}