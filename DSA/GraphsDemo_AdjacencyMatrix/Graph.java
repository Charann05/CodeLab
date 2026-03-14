package GraphsDemo_AdjacencyMatrix;

import java.util.ArrayList;

public class Graph {

    int[][] adj;
    ArrayList<Node> nodes;

    Graph(int size){
        nodes = new ArrayList<>();
        adj = new int[size][size];
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public void addEdge(int src, int dest){
        adj[src][dest] = 1;
    }

    public boolean checkEdge(int src, int dest){

        if(adj[src][dest] == 1){
            return true;
        }

        return false;
    }

    public void print(){

        System.out.print("  ");
        for(Node node : nodes){
            System.out.print(node.data + " ");
        }
        
        System.err.println();
        for(int i=0 ; i<adj.length ; i++){
            
            System.out.print(nodes.get(i).data + " ");
            for(int j=0 ; j<adj[i].length ; j++){
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
}
