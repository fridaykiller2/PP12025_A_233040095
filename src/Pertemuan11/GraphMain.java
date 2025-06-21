package Pertemuan11;

public class GraphMain {
    public static void main(String[] args) {
        
        // soal 5
        // graph.addVertex('A'); // Add vertex A0
        // graph.addVertex('B'); // Add vertex B1
        // graph.addVertex('C'); // Add vertex C2
        // graph.addVertex('D'); // Add vertex D3
        // graph.addVertex('E'); // Add vertex E4

        // graph.addEdge(0, 1); 
        // graph.addEdge(1, 2); 
        // graph.addEdge(0, 3); 
        // graph.addEdge(3, 4); 
        
        Graph graph = new Graph(4); 
        
        //soal 6
        graph.addVertex('A'); // Add vertex A0
        graph.addVertex('B'); // Add vertex B1
        graph.addVertex('C'); // Add vertex C2
        graph.addVertex('D'); // Add vertex D3
        
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 3);
        
        System.out.println("Adjacency Matrix:");
        graph.adjacencyMatrix(); // Display adjacency matrix
        


    }
}