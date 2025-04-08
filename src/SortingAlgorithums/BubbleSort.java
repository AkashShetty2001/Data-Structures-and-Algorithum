package SortingAlgorithums;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        // Example input array
        int a[] = {5, 4, 1, 3, 2};

        // Call the bubbleSort method to sort the array
        bubbleSort(a);

        // Print the sorted array
        System.out.println(Arrays.toString(a));
    }

    // Method to perform Bubble Sort on the given array
    public static void bubbleSort(int a[]){

        // Outer loop: Iterate through the array (n-1 times)
        for(int turns = 0; turns < a.length - 1; turns++){

            // Variable to keep track of swaps made during the current pass
            int swapCount = 0;

            // Inner loop: Compare adjacent elements and swap if necessary
            // Note: After each pass, the largest element is pushed to the end of the array
            for(int j = 0; j < a.length - 1 - turns; j++){
                if(a[j] > a[j + 1]){
                    // Swap the elements if they are in the wrong order
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapCount++;  // Increment swap count
                }
            }

            // If no swaps were made during the current pass, the array is already sorted
            if(swapCount == 0){
                break;  // Exit early, as no further sorting is needed
            }
        }
    }
}

/*
    Time Complexity (TC):
    - Best Case: O(n) when the array is already sorted.
    - Average/Worst Case: O(n^2) because each element is compared with every other element in the array.
    - If the array is already sorted, the algorithm exits early with just one pass, achieving a linear time complexity.

    Space Complexity (SC):
    - O(1) because Bubble Sort is an in-place sorting algorithm. It doesn't require any extra space apart from the input array.

    Summary:
    - **Bubble Sort** is a simple, comparison-based sorting algorithm. It repeatedly compares adjacent elements and swaps them if they are in the wrong order.
    - After each pass, the largest unsorted element "bubbles" up to its correct position at the end of the list.
    - **Use Cases**: It's a good introductory algorithm for understanding sorting concepts, but due to its O(n^2) time complexity, it's inefficient for large datasets.
    - **Optimization**: By tracking swaps, we can improve the best-case time complexity to O(n) when the list is already sorted or nearly sorted.
    - **Stability**: Bubble sort is a stable sort, meaning that equal elements retain their relative order.
    - In terms of problem-solving in Data Structures and Algorithms (DSA), Bubble Sort is rarely used in practice for large datasets due to its inefficiency. It's more of a learning tool to understand the basic principles of sorting.
*/
