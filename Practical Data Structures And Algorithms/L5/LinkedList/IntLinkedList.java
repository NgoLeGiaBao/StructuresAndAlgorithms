public class IntLinkedList {
    public Node head;
    public void print () {
        if (head != null){
            System.out.print (head.data);
            Node curr = head.next;
            while (curr != null) {
                System.out.print ("->" + curr.data);
                curr = curr.next;
            }
            System.out.println();
        }
    }
    public void addFirst (int data) {
        head = new Node (data, head);
    }
    public void addLast (int data) {
        if (head == null) {
            addFirst(data);
        } else {
            Node curr = head;
            while (curr.next != null)
                curr = curr.next;
            curr.next = new Node (data, null);
        }
    }
    public boolean removeAt (int position) {
        if (head == null)
            return false;
        if (position == 1){
            head = head.next;
            return true;
        }
        int i = 1;
        Node prev = head;
        Node curr = prev.next;
        while (curr != null) {
            i++;
            if (i == position){
                prev.next = curr.next;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }
    public int searchKey (int key) {
        int position = 1;
        Node curr = head;
        while (curr != null) {
            if (curr.data == key)
                return position;
            position++;
            curr = curr.next;
        }
        return -1;
    }
    public boolean checkSorted () {
        if (head == null)
            return false;
        Node prev = head;
        Node curr = head.next;
        while (curr != null && prev.data == curr.data) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == null)
            return true;
        if (curr.data < prev.data) {
            while (curr != null && prev.data >= curr.data ) {
                prev = curr;
                curr = curr.next;
            }
            return curr == null ? true : false;
        }
        if (curr.data > prev.data) {
            while (curr != null && prev.data <= curr.data ) {
                prev = curr;
                curr = curr.next;
            }
            return curr == null ? true : false;
        }
        return false;
    }
    public int countOdd () {
        int count = 0;
        Node curr = head;
        while (curr != null){
            if (curr.data % 2 != 0)
                count++;
            curr = curr.next;
        }
        return count;
    }
}