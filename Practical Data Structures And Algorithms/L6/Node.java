public class Node {
    int key;
    Node left;
    Node right;

    public Node (int key) {
        this.key = key;
        this.left = this.right = null;
    }
    public Node (int key, Node left, Node right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }
}