import java.util.*;
import java.io.*;
public class EdgeList {
    private Vector <IntegerTriple> edges;
    public EdgeList () {
        edges = new Vector<IntegerTriple>();
    }
    public EdgeList (String fileName) {
        edges = new Vector<IntegerTriple>();
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            Scanner sc = new Scanner(fileInputStream);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String [] splitString = line.split(" ");
                addEdge(Integer.valueOf(splitString[0]),Integer.valueOf(splitString[1]),Integer.valueOf(splitString[2]));
            }
        } catch (FileNotFoundException e) {
            System.out.println ("The path file is not correct");
        }
    }
    public void addEdge (int w, int s, int d) {
        edges.add(new IntegerTriple(w,s,d));
    }
    public void printGraph () {
        for (IntegerTriple it : edges)
            System.out.println(it);
    }
    public int countVertices () {
        ArrayList<Integer> listVertices = new ArrayList<>();
        for (IntegerTriple it : edges){
            if (!listVertices.contains(it.getS()))
                listVertices.add(it.getS());
            if (!listVertices.contains(it.getD()))
                listVertices.add(it.getD());
        }
        return listVertices.size();
    }
    public int countEdges () {
        return edges.size();
    }
    public ArrayList<Integer> emurateNeighborsOfAVertexU (int u) {
        ArrayList<Integer> listNeighbors = new ArrayList<>();
        for (IntegerTriple it : edges){
            if (it.getS() == u)
                listNeighbors.add(it.getD());
        }
        return listNeighbors;
    }
    public boolean existenceOfEdge (int u, int v) {
        for (IntegerTriple it : edges){
            if ((it.getS() == u && it.getD() == v) || (it.getD() == u && it.getS() == v))
                return true;
        }
        return false;
    }
}