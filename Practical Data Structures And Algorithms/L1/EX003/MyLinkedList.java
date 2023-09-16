import java.util.NoSuchElementException;
public class MyLinkedList implements ListInterface {
    private Node head;
    private int numberNode;
    public MyLinkedList() {
        this.head = null;
        this.numberNode = 0;
    }
    public static boolean checkPrimeNumber (int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public void addFirst(Integer item) {
        if (head == null) {
            head = new Node (item);
        } else {
            head = new Node (item, head);
        }
        numberNode++;
    }
    public void addAfter(Node curr, Integer item) {
        if (curr == null) {
            addFirst(item);
        } else {
            Node tmp = head;
            while (tmp != null) {
                if (tmp == curr) {
                    tmp.setNext(new Node (item, tmp.getNext()));
                    numberNode++;
                    return ;
                }
                tmp = tmp.getNext();
            }
        }
    }
    public void addLast(Integer item) {
        Node tmp = head;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        Node newNode = new Node (item, null);
        tmp.setNext(newNode);
        numberNode++;
    }
    public Integer removeFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException ("Can't remove element from an empty list");
        } else {
            Node tmp = head;
            head = head.getNext();
            numberNode--;
            return tmp.getData();
        }
    }
    public Integer removeAfter(Node curr) throws NoSuchElementException{
        if (head == null) {
            throw new NoSuchElementException ("Can't remove element from an empty list");
        } else {
            Node tmp = head;
            while (tmp.getNext()!=null) {
                if (tmp == curr) {
                    Node del = tmp.getNext();
                    tmp.setNext(curr.getNext().getNext());
                    numberNode--;
                    return del.getData();
                }
                tmp = tmp.getNext();
            }
            throw new NoSuchElementException ("Can't remove element from an empty list");
        }
    }
    public Integer reomveLast() throws NoSuchElementException{
        if (head == null) {
            throw new NoSuchElementException("Can't remove element from an empty list");
        } else {
            Node tmp = head;
            Node prev = null;
            while (tmp.getNext()!=null) {
                prev = tmp;
                tmp = tmp.getNext();
            }
            prev.setNext(null);
            numberNode--;
            return tmp.getData();
        }
    }
    public int size() {
        return this.numberNode;
    }
    public boolean contains(Integer item) {
        Node tmp = head;
        while (tmp !=null) {
            if (tmp.getData() == item) {
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }
    public void print(){
        Node tmp = head;
        if (tmp == null) {
            System.out.println ("List is null");
        } else {
            System.out.print ("List: " + tmp.getData());
            tmp = tmp.getNext();
            while (tmp != null) {
                System.out.print (" -> "+ tmp);
                tmp = tmp.getNext();
            }
            System.out.println();
        }
    }
    public boolean isEmpty() {
        return this.size()==0?true:false;
    }
    public Node getHead() {
        return this.head;
    }
    public Node getLastNode () throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException ("Can't get last element from empty list");
        } else {
            Node tmp = head;
            while (tmp.getNext()!=null) {
                tmp = tmp.getNext();
            }
            return tmp;
        }
    
    }
    public Integer getFirst() throws NoSuchElementException {
        if (head == null){
            throw new NoSuchElementException("Can't remove element from an empty list");
        } else {
            return head.getData();
        }
    }
    public int countEvenItemInList () {
        int numEven = 0;
        Node tmp = head; 
        while (tmp != null) {
            if (tmp.getData() % 2 == 0) {
                numEven++;
            }
            tmp = tmp.getNext();
        }
        return numEven;
    }
    public int countPrimeItemInList () {
        int numPrime = 0;
        Node tmp = head; 
        while (tmp != null) {
            if (checkPrimeNumber(tmp.getData())) {
                numPrime++;
            }
            tmp = tmp.getNext();
        }
        return numPrime;
    }
    public void addItemXBeforeFirstEvenElement (Integer item) throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException ("Can't add element into empty list");
        } else {
            Node tmp = head;
            Node prev = null;
            while (tmp != null) {
                if (tmp.getData() % 2 == 0) {
                    prev.setNext(new Node (item, tmp));
                    return ;
                }
                prev = tmp;
                tmp = tmp.getNext(); 
            }
            throw new NoSuchElementException ("There are no elements containing even number");
        }
    }
    public int findMaximunNumber () throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException ("Can't find max value from an empty list");
        } else {
            int maxValue = head.getData();
            Node currNode = head.getNext();
            while (currNode != null) {
                if (currNode.getData() > maxValue) {
                    maxValue = currNode.getData();
                }
                currNode = currNode.getNext();
            }
            return maxValue;
        }
    }
    public int findMinimunNumber () throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException ("Can't find min value from an empty list");
        } else {
            int minValue = head.getData();
            Node currNode = head.getNext();
            while (currNode != null) {
                if (currNode.getData()<minValue) {
                    minValue = currNode.getData();
                }
                currNode = currNode.getNext();
            }
            return minValue;
        }
    }
    public void reverseList () throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException ("Can't reverse from empty list");
        } else {
            Node nextHead = null;
            Node lastNode = head;
            while (lastNode.getNext()!= null) {
                lastNode = lastNode.getNext();
            }
            nextHead = lastNode;
            for (int i = 0; i < numberNode - 1; i++) {
                Node tmp = head;
                Node prev = null;
                while (tmp.getNext()!=null) {
                    prev = tmp;
                    tmp = tmp.getNext();
                }
                lastNode.setNext(prev);
                prev.setNext(null);
                lastNode = lastNode.getNext();
            }
            head = nextHead;
        }
    }
    public Node findNodeWithMinValue (){
            Node currNode = head;
            Node nodeMin = head;
            int minValue = head.getData();
            while (currNode != null) {
                if (currNode.getData() < minValue) {
                    minValue = currNode.getData();
                    nodeMin = currNode;
                }
                currNode = currNode.getNext();
            }
            return nodeMin;
    }
    public void sortListAscending () throws NoSuchElementException{
        if (head == null) {
            throw new NoSuchElementException ("Can't sort list ascending from empty list");
        } else {
            // Lấy ra được head ban đầu
            Node initialHead = head;
            // Tìm ra Node với giá trị nhỏ nhất và gán head với node có giái trị nhỏ nhất thông qua hàm findNodeWithMinValue() 
            head = findNodeWithMinValue();
            // Gán tmp bằng head mới
            Node tmp = head;
            // Đi hết vòng lặp để lấy ra được phần tử cuối cùng trong linkedlist
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            // setNext() cho node cuối cùng với node head ban đầu
            tmp.setNext(initialHead);
            
            // Tìm ra node cuối của head ban đầu và set nó với giá trị null
            Node tmpSetNull = head.getNext();
            while (tmpSetNull != null) {
                if (tmpSetNull.getNext() == head) {
                    tmpSetNull.setNext (null);
                    break;
                }
                tmpSetNull = tmpSetNull.getNext();
            }
            // Sử dụng thuật toán bubble sort để giả quyết bài toán
            for (int i = 0; i < numberNode - 1; i++) {
                Node prev = head;
                Node now = head.getNext();
                Node next = now.getNext();
                while (now.getNext()!=null) {
                    if (now.getData()>next.getData()) {
                        prev.setNext(next);
                        Node setNextNode = now;
                        Node setNow = next.getNext();
                        next.setNext(setNextNode);
                        now.setNext(setNow);
                        
                        // Hoán đổi node now và next khi ta set lại node nó sẽ thay đổi
                        Node swap = now;
                        now = next;
                        next = swap;
                    }
                    prev = prev.getNext();
                    now = now.getNext();
                    next = next.getNext();
                }
            }

        }

    }
}
