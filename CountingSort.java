public class CountingSort {

    /*
        COUNTING SORT
        NOT IN-PLACE / UNSTABLE
        TIME COMPLEXITY - O(n)
    */

    public void sort(int[] input) {

        // call the sort function to sort the array
        countingSort(input, 1, input.length);
    }

    public static void countingSort(int[] input, int min, int max) {

        // declare and initialize array to track the counts
        int[] countArray = new int[(max - min) + 1];

        // traverse input array and count values
        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        // index to write to the input array
        int j = 0;

        // traverse count array and assign values to input array
        for (int i = min; i <= max; i++) {

            // write values to input array and decrement count
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
