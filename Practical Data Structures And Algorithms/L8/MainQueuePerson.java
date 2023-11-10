public class MainQueuePerson {
    public static void main (String [] args) {
        
        QueuePerson qp = new QueuePerson(20);
        Person p1 = new Person ("Alex", 3);
        Person p2 = new Person ("Bob", 2);
        Person p3 = new Person ("David", 6);
        Person p4 = new Person ("Susan", 1);
        qp.insert(p1);
        qp.insert(p2);
        qp.insert(p3);
        qp.insert(p4);
        System.out.println (qp.extractMax());
        
        Person p5 = new Person ("Mike", 5);
        Person p6 = new Person ("Kevin", 4);
        qp.insert(p5);
        qp.insert(p6);
        System.out.println (qp.extractMax());
        System.out.println (qp.extractMax());

        Person p7 = new Person ("Helen", 0);
        Person p8 = new Person ("Paul", 8);
        Person p9 = new Person ("Iris", 7);
        qp.insert(p7);
        qp.insert(p8);
        qp.insert(p9);
        System.out.println (qp.extractMax());
    }
}