public class DoubleNode {
    private double data;
    private DoubleNode prev;
    private DoubleNode next;

    public DoubleNode (){}
    public DoubleNode (double data) {
        this.prev = null;
        this.next = null;
        this.data = data;
    }
    public DoubleNode (DoubleNode next, double data) {
        this.prev = null;
        this.next = next;
        this.data = data;
    }
    public DoubleNode (DoubleNode prev, DoubleNode next, double data){
        this.prev = prev;
        this.next = next;
        this.data = data;
    }
    public double getData () {
        return this.data;
    }
    public void setPrev (DoubleNode prev) {
        this.prev = prev;
    }
    public void setNext (DoubleNode next) {
        this.next = next;
    }
    public DoubleNode getPrev () {
        return this.prev;
    }
    public DoubleNode getNext () {
        return this.next;
    }
}