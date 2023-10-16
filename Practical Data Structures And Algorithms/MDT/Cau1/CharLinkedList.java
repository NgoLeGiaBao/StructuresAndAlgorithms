public class CharLinkedList implements ListInterface {
    public CharLinkedList (){}
    private Node head;
    private void printAuxiliray (Node head) {
        if (head != null){
            System.out.print(head.getData() + ",");
            printAuxiliray(head.getNext());
        }
    }
    public void print() {
        printAuxiliray(head);
    }
    public Node getHead() {
        return head;
    }
	public void addFirst(char data) {
        head = new Node(data, head);
    }
	public boolean addAfterFirstKey(char data, char key) {
        if (head == null)
            return false;
        Node tmp = head;
        while (tmp != null){
            if (tmp.getData() == key) {
                tmp.setNext(new Node(data, tmp.getNext()));
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }
	public int largestCharPostition() {
        if (head == null)
            return -1;
        int index = 0;
        int positionLargest = 0;
        char charLargest = head.getData();
        Node tmp = head.getNext();
        while (tmp != null){
            index++;
            if (tmp.getData() > charLargest) {
                charLargest = tmp.getData();
                positionLargest = index;
            }
            tmp = tmp.getNext();
        }
        return positionLargest;
    }
}