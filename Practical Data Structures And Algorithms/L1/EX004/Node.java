public class Node  {
    private double element;
    private Node next;

    public Node () {}
    public Node (double data) {
        this.element = data;
        this.next = null;
    }
    public Node (double data, Node next) {
        this.element = data;
        this.next = next;
    }
    public double getData () {
        return this.element;
    }
    public Node getNext () {
        return this.next;
    }
    public void setNext (Node curr) {
        this.next = curr;
    }
    public String toString () {
        return element+"";
    }
}