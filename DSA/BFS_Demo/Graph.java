package DFS_Demo;

import java.util.ArrayList;

public class Graph{

    int[][] matrix;
    ArrayList<Node> al;

    Graph(int size){
        matrix = new int[size][size];
        al = new ArrayList<>();
    }

    public void addNode(Node node){
        al.add(node);
    }

    public void addEdge(int src, int dest){
        matrix[src][dest] = 1;
    }

    public boolean checkEdge(int src, int dest){
        if(matrix[src][dest] == 1)  return true;

        return false;
    }

    public void print(){
        System.out.print("  ");

        for(Node node : al){
            System.out.print(node.data + " ");
        }
        System.out.println();

        for(int i=0 ; i<matrix.length ; i++){
            System.out.print(al.get(i).data + " ");

            for(int j=0 ; j<matrix[i].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void depthFirstSearch(int src){
        
        System.out.println();
        boolean[] visited = new boolean[matrix.length];

        dfsHelper(src, visited);
    }

    public void dfsHelper(int src, boolean[] visited){
        if(visited[src]){
            return;
        }
        else{
            visited[src] = true;
            System.out.println(al.get(src).data + " visited");
        }

        for(int i=0 ; i<matrix[src].length ; i++){
            if(matrix[src][i] == 1){
                dfsHelper(i, visited);
            }
        }
        return;
    }
}