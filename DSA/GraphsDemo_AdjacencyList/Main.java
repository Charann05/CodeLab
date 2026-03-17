package GraphsDemo_AdjacencyList;

public class Main {
    public static void main(String[] args) {
        
        Graph graph = new Graph();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(2, 1);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        graph.addEdge(0, 4);
        graph.addEdge(3, 1);

        graph.print();
        System.out.println();
        System.out.println(graph.checkEdge(2, 1));
        System.out.println(graph.checkEdge(2, 3));
    }
}
