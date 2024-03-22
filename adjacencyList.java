import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class adjacencyList {
    private List<List<Integer>> AdjacencyList; //The outer list holds the adjacency lists for each vertex, and each inner list contains the neighbors of a particular vertex.
    private int numvertices;

    public adjacencyList(int numvertices){
        this.numvertices=numvertices;
        AdjacencyList=new ArrayList<>(numvertices);
        // this loop ensures that there is an empty list for each vertex in the graph.
        for (int i = 0; i < numvertices; i++) {
            AdjacencyList.add(new ArrayList<>()); //Each inner list represents the adjacency list for a particular vertex in the graph.
        }
    }
    public void addEdge(int source, int destination) {
        AdjacencyList.get(source).add(destination);
        // adjacencyList.get(destination).add(source); //undirected
    }

    public void printAdjacencyList() {
//        It iterates over each vertex in the graph.
//        For each vertex, it prints the vertex index followed by its adjacent vertices.
//        The inner loop iterates over the adjacency list of the current vertex and prints each neighbor.
//        Finally, a newline is printed to separate the adjacency lists of different vertices.
        for (int i = 0; i < numvertices; i++) {
            System.out.print("Adjacency list of vertex " + i + ": ");
            for (int vertex : AdjacencyList.get(i)) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        adjacencyList graph = new adjacencyList(5); // Example: Create a graph with 5 vertices
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 1);
        graph.addEdge(3, 5);

        graph.printAdjacencyList();
    }
}


//Graph class:
//Properties:
//adjacencyList: List of lists to represent the graph's adjacency list
//numVertices: Number of vertices in the graph
//
//Constructor:
//Initialize adjacencyList as a list of numVertices empty lists
//Set numVertices
//
//addEdge(source, destination) method:
//Add destination to the list at index source in adjacencyList
//// If the graph is undirected, you may want to uncomment the line below:
//// Add source to the list at index destination in adjacencyList
//
//printAdjacencyList() method:
//For each vertex i from 0 to numVertices-1:
//Print "Adjacency list of vertex i:"
//For each element in the list at index i in adjacencyList:
//Print the element followed by space
//Print newline
//
//Main function:
//Create a new Graph instance with desired number of vertices
//Add edges to the graph using addEdge method
//Print the adjacency lists using printAdjacencyList method
