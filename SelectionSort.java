public class SelectionSort {

    /*
        SELECTION SORT
        IN-PLACE / UNSTABLE
        TIME COMPLEXITY - 0(n^2)
        */

    public void sort() {

        // declare int array to sort
        int[] nums = {55, 17, 43, -12, 75, 13, 7};

        // outer loop to find the last sorted index and decreases as elements get sorted
        for (int lastSortedIndex = nums.length - 1; lastSortedIndex > 0; lastSortedIndex--) {

            // declare variable to hold largest found in the iteration
            int largest = 0;

            // inner loop to iterate through the array up to the last sorted index
            for (int i = 1; i < lastSortedIndex; ++i) {

                // if the element is greater than the largest, set largest to i
                if (nums[i] > nums[largest]) {

                    // set largest variable
                    largest = i;
                }
            }

            // function call to swap the two elements
            swap(nums, largest, lastSortedIndex);
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
