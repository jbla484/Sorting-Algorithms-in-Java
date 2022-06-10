public class ShellSort {

    /*
        SHELL SORT
        IN-PLACE / UNSTABLE
        TIME COMPLEXITY - O(n^2)
    */

    public void sort(int[] input) {

        // outer loop to find the gap value and divide it by two every iteration
        for (int gap = input.length / 2; gap > 0; gap /= 2) {

            // inner loop to compare and shift elements
            for (int i = gap; i < input.length; i++) {

                // declare variables for element to sort and iteration
                int newElement = input[i];
                int j = i;

                // traverse through the array elements and shift
                while (j >= gap && input[j - gap] > newElement) {
                    input[j] = input[j - gap];
                    j -= gap;
                }

                // reach the end of the array, assign new element to the insertion point
                input[j] = newElement;
            }
        }
    }
}
