import java.util.*;
import java.io.*;
public class AdjacencyMatrix {
    private int [][] adj;
    private int NUMBER_OF_VERTICES;
    
    public AdjacencyMatrix (){}
    public AdjacencyMatrix (int vertices) {
        NUMBER_OF_VERTICES = vertices;
        adj = new int [NUMBER_OF_VERTICES][NUMBER_OF_VERTICES];
    }
    public void readDataFromFile (String fileName) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            Scanner sc = new Scanner(fileInputStream);
            int k = 1;
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    if (line.length() == 1) {
                        int parese = Integer.valueOf(line);
                        NUMBER_OF_VERTICES = parese;
                        adj = new int [NUMBER_OF_VERTICES][NUMBER_OF_VERTICES];
                    } else {
                        String [] splitString = line.split(" ");
                        for (int i = 1; i <= splitString.length; i++) {
                            setEgde(k,i, Integer.valueOf(splitString[i-1]));
                        }
                        k++;
                    }
                }
        } catch (FileNotFoundException e) {
            System.out.println ("The path file is not correct");
        }
    }
    public void setEgde (int verticesSource, int verticesDestionation, int weight) {
        try {
            adj[verticesSource-1][verticesDestionation-1] = weight;
            adj[verticesDestionation-1][verticesSource-1] = weight;
        } catch (ArrayIndexOutOfBoundsException indexBounce){
            System.out.println("The vertex is invalid");
        }
    }
    public int getEgde (int verticesSource, int verticesDestionation, int weight) {
        try {
            return adj[verticesSource-1][verticesDestionation-1];
        } catch (ArrayIndexOutOfBoundsException indexBounce) {
            System.out.println("The vertex is invalid");
        }
        return -1;
    }
    public void printGraph () {
        System.out.println(NUMBER_OF_VERTICES);
        for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
            for (int j = 0; j < NUMBER_OF_VERTICES; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
    public int countVertices () {
        return adj.length;
    }
    public int countEgde () {
        int count = 0;
        for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
            for (int j = 0; j < NUMBER_OF_VERTICES; j++) {
                if (adj[i][j] != 0)
                    count++;
            }
        }
        return count/2;
    }
    public ArrayList<Integer> enumerateNeighborsVertex (int u) {
        ArrayList<Integer> listNeighbors = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
            if (adj[u-1][i] != 0)
                listNeighbors.add(i+1);
        }
        return listNeighbors; 
    }
    public boolean checkExistenceOfEdge (int u, int v) {
        try {
            return adj[u-1][v-1] != 0 ? true : false;
        } catch (ArrayIndexOutOfBoundsException indexBounce) {
            System.out.println("The vertex is invalid");
            return false;
        }
    }
    public AdjacencyList covertToAL () {
        AdjacencyList adjacencyList = new AdjacencyList(adj.length);
        for (int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj.length; j++) {
                if (adj[i][j] != 0) {
                    adjacencyList.add(i, j);
                }
            }
        }
        return adjacencyList;
    }
    public void BFS (int s) {
        boolean [] visited = new boolean [NUMBER_OF_VERTICES];
        visited[s] = true;
        Queue <Integer> queue = new LinkedList<Integer>();
        queue.add(s);
        while(!queue.isEmpty()) {
            int x = queue.poll();
            System.out.print (x + " ");
            for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
                if (adj[x][i] != 0 && !visited[i]){ 
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        } 
    }
    private void DFS_Rec (int v, boolean [] visited) {
        visited[v] = true;
        System.out.print (v + " ");
        for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
            if (!visited[i] && adj[v][i] != 0) 
                DFS_Rec(i, visited);
        }
    }
    public void DFS (int v) {
        boolean [] visited = new boolean [NUMBER_OF_VERTICES];
        DFS_Rec(v, visited);
    }
    public void DFS_Stack (int v) {
        boolean [] visited = new boolean [NUMBER_OF_VERTICES];
        Stack<Integer> stack = new Stack<>();
        visited[v] = true;
        stack.push(v);
        System.out.print(v + " ");
        while (!stack.isEmpty()) {
            int x = stack.pop();
            for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
                if (adj[x][i]!=0 && !visited[i]) {
                    System.out.print (i + " ");
                    visited[i] = true;
                    stack.push(i);
                }
            }
        }
    }
    public boolean isReachable (int u, int v) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean [] visited = new boolean [NUMBER_OF_VERTICES];
        Stack<Integer> stack = new Stack<>();
        visited[u] = true;
        list.add(u);
        stack.push(u);
        while (!stack.isEmpty()) {
            int x = stack.pop();
            for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
                if (adj[x][i]!=0 && !visited[i]) {
                    visited[i] = true;
                    list.add(i);
                    stack.push(i);
                }
            }
        }
        return list.contains(v) ? true : false;
    }
}