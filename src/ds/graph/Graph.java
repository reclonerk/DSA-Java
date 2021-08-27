package ds.graph;

import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    public Graph(int vertex){
        for(int i = 0; i < vertex; i++){
            adj.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    void printGraph(){
        for(int i = 0; i < adj.size(); i++){
            System.out.print("vertex " + i + " ");
            for (int j = 0; j < adj.get(i).size(); j++){
                System.out.print( "-> " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }
}
