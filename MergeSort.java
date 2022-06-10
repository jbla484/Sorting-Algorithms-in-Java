public class MergeSort {

    /*
        MERGE SORT
        NOT IN-PLACE / STABLE
        TIME COMPLEXITY - O(nlogn)
    */

    public void sort(int[] input) {

        // call the sort function to sort the array
        mergeSort(input, 0, input.length);
    }

    public static void mergeSort(int[] input, int start, int end) {

        // if the array length is 1 or lower, return from method
        if (end - start < 2) {
            return;
        }

        // calculate midpoint from parameters
        int midpoint = (start + end) / 2;

        // recursively call the method with the start and midpoint values (left partition)
        mergeSort(input, start, midpoint);

        // recursively call the method with the midpoint and end values (right partition)
        mergeSort(input, midpoint, end);

        // merge the two sorted partitions together
        merge(input, start, midpoint, end);
    }

    public static void merge(int[] input, int start, int midpoint, int end) {

        // if the left partition's largest value is smaller than the
        // right partition's smallest value, return from function.
        if (input[midpoint - 1] <= input[midpoint]) {
            return;
        }

        // declare and initialize loop variables
        int i = start, j = midpoint, tempIndex = 0;

        // declare and initialize temporary array
        int[] temp = new int[end - start];

        // iterate through array and add ordered values to temporary array
        while (i < midpoint && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // if the right partition runs out of values, copy the left
        // partition values into the correct index
        System.arraycopy(input, i, input, start + tempIndex, midpoint - i);

        // copy temporary array values to the original array
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
