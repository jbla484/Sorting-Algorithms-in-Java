# Sorting-Algorithms-in-Java

Sorting algorithms are used to organize a large number of elements into a specific order. The algorithms take an array of items as input, perform sorting operations on the array, and return the array as output. The efficiency of any sorting algorithm is determined by the time complexity and space complexity of the algorithm. Here is my implementation of some of the popular sorting algorithms in Java.

* [BubbleSort](https://github.com/jbla484/Sorting-Algorithms-in-Java/blob/main/BubbleSort.java)
* [SelectionSort](https://github.com/jbla484/Sorting-Algorithms-in-Java/blob/main/SelectionSort.java)
* [InsertionSort](https://github.com/jbla484/Sorting-Algorithms-in-Java/blob/main/InsertionSort.java)
* [ShellSort](https://github.com/jbla484/Sorting-Algorithms-in-Java/blob/main/ShellSort.java)
* [MergeSort](https://github.com/jbla484/Sorting-Algorithms-in-Java/blob/main/MergeSort.java)
* [QuickSort](https://github.com/jbla484/Sorting-Algorithms-in-Java/blob/main/QuickSort.java)
* [CountingSort](https://github.com/jbla484/Sorting-Algorithms-in-Java/blob/main/CountingSort.java)

## BubbleSort

**stable:** `Yes` - **time:** `O(n^2)` - **space:** `O(1)`

With the bubble sort algorithm, we start at the beginning of the array and swap the first two elements if the first element is greater than the second. Then, we move on to the next pair of elements, and so on, continuously iterating through the array until it's completely sorted.

## SelectionSort

**stable:** `No` - **time:** `O(n^2)` - **space:** `O(1)`

Selection Sort starts with the first element in the array (or list) and initiates the largest value equal to it. With each iteration, the code will loop through the array to find the element with the largest value, which it swaps with the last unsorted element. The process is repeated with each subsequent element until the last element has been reached.

## InsertionSort

**stable:** `Yes` - **time:** `O(n^2)` - **space:** `O(1)`

The insertion sort algorithm has two partitions, the sorted partition being the first element in the array, and the unsorted partition being every element after that. With each iteration, it takes the next element waiting to be sorted (from the unsorted partition), and adds it, in proper location, to the sorted partition.

## ShellSort

**stable:** `No` - **time:** `O(n^2)` - **space:** `O(1)`

The shell sort algorithm is mainly a variation of the Insertion Sort algorithm. The concept of ShellSort is to sort non-adjacent elements with a gap larger than one. We keep reducing the value of the gap every iteration until it becomes one, performing an insertion sort last to sort the rest of the elements.

## MergeSort

**stable:** `Yes` - **time:** `O(nlogn)` - **space:** `O(n)`

Merge Sort is a recursive divide and conquer algorithm that divides it's input array into halves. It then calls itself for the halves, and merges the two sorted halves together. The included merge() function is used for merging the sorted halves. It is one of the most popular and efficient sorting algorithms.

## QuickSort

**stable:** `No` - **time:** `O(nlogn)` - **space:** `O(logn)`

The quick sort algorithm is often faster in practice compared to other sorting algorithms. It uses a divide and conquer strategy to quickly sort the data by dividing the array into two partitions every interation. It continues to divide the array until the partition contains just one element, assigning the individual elements to their correct sorted index.

## CountingSort

**stable:** `No` - **time:** `O(n)` - **space:** `O(n+r)`

The counting sort algorithm is based on keys between a specific range. It works by counting the number of objects having distinct key values (like hashing), and doing some arithmetic to calculate the position of each object in the output sequence. 
