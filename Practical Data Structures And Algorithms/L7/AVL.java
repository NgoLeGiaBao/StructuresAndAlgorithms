public class AVL {
    Node root;
    public int height (Node x){
        return x == null ? -1 : x.height;
    }
    private int checkBalance (Node x) {
        return height(x.left) - height(x.right);
    }
    private Node insert (Node x, Integer key){
        if (x == null)
            return new Node (key);
        if (key < x.key)
            x.left = insert(x.left, key);
        if (key >= x.key)
            x.right = insert(x.right, key);
        x.height = 1 + Math.max(height(x.left), height(x.right));
        return balance(x);
    }
    public void insert (Integer key){
        root = insert(root,key);
    }
    private Node max (Node x){
        if (x.right == null)
            return x;
        return max(x.right);
    }
    private Node deleteMax (Node x) {
        if (x.right == null)
            return x.left;
        x.right = deleteMax(x.right);
        return x;
    }
    private Node deletePre (Node x, Integer key) {
        if (x == null)
            return null;
        int cmp = key.compareTo(x.key);
        if (cmp > 0){
            x.right = deletePre(x.right, key);
        } else if (cmp < 0){
            x.left = deletePre(x.left, key);
        } else {
            if (x.left == null)
                return x.right;
            if (x.right == null)
                return x.left;
            x.key = max(x.left).key;
            x.left = deleteMax(x.left);
        }
        x.height = 1 + Math.max(height(x.left), height(x.right));
        return balance(x);
    }
    public void deletePre (Integer key) {
        root = deletePre(root, key);
    }
    public Node rotateLeft (Node x){
        Node y = x.right;
        x.right = y.left;
        y.left = x;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }
    public Node rotateRight (Node x) {
        Node y = x.left;
        x.left = y.right;
        y.right = x;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }
    public void rotateLeft (){
        root = rotateLeft(root);
    }
    public void rotateRight(){
        root = rotateRight(root);
    }
    private void NLR (Node x){
        if (x != null){
            System.out.print(x.key + " ");
            NLR(x.left);
            NLR(x.right);
        }
    }
    public void NLR (){
        NLR(root);
    }
    private Node balance(Node x) {
        if (checkBalance(x) < -1){
            if (checkBalance(x.right) > 0) {
                x.right = rotateRight(x.right);
            }
            x = rotateLeft(x);
        } else if (checkBalance(x) > 1){
            if (checkBalance(x.left) < 0){
                x.left = rotateLeft(x.left);
            }
            x = rotateRight(x);
        }
        return x;
    }
}