package Pertemuan11;

public class Graph {
    private Vertex vertexList[]; // Array of vertices
    private int adjMat[] []; // Adjacency matrix
    private int nVerts; // Current number of vertices

    public Graph(int maxVerts) {
        vertexList = new Vertex[maxVerts]; // Initialize vertex list
        adjMat = new int[maxVerts][maxVerts]; // Initialize adjacency matrix
        nVerts = 0; // Start with no vertices

    for (int i = 0; i < maxVerts; i++) {
            for (int j = 0; j < maxVerts; j++) {
                adjMat[i][j] = 0; // Initialize adjacency matrix to 0
            }
        }
    }

    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertex(lab); // Add a new vertex
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1; 
        adjMat[end][start] = 1; 
    }

    public void adjacencyMatrix() {
        for (int i = 0; i < adjMat.length; i++) {
            for (int j = 0; j < adjMat[0].length; j++) {
                System.out.print(adjMat[i][j] + " "); // Print adjacency matrix
            }
            System.out.println();
        }
    }

}