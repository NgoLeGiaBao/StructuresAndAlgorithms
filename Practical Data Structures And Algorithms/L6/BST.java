import java.util.LinkedList;
import java.util.Queue;
public class BST {
     Node root;
    // Insert a Node to BST
    private Node insert (Node x, int value) {
        if (x == null) 
            return new Node(value);
        if (x.key < value)
            x.right = insert(x.right, value);
        if (x.key > value)
            x.left = insert(x.left, value);
        if (x.key == value)
            x.key = value;
        return x;
    }
    public void insert (int value){
        root = insert(root, value);
    }
    // Tree traversal
    // Pre-order
    private void NLR (Node x) {
        if (x != null) {
            System.out.print(x.key + " ");
            NLR(x.left);
            NLR (x.right);
        }
    }
    public void NLR () {
        NLR(root);
    } 
    // In-order
    private void LNR (Node x) {
        if (x != null) {
            LNR(x.left);
            System.out.print(x.key + " ");
            LNR(x.right);
        }
    } 
    public void LNR () {
        LNR(root);
    }
    // Post-order
    private void LRN (Node x) {
        if (x != null) {
            LRN(x.left);
            LRN(x.right);
            System.out.print(x.key + " ");
        }
    }
    public void LRN () {
        LRN(root);
    }
    // Tree traversal max key to min key
    private void RNL (Node x) {
        if (x != null) {
            RNL(x.right);
            System.out.print(x.key + " ");
            RNL(x.left);
        }
    }
    public void RNL () {
        RNL(root);
    }
    // Search a key
    private boolean contains (Node x, Integer value) {
        if (x == null) 
            return false;
        if (x.key > value)
            return contains(x.left, value);
        if (x.key < value)
            return contains(x.right, value);
        return true;
    }
    public boolean contains(Integer key) {
        return contains(root, key);
    }   
    // Delete max key in BST
    private Node deleteMax (Node x) {
        if (x.right == null)
            return x.left;
        x.right = deleteMax(x.right);
        return x;
    }
    public void deleteMax(){
        deleteMax(root);
    }
    // Delete a not in BTS used the predecessor instead of the successor
    public Node deleteMin(Node x) {
        if (x.left == null)
            return x.right;
        x.left = deleteMin(x.left);
        return x;
    }
    public Node min (Node x) {
        if (x == null)
            return null;
        if (x.left == null)
            return x;
        return min(x.left);
    }
    public Node max (Node x) {
        if (x == null)
            return null;
        if (x.right == null)
            return x;
        return max(x.right);
    }
    public Node delete (Node x, Integer key){
        if (x == null)
            return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0)
            x.left = delete(x.left, key);
        else if (cmp > 0)
            x.right = delete(x.right, key);
        else {
            if (x.right == null)
                return x.left;
            if (x.left == null)
                return x.right;
            Node t = x;
            x = min(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        }
        return x; 
    }
    private void delete_pre (Node x, Integer value) {
        if (x.key < value)
            delete_pre(x.right, value);
        if (x.key > value)
            delete_pre(x.left, value);
        if (x.key == value){
            if (x.left != null){
                x.key = max(x.left).key;
                x.left = delete(x.left, x.key);
            } else {
                delete(root, x.key);
            }
        }
    }
    public void delete_pre(Integer key) {
        delete_pre(root, key);
    }
    // Heigth of BST
    private int heigth (Node x) {
        if (x == null)
            return -1;
        return Math.max(heigth(x.left), heigth(x.right)) + 1;
    }
    public int heigth () {
        return heigth(root);
    }
    // Sum of subtree in BST
    private int sum (Node x) {
        if (x == null)
            return 0;
        if (x == root)
            return sum(x.left) + sum(x.right);
        return x.key + sum(x.left) + sum(x.right);
    }
    public int sum () {
        return sum(root);
    }
    // Sum even in BST 
    private Integer sumEven (Node x) {
        if (x == null) 
            return 0;
        int result = x.key % 2 == 0 ? x.key : 0;
        return result + sumEven(x.left) + sumEven(x.right);
    }
    public Integer sumEven () {
        return sumEven(root);
    }
    // Count leaves 
    private int countLeaves (Node x) {
        if (x == null)
            return 0;
        if (x.left == null && x.right == null)
            return 1;
        return countLeaves(x.left) + countLeaves(x.right);
    }
    public int countLeaves (){
        return countLeaves(root);
    }
    // Sum even keys at leaves
    private int sumEvenKeysAtLeaves (Node x){
        if (x == null)
            return 0;
        if (x.left == null && x.right == null)
            return x.key % 2 == 0 ? x.key : 0;
        return sumEvenKeysAtLeaves(x.left) + sumEvenKeysAtLeaves(x.right);
    }
    public int sumEvenKeysAtLeaves(){
        return sumEvenKeysAtLeaves(root);
    }
    // Traverse the BST by level order
    private void bfs (Node x) {
        if (root == null)
            return ;
        Queue <Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node curr = queue.poll();
            System.out.print (curr.key + " ");
            if (curr.left != null)
                queue.offer(curr.left);
            if (curr.right != null)
                queue.offer(curr.right);
        }
    }
    public void bfs () {
        bfs(root);
    }
}