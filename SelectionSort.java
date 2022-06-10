public class SelectionSort {

    /*
        SELECTION SORT
        IN-PLACE / UNSTABLE
        TIME COMPLEXITY - 0(n^2)
    */

    public void sort(int[] input) {

        // outer loop to find the last sorted index and decreases as elements get sorted
        for (int lastSortedIndex = input.length - 1; lastSortedIndex > 0; lastSortedIndex--) {

            // declare variable to hold largest found in the iteration
            int largest = 0;

            // inner loop to iterate through the array up to the last sorted index
            for (int i = 1; i < lastSortedIndex; ++i) {

                // if the element is greater than the largest, set largest to i
                if (input[i] > input[largest]) {

                    // set largest variable
                    largest = i;
                }
            }

            // function call to swap the two elements
            swap(input, largest, lastSortedIndex);
        }
    }

    // function to swap two numbers in the array
    public static void swap(int[] input, int i, int j) {

        // if elements are equal, return
        if (i == j) {
            return;
        }

        // swap elements
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
