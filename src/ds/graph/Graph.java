package ds.graph;

import java.util.ArrayList;

public class Graph {
    int vertex;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    ArrayList<Boolean> vis = new ArrayList<Boolean>(100);

    public Graph(int vertex){
        for(int i = 0; i < vertex; i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < vertex; i++) {
            vis.set(i, false);
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

    ArrayList<Integer> comps = new ArrayList<>();
    void dfs(int i){
        vis.set(i, true);
        comps.add(i);

        for(int j = 0; i < adj.get(i).size(); j++){
            if(vis.get(i) == false){
                dfs(j);
            }
        }
    }

    int numberOfConnectedComponents(){
        int count = 0;
        for(int i = 0; i < vis.size(); i++){
            vis.set(i, false);
        }
        for(int i = 0; i < vertex; i++){
            if(vis.get(i) == false){
                count++;
                comps.clear();
                dfs(i);
                System.out.print("Component : ");
                for(int j = 0; j < comps.size(); j++){
                    System.out.print(" " + comps.get(i));
                }
                System.out.println();
            }
        }
        return count;
    }
}
