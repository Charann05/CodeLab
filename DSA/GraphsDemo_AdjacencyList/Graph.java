// Graph implementation using an adjacency list (ArrayList of LinkedLists) for a directed graph

package GraphsDemo_AdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    
    ArrayList<LinkedList<Node>> al;

    Graph(){
        al = new ArrayList<>();
    }
    
    public void addNode(Node node){
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        al.add(currentList);

    }

    public void addEdge(int src, int dest){
        LinkedList<Node> currentList = al.get(src);
        Node destList = al.get(dest).get(0);

        currentList.add(destList);
    }

    public boolean checkEdge(int src, int dest){
        LinkedList<Node> currentList = al.get(src);
        Node destList = al.get(dest).get(0); 
        
        for(Node node : currentList){
            if(node == destList){
                return true;
            }
        }
        return false;
    }

    public void print(){
        for(LinkedList<Node> currentList : al){
            for(Node node : currentList){
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }
}
