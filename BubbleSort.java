public class BubbleSort {

    /*
        BUBBLE SORT
        IN-PLACE / STABLE
        TIME COMPLEXITY - O(n^2)
    */

    public void sort() {
        // declare int array to sort
        int[] nums = {55, 17, 43, -12, 75, 13, 7};

        // outer loop to find the last sorted index and decrease it as elements get sorted
        for (int lastSortedIndex = nums.length - 1; lastSortedIndex > 0; lastSortedIndex--) {

            // inner loop to iterate through the array up to the last sorted index
            for (int i = 0; i < lastSortedIndex; ++i) {

                // if the element is greater than the next, swap the two elements
                if (nums[i] > nums[i + 1]) {

                    // call function to swap elements
                    swap(nums, i, i + 1);
                }
            }
        }

        // print values of sorted array to console
        for (int num : nums) {
            System.out.println(num);
        }
    }

    // function to swap two numbers in the array
    public static void swap(int[] array, int i, int j) {

        // if elements are equal, return
        if (i == j) {
            return;
        }

        // swap elements
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
