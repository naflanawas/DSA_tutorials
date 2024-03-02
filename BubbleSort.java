package tutorial3.sorting.algorithm;

import java.util.Random;

public class BubbleSort {

        public static void sort(int[] values){
            int i,j,temp;
            for( i= (values.length-1);i>0;i--){ //number of rounds,desc to asc
                for(j=1;j<=i;j++){ //swap happens
                    if(values[j-1]>values[j]){
                        temp = values[j-1]; //initializing aa new variable to assign the swapping value
                        values[j-1] = values[j];
                        values[j] = temp;
                    }
                }
            }
        }

        public static int[] randomValues(int howMany){
            int[] result = new int[howMany];
            Random random = new Random();
            for(int i=0; i<howMany; i++)
                result[i] = random.nextInt() % (10 * howMany);
            return result;
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // How many values to generate
            int numValues = 5;
            // Whether to print results. Only use with small numbers of values.
            boolean printResults = true;


            int[] a = randomValues(numValues);
            if(printResults){
                System.out.print("Before sorting: ");
                for(int i=0;i<numValues; i++)
                    System.out.print(a[i] + " ");
                System.out.println();
            }
            long start = System.currentTimeMillis();
            sort(a);
            long now = System.currentTimeMillis();
            double elapsed = (now - start) / 1000.0;
            if(printResults){
                System.out.print("After sorting: ");
                for(int i=0;i<numValues; i++)
                    System.out.print(a[i] + " ");
                System.out.println();
            }
            System.out.println();
            System.out.println("Elapsed time = " + elapsed + " seconds");
        }


}
