public class MatrciesDivAndCon {
    public static void main(String[] args) {

        int[][] matrix = {{3, 2}, {2, 4}};
        int power = 1;

        MatricesBruteforce matrices = new MatricesBruteforce();
        int result[][] = matrix;

        for (int i = 1; i < power; i++) {
            result = matrices.slowPower(result, matrix);
        }

        //to print the output
        for (int[] row : result) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }



    // Divide-and-conquer version of matrix power
    public static int[][] fastPower(int[][] matrix, int exponent) {
        int dimension = matrix.length;
        int[][] result = new int[dimension][dimension];

        // Base case: power is 0
        if (exponent == 0) {
            for (int i = 0; i < dimension; i++) {
                result[i][i] = 1;
            }
            return result;
        }

        // Base case: power is 1
        if (exponent == 1) {
            return matrix;
        }

        // Recursive case: divide and conquer
        int[][] halfPower = fastPower(matrix, exponent / 2);
        result = fastPower(halfPower, exponent);

        // If power is odd, multiply result by the original matrix
        if (exponent % 2 == 1) {
            result = fastPower(result, exponent);
        }

        return result;
    }
}



