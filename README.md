# Sorting-Algorithms-in-Java

Sorting algorithms are used to organize a large number of elements into a specific order. The algorithms take an array of items as input, perform sorting operations on the array, and return the array as output. The efficiency of any sorting algorithm is determined by the time complexity and space complexity of the algorithm. Here is my implementation of some of the popular sorting algorithms in Java.

* [BubbleSort](https://github.com/jbla484/Sorting-Algorithms-in-Java/blob/main/BubbleSort.java)
* [SelectionSort](https://github.com/jbla484/Sorting-Algorithms-in-Java/blob/main/SelectionSort.java)
* [InsertionSort](https://github.com/jbla484/Sorting-Algorithms-in-Java/blob/main/InsertionSort.java)

## BubbleSort


**stable:** `Yes` - **time:** `O(n^2)` - **space:** `O(1)`

With the bubble sort algorithm, we start at the beginning of the array and swap the first two elements if the first element is greater than the second. Then, we move on to the next pair of elements, and so on, continuously iterating through the array until it's completely sorted.

## SelectionSort

**stable:** `No` - **time:** `O(n^2)` - **space:** `O(1)`

Selection Sort starts with the first element in the array (or list) and initiates the largest value equal to it. With each iteration, the code will loop through the array to find the element with the largest value, which it swaps with the last unsorted element. The process is repeated with each subsequent element until the last element has been reached.

## InsertionSort

**stable:** `Yes` - **time:** `O(n^2)` - **space:** `O(1)`

It's a stable sorting algorithm that seeks to sort a list one element at a time. With each iteration, it takes the next element waiting to be sorted, and adds it, in proper location, to those elements that have already been sorted.
