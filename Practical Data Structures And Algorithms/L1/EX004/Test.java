public class Test {
    public static void main (String [] args){
        MyDoubleNode mdn = new MyDoubleNode ();
        mdn.addFirst (3);
        mdn.addFirst (1);
        mdn.addFirst (5);
        mdn.addLast (9);
        // mdn.addAfter (mdn.getHead(), 10);
        mdn.print();
        // System.out.println (mdn.size());
        // System.out.println (mdn.removeFirst());
        // System.out.println (mdn.removeLast());
        // System.out.println (mdn.size());
        System.out.println(mdn.removeAfter (mdn.getHead()));
        mdn.print();
    }
}