public class UsingAStackAndAQueueToCheckPalindrome {
    public static boolean checkPalindromeByAStackAndAQueue (String s) {
        MyStack <Character> sc = new MyStack<>();
        MyQueue <Character> qc = new MyQueue<>();
        String [] arrS = s.split("");
        for (String ch : arrS) {
            Character c = ch.charAt(0);
            if ((c >= 61 && c <= 90) || (c >= 97 && c <= 122)) {
                System.out.println(c);
                sc.push(c);
                qc.enQueue(c);
            }
        }
        while (!sc.isEmpty()) {
            if (!((sc.pop()+"").equalsIgnoreCase(qc.deQueue()+""))) {
                return false;
            }
        }
        return true;
    }
    public static void main (String [] args) {
       System.out.println(checkPalindromeByAStackAndAQueue("A man, a plan, a canal: Panama"));
    }
}