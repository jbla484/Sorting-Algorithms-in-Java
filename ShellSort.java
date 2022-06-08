public class ShellSort {

    /*
        SHELL SORT
        IN-PLACE / UNSTABLE
        TIME COMPLEXITY - O(n^2)
    */

    public void sort() {

        // declare int array to sort
        int[] nums = {55, 17, 43, -12, 75, 13, 7};

        // outer loop to find the gap value and divide it by two every iteration
        for (int gap = nums.length / 2; gap > 0; gap /= 2) {

            // inner loop to compare and shift elements
            for (int i = gap; i < nums.length; i++) {

                // declare variables for element to sort and iteration
                int newElement = nums[i];
                int j = i;

                // traverse through the array elements and shift
                while (j >= gap && nums[j - gap] > newElement) {
                    nums[j] = nums[j - gap];
                    j -= gap;
                }

                // reach the end of the array, assign new element to the insertion point
                nums[j] = newElement;
            }
        }

        // print values of sorted array to console
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
