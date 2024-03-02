public class MatricesBruteforce {
    public static void main(String[] args) {

        int[][] matrix = {{3, 2}, {2, 4}};
        int power=1;

        MatricesBruteforce matrices=new MatricesBruteforce();
        int result[][]=matrix;

        for (int i = 1; i < power; i++) {
         result = matrices.slowPower(result,matrix);
        }

        //to print the output
        for(int[]row:result){
            for(int i:row){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public int[][] slowPower(int[][] A, int[][] B){
        int dimension = A.length;
        int[][] result = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) // row in A
        {
            for (int j = 0; j < dimension; j++) {  // column in B
                result[i][j] = 0; //should initialize inorder to makesure the result empty
                for (int k = 0; k < dimension; k++) { //k is like making connection betweenn i and j
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }


}











