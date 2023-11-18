import java.util.ArrayList;
public class Test {
    public static void main (String [] args) {
        // AdjacencyMatrix am = new AdjacencyMatrix(7);
        // am.setEgde(1,2,1);
        // am.setEgde(1,3,1);
        // // am.setEgde(2,1,1);
        // am.setEgde(2,3,1);
        // am.setEgde(2,4,1);
        // // am.setEgde(3,1,1);
        // // am.setEgde(3,2,1);
        // am.setEgde(3,5,1);
        // // am.setEgde(4,2,1);
        // am.setEgde(4,5,1);
        // // am.setEgde(5,3,1);
        // am.setEgde(5,4,1);
        // am.setEgde(5,6,1);
        // // am.setEgde(6,5,1);
        // am.setEgde(6,7,1);
        // am.setEgde(7,6,1);
        AdjacencyMatrix am = new AdjacencyMatrix();
        am.readDataFromFile("Text.txt");
        am.printGraph();
        AdjacencyList al = am.covertToAL();
        al.printGraph();
        am.DFS(0);
        System.out.println();
        am.DFS_Stack(0);
        System.out.println();
        System.out.println(am.isReachable(0,6));
        System.out.println(am.countVertices());
        // am.isReachable(0,6);
        //System.out.println("Number of edge is: " + am.countEgde());
        //ArrayList<Integer> enumerateNeighborsVertex = am.enumerateNeighborsVertex(2);
        //System.out.print ("Neighbors of a vertex 2 is: ");
        //for (int ele : enumerateNeighborsVertex)
        //    System.out.print(ele + " ");
        //System.out.println();
        //System.out.println("Existence 1 and 2 is: " + am.checkExistenceOfEdge(1,2));
        //System.out.println("Existence 1 and 5 is: " + am.checkExistenceOfEdge(1,5));
    }
}