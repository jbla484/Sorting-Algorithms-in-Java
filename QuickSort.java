public class QuickSort {

    /*
        QUICK SORT
        IN-PLACE / UNSTABLE
        TIME COMPLEXITY - O(nlogn)
    */

    public void sort() {

        // declare int array to sort
        int[] nums = {55, 17, 43, -12, 75, 13, 7};

        // call the sort function to sort the array
        quickSort(nums, 0, nums.length);

        // print values of sorted array to console
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void quickSort(int[] nums, int start, int end) {

        // if the array is one element or less, return from function
        if (end - start < 2) {
            return;
        }

        // call the partition function to calculate the pivot index
        int pivotIndex = partition(nums, start, end);

        // recursive call to quickSort to sort the left partition
        quickSort(nums, start, pivotIndex);

        // recursive call to quickSort to sort the right partition
        quickSort(nums, pivotIndex + 1, end);
    }

    public static int partition(int[] nums, int start, int end) {

        // using the first element of the array as the pivot
        int pivot = nums[start];

        // declare loop variables to traverse the array
        int i = start, j = end;

        while (i < j) {

            // traverse right-to-left
            while (i < j && nums[--j] >= pivot) ;

            // assign the smaller element before the pivot index
            if (i < j) {
                nums[i] = nums[j];
            }

            // traverse left-to-right
            while (i < j && nums[++i] <= pivot) ;

            // assign the bigger element after the pivot index
            if (i < j) {
                nums[j] = nums[i];
            }

        }

        // assign pivot to the correct index in the array
        nums[j] = pivot;

        // return the pivot index
        return j;
    }
}
