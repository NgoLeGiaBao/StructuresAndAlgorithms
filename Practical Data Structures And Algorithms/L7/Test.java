public class Test {
    public static void main (String [] args) {
        AVL avl = new AVL();
        avl.insert(60);
        avl.insert(75);
        avl.insert(29);
        avl.insert(83);
        avl.insert(9);
        avl.insert(5);
        avl.insert(3);        
        avl.insert(15);        
        avl.insert(10);        
        avl.insert(8);        
        avl.insert(2);        
        
        avl.NLR();
        avl.deletePre(8);
        System.out.println();
        avl.NLR();
    }
}