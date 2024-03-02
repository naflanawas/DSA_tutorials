package tutorial3.sorting.algorithm;

import java.util.Random;

public class MergeSort {



        // Merge (sorted) ranges values[first]...values[mid] and values[mid+1]...values[last]
        private static void mergeRanges(int[] values, int first, int mid, int last){
            // Calculate the lengths of the two subarrays to be merged
            int n1 = mid - first + 1;
            int n2 = last - mid;

            // Create temporary arrays to hold the two subarrays
            int[] leftArray = new int[n1];
            int[] rightArray = new int[n2];

            // Copy data to temporary arrays leftArray[] and rightArray[]
            for (int i = 0; i < n1; ++i)
                leftArray[i] = values[first + i];
            for (int j = 0; j < n2; ++j)
                rightArray[j] = values[mid + 1 + j];

            // Merge the temporary arrays

            // Initial indexes of the merged subarrays
            int i = 0, j = 0;

            // Initial index of merged subarray array
            int k = first;

            // Merge the temporary arrays back into values[first...last]
            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    values[k] = leftArray[i];
                    i++;
                } else {
                    values[k] = rightArray[j];
                    j++;
                }
                k++;
            }

            // Copy remaining elements of leftArray[] if any
            while (i < n1) {
                values[k] = leftArray[i];
                i++;
                k++;
            }

            // Copy remaining elements of rightArray[] if any
            while (j < n2) {
                values[k] = rightArray[j];
                j++;
                k++;
            }
        }



        // Auxiliary recursive function
        // Sorts the range values[first]...values[last]
        private static void sortRange(int[] values, int first, int last){
            if(last > first){    // Otherwise there is nothing to do (single value)
                int mid = (first + last) / 2;
                sortRange(values, first, mid);      // Recursively sort first half
                sortRange(values, mid + 1, last);   // Recursively sort second half
                mergeRanges(values, first, mid, last); // Merge sorted halves
            }
        }

        public static void sort(int[] values){
            sortRange(values, 0, values.length - 1);
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
            int numValues = 10;
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