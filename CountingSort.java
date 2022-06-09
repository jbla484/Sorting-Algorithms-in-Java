public class CountingSort {

    /*
        COUNTING SORT
        NOT IN-PLACE / UNSTABLE
        TIME COMPLEXITY - O(n)
    */

    public void sort() {

        // declare int array to sort
        int[] nums = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        // call the sort function to sort the array
        countingSort(nums, 1, nums.length);

        // print values of sorted array to console
        for (int num : nums) {
            System.out.println(num);
        }
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
