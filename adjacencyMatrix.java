public class adjacencyMatrix {
   private int[][] AdjacencyMatrix; //2d array to check both column and rows
   private int numvertices;

    public adjacencyMatrix(int numvertices) { //will take number of vertices as the argument
        this.numvertices = numvertices;
        AdjacencyMatrix=new int[numvertices][numvertices];

    }

    public void addEdge(int i,int j){
        AdjacencyMatrix[i][j]=1;
//        AdjacencyMatrix[j][i]=1; //if its undirected graph then this will exist
    }

    //print the output of the 2d arry
    public void printAdjacencyMatrix(){
        for(int i=0;i<numvertices;i++){ //first we have to consider rows
            for(int j=0;j<numvertices;j++){ //iterate through columns
                System.out.print(AdjacencyMatrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        adjacencyMatrix aMatrix=new adjacencyMatrix(8);
        aMatrix.addEdge(0,1);
        aMatrix.addEdge(1,2);
        aMatrix.addEdge(1,3);
        aMatrix.addEdge(1,4);
        aMatrix.addEdge(2,5);
        aMatrix.addEdge(3,1);
        aMatrix.addEdge(3,5);
        aMatrix.addEdge(3,6);
        aMatrix.addEdge(4,6);
        aMatrix.addEdge(5,7);
        aMatrix.addEdge(6,3);
        aMatrix.addEdge(6,5);
        aMatrix.addEdge(6,7);
        aMatrix.printAdjacencyMatrix();//calling the function to print the output
    }
}