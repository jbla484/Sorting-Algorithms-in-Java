public class InsertionSort {

    /*
        INSERTION SORT
        IN-PLACE / STABLE
        TIME COMPLEXITY - O(n^2)
    */

    public void sort(int[] input) {

        // iterate through unsorted partition, adding elements to the sorted partition every iteration
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < input.length; firstUnsortedIndex++) {

            // element to add to sorted partition, set to array element at firstUnsortedIndex
            int newElement = input[firstUnsortedIndex];

            // declare i to use after loop
            int i;

            // iterate through sorted partition to find where to add new element
            for (i = firstUnsortedIndex; i > 0 && input[i - 1] > newElement; i--) {
                input[i] = input[i - 1];
            }

            // set array element to new element
            input[i] = newElement;
        }
    }
}
