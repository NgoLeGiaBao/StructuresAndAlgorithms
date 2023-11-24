import java.util.*;
import java.io.*;
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
    public ArrayList <LinkedList<Integer>> getAdj () {
        return this.adj;
    }
    public ArrayList<Integer> getListAtIndex (int index) {
        ArrayList<Integer> listID = new ArrayList<>();
        for (Integer i : this.adj.get(index)){
            listID.add(i);
        }
        return listID;
    }
    public AdjacencyList (String fileName) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            Scanner sc = new Scanner(fileInputStream);
            int k = 0;
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    if (line.length() == 1) {
                        int parese = Integer.valueOf(line);
                        V = parese;
                        adj = new ArrayList<LinkedList<Integer>>();
                        for (int i = 0; i < V; i++) {
                            adj.add(new LinkedList<Integer>());
                        }
                    } else {
                        String [] splitString = line.split(" ");
                        for (int i = 1; i < splitString.length; i++) {
                            add(k, Integer.valueOf(splitString[i]));
                        }
                        k++;
                    }
                }
        } catch (FileNotFoundException e) {
            System.out.println ("The path file is not correct");
        }
    } 
    public void add (int u, int v) {
        adj.get(u).add(v);
    }
    public int quantitive (int u) {
        return adj.get(u).size();
    }
    public void printGraph () {
        System.out.println(V);
        for (int i = 0; i < V; i++) {
            System.out.print (i + " ");
            for (int ele : adj.get(i))
                System.out.print (ele + " ");
            System.out.println();
        }
    }
    public int countVertices () {
        return adj.size();
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
    public ArrayList<Integer> emurateNeighborsOfAVertexU (int u) {
        ArrayList<Integer> listNeighbors = new ArrayList<>();
        for (int i : adj.get(u))
            listNeighbors.add(i);
        return listNeighbors;
    }
    public boolean existenceOfEdge (int u, int v) {
        return adj.get(u).contains(v);
    }
}