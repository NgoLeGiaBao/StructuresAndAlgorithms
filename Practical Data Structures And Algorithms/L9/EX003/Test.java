public class Test {
    public static void main (String [] args) {
        EdgeList el = new EdgeList("Text.txt");

        el.printGraph();
        System.out.println ("Number vertices of graph is: " + el.countVertices());
        System.out.println ("Number edges of graph is: " + el.countEdges());
        System.out.print ("Emurate of vertex 0 is: ");
        for (int i : el.emurateNeighborsOfAVertexU(0)) {
            System.out.print (i + " ");
        }
        System.out.println();
        System.out.println("Vertex 1 contains value 2 is: " + el.existenceOfEdge(1,2));
        System.out.println("Vertex 1 contains value 3 is: " + el.existenceOfEdge(1,3));
        System.out.println("Vertex 1 contains value 4 is: " + el.existenceOfEdge(1,4));
    }
}