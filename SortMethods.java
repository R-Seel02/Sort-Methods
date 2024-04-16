
public class SortMethods {
    private static int comparisons = 0;

    public static int getComparisons() {  //geter and setter for comparison tracking
        return comparisons;
    }

    public static void resetComparisons() {
        comparisons = 0;
    }

    public static void selectionSort(int[] intArray) { //selection sort start

        for (int last = intArray.length - 1; last > 0; last--) {
            int indexOfLargest = last;

            // Find largest element in unsorted array
            for (int i = 0; i < last; i++) {
                comparisons++;
                if (intArray[i] > intArray[indexOfLargest]) {
                    indexOfLargest = i;
                } // end if
            } // end for

            // Swap last element with largest element
            int temp = intArray[last];
            intArray[last] = intArray[indexOfLargest];
            intArray[indexOfLargest] = temp;

        } // end for

    }// end selectionSort

    public static void bubbleSort(int[] intArray) { //start bubbleSort
        int length = intArray.length;
        int temp = 0;
        for (int count = 0; count < length; count++) { //moving through the array
            for (int swap = 1; swap < (length - count); swap++) {
                comparisons++;
                if (intArray[swap - 1] > intArray[swap]) { //swaping elements logic

                    temp = intArray[swap - 1];
                    intArray[swap - 1] = intArray[swap]; 
                    intArray[swap] = temp;
                }
            } //end nested loop

        }// end for

    } //end bubble sort

    public static void merge(int[] intArray, int[] left, int[] right, int mid) {
        int leftLength = left.length; // subarrays used for sorting
        int rightLength = right.length;
        int i = 0; //indecies used for tracking terms
        int j = 0;
        int k = 0;

        // int index = first1;

        while ((i < leftLength) && (j < rightLength)) {
            comparisons++;
            if (left[i] <= right[i]) {
                
                intArray[k] = left[i];
                i++;
            } else {
                //
                intArray[k] = right[j];
                j++;

            } // end if statement
            k++;

        } // end while

        while (i < leftLength) {
            intArray[k] = left[i];
            i++;
            k++;
        } // end while

        while (j < rightLength) {
            intArray[k] = right[j];
            j++;
            k++;
        } // end while
    }

    public static void mergeSort(int[] intArray, int first, int last) { //start mergesort

        int n = intArray.length;

        if (n > 1) {
            int mid = n / 2;
            //sort intArray first-mid
            int[] left = new int[mid];
            // left side
            int[] right = new int[n - mid];
            // right side
            for (int i = 0; i < mid; i++) {
                left[i] = intArray[i];
            }
            for (int i = mid; i < n; i++) {
                right[i - mid] = intArray[i];

            }
            //merging sorted arrays

            mergeSort(left, first, last);
            
            mergeSort(right, first, last);
            merge(intArray, left, right, mid);

        } //end if

    }// end mergeSort

    public static int insertionSort(int[] intArray) { //start insertion sort

        for (int unsorted = 1; unsorted < intArray.length; unsorted++) {
            int nextItem = intArray[unsorted];
            int location = unsorted; 
            // move elements of intArray

            while ((location > 0) && (intArray[location - 1] > nextItem)) {
                comparisons++;
                intArray[location] = intArray[location - 1];
                location--;
            }
            intArray[location] = nextItem;


        }
        return comparisons;
    }
    
    // Method to perform Quick Sort
    public static void quickSort(int[] intArray, int low, int high) {
        if (low < high) {
            // Find pivot element such that
            // elements smaller than pivot are on the left
            // and elements greater than pivot are on the right
            int pivotIndex = partition(intArray, low, high);

            // Recursively sort elements before and after pivot
            quickSort(intArray, low, pivotIndex - 1);
            quickSort(intArray, pivotIndex + 1, high);
        }
    }

    // Method to partition the array into two halves
    // and return the index of the pivot element
    public static int partition(int[] arr, int low, int high) {
        // Select the last element as the pivot
        int pivot = intArray[high];
        int i = low - 1;

        // Iterate through the array from low to high
        // and move elements smaller than pivot to the left
        for (int j = low; j < high; j++) {
            comparisons++;
            if (intArray[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                intArray[i] = arr[j];
                intArray[j] = temp;
            }
        }

        // Place the pivot element in its correct position
        // by swapping it with arr[i+1]
        int temp = arr[i + 1];
        intArray[i + 1] = intArray[high];
        intArray[high] = temp;

        // Return the index of the pivot element
        return i + 1;
    }
    
    

    public static void printArray(int[] intArray) { //responsible for printing array(s)

        System.out.print("Array==> ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        } // end for

        System.out.println(" ");

    } // end printArray

    public static int[] randomIntArray(int n, double range) { //created the random array(s) 
        

        int[] intArray = new int[n];

        for (int i = 0; i < n; i++) {
            intArray[i] = (int) (Math.random() * range);
        } // end for

        return intArray;

    } // end randomIntArray

    public static int[] copyArray(int[] intArray) { //makes a copy of the arrays start of copy array
        
        int[] copyArray = new int[intArray.length];

        for (int i = 0; i < intArray.length; i++) {
            copyArray[i] = intArray[i];
        } // end for

        return copyArray;

    } // end copyArray

    public static int selectionSortComparisons(int[] intArray) {
        int comparisons = 0;

        for (int last = intArray.length - 1; last > 0; last--) {
            int indexOfLargest = last;

            // Find largest element in unsorted array
            for (int i = 0; i < last; i++) {
                comparisons++;
                if (intArray[i] > intArray[indexOfLargest]) {
                    indexOfLargest = i;
                } // end if
            } // end for

            // Swap last element with largest element
            int temp = intArray[last];
            intArray[last] = intArray[indexOfLargest];
            intArray[indexOfLargest] = temp;

            //printing partially sorted array

        } // end for
        return comparisons;

    } // end SortMethods

}
