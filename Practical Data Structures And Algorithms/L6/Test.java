public class Test {
    public static BST createTree (String s) {
        BST bst = new BST();
        String [] sNumber = s.split(",");
        for (String ch : sNumber) {
            bst.insert(Integer.parseInt(ch.trim()));
        }
        return bst;
    }   
    public static void printDescending (String s) {
        createTree(s).RNL() ;
    }
    public static void main (String [] args) {
        BST bst = new BST();
        // System.out.println (bts.contains(4));
        bst.insert(8);
        bst.insert(3);
        bst.insert(4);
        bst.insert(7);
        // bst.insert(6);
        bst.insert(15);
        bst.insert(9);
        bst.insert(16);
        bst.insert(1);
        // bst.NLR();
        bst.LNR();
        // bst.LRN();
        // printDescending("8,3,1,4,7,6,15,9,16,1");
        // System.out.println (bts.contains(4));
        // System.out.println (bts.contains(20));
        // bst.deleteMax();
        bst.delete_pre(3);
        // bst.bfs();
        System.out.println();
        System.out.println(bst.root.key);
        // System.out.println(bst.heigth());
        // System.out.println(bst.sumEven());
        // System.out.println(bst.countLeaves());
        // System.out.println(bst.sum());
        // System.out.println(bst.sumEvenKeysAtLeaves());
        // bst.LNR();
        bst.LNR();

    }
}