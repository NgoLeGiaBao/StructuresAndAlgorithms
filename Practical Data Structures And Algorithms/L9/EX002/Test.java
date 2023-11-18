public class Test {
    public static void main (String [] args) {
        AdjacencyList al = new AdjacencyList("Text.txt");

        al.printGraph();
        System.out.println("Vertices of graph is: " + al.countVertices());
        System.out.println("Edges of graph is: " + al.countEdges());
        System.out.print ("Emurate of vertex 1 is: ");
        for (int i : al.emurateNeighborsOfAVertexU(1)) {
            System.out.print (i + " ");
        }
        System.out.println();
        System.out.println("Vertex 5 contains value 1 is: " + al.existenceOfEdge(5,1));
        System.out.println("Vertex 5 contains value 4 is: " + al.existenceOfEdge(5,4));
        System.out.println("Vertex 5 contains value 6 is: " + al.existenceOfEdge(5,6));

    }
}