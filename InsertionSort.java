public class InsertionSort {

    /*
        INSERTION SORT
        IN-PLACE / STABLE
        TIME COMPLEXITY - O(n^2)
    */

    public void sort() {

        // declare int array to sort
        int[] nums = {55, 17, 43, -12, 75, 13, 7};

        // iterate through unsorted partition, adding elements to the sorted partition every iteration
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < nums.length; firstUnsortedIndex++) {

            // element to add to sorted partition, set to array element at firstUnsortedIndex
            int newElement = nums[firstUnsortedIndex];

            // declare i to use after loop
            int i;

            // iterate through sorted partition to find where to add new element
            for (i = firstUnsortedIndex; i > 0 && nums[i - 1] > newElement; i--) {
                nums[i] = nums[i - 1];
            }

            // set array element to new element
            nums[i] = newElement;
        }

        // print values of sorted array to console
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
