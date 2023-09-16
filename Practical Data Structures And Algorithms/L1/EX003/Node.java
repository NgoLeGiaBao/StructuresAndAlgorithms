public class Node  {
    private Integer element;
    private Node next;

    public Node () {}
    public Node (Integer data) {
        this.element = data;
        this.next = null;
    }
    public Node (Integer data, Node next) {
        this.element = data;
        this.next = next;
    }
    public Integer getData () {
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