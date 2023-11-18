import java.util.*;
public class AdjacencyList {
    private int V;
    private ArrayList <LinkedList<Integer>> adj;

    public AdjacencyList (int v) {
        V = v;
        adj = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < V; i++) {
            adj.add(new LinkedList<Integer>());
        }
    }
    public void add (int u, int v) {
        adj.get(u).add(v+1);
    }
    public void printGraph () {
        System.out.println(V);
        for (int i = 0; i < V; i++) {
            System.out.print (i+1 + " ");
            for (int ele : adj.get(i))
                System.out.print (ele + " ");
            System.out.println();
        }
    }
    public int countEdges () {
        int numOfEdges = 0;
        for (int i = 0; i < V; i++) {
            for (int ele : adj.get(i)) {
                numOfEdges++;
            }
        }
        return numOfEdges/2;
    }
    
}