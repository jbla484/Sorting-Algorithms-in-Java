public class BubbleSort {

    /*
        BUBBLE SORT
        IN-PLACE / STABLE
        TIME COMPLEXITY - O(n^2)
    */

    public void sort(int[] input) {

        // outer loop to find the last sorted index and decrease it as elements get sorted
        for (int lastSortedIndex = input.length - 1; lastSortedIndex > 0; lastSortedIndex--) {

            // inner loop to iterate through the array up to the last sorted index
            for (int i = 0; i < lastSortedIndex; ++i) {

                // if the element is greater than the next, swap the two elements
                if (input[i] > input[i + 1]) {

                    // call function to swap elements
                    swap(input, i, i + 1);
                }
            }
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
