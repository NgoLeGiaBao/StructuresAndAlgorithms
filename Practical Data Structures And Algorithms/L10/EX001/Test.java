public class Test {
    public static void main (String [] args) {
        EdgeList el = new EdgeList("facebook_combined.txt");    
        System.out.println("A number of edges are: " + el.countEdges());
        System.out.println("A number of vertices are: " + el.countVertices());
        System.out.println(el.findUserHasMostFriend());
        System.out.print("List mutual friends between 0 and 1 is: ");
        for (Integer i : el.mutualFriends(0,1)) {
            System.out.print (i + " ");
        }
        System.out.println();
        System.out.println("Count the components of graph: " + el.countComponentsOfGraph()); 
    }
}