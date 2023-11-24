import java.util.*;
import java.io.*;
public class EdgeList {
    private Vector <IntegerDouble> edges;
    public EdgeList (String fileName) {
        edges = new Vector<IntegerDouble>();
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            Scanner sc = new Scanner(fileInputStream);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String [] splitString = line.split(" ");
                addEdge(Integer.valueOf(splitString[0]), Integer.valueOf(splitString[1]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("The path is not correct");
        }
    }
    public void addEdge (int s, int d) {
        edges.add(new IntegerDouble(s,d));
    }
    public void printGraph () {
        for (IntegerDouble id : edges) {
            System.out.println(id);
        }
    }
    public int countVertices () {
        ArrayList<Integer> listVertices = new ArrayList<>();
        for (IntegerDouble id : edges) {
            if (!listVertices.contains(id.getS()))
                listVertices.add(id.getS());
            if (!listVertices.contains(id.getD()))
                listVertices.add(id.getD());
        }
        return listVertices.size();
    }
    public int countEdges () {
        return edges.size();
    }
    private AdjacencyList covertToAdjacencyList () {
        AdjacencyList al = new AdjacencyList(countVertices());
        for (IntegerDouble itd : edges) 
            al.add(itd.getS(), itd.getD());
        return al;
    }
    private void BFS (AdjacencyList al ,int i, boolean [] visited) {
        Queue <Integer> queue = new LinkedList<Integer>();
        visited[i] = true;
        queue.add(i);
        while (!queue.isEmpty()) {
            int x = queue.poll();
            for (Integer k : al.getListAtIndex(x)) {
                if (!visited[k]){
                    visited[k] = true;
                    queue.add(k);
                }
            }
        }
    }
    public int countComponentsOfGraph () {
        int count = 0;
        AdjacencyList al = covertToAdjacencyList();
        int valueOf = countVertices();
        boolean [] visited = new boolean [valueOf];
        for (int i = 0; i < valueOf; i++) {
           if (!visited[i]) {
                count++;
                BFS(al, i, visited);
            }
        }
        return count;
    }
    public String findUserHasMostFriend () {
        AdjacencyList al = covertToAdjacencyList();
        if (countVertices() != 0){
            int userID = 0;
            int quantitiveFriend = al.quantitive(0);
            for (int i = 1; i < al.getAdj().size(); i++) {
                if (al.quantitive(i) > quantitiveFriend) {
                    quantitiveFriend = al.quantitive(i);
                    userID = i;
                }
            }
            return "User[ID = "+ userID + ", Quantitive friend = " + quantitiveFriend + "]";
        }
        return "";
    }
    public ArrayList<Integer> mutualFriends (int u, int v) {
        AdjacencyList al = covertToAdjacencyList();
        ArrayList<Integer> friendU = al.getListAtIndex(u);
        ArrayList<Integer> firendV = al.getListAtIndex(v);
        ArrayList<Integer> listMutualFriends = new ArrayList<>();
        for (Integer i : friendU) {
            if (firendV.contains(i))
                listMutualFriends.add(i);
        }
        return listMutualFriends;
    }
}