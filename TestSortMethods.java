public class TestSortMethods {

    public static void main(String[] args) { //creates arrays

        int[] array1 = SortMethods.randomIntArray(2000, 10000.0);

        int[] array2 = SortMethods.randomIntArray(4000, 10000.0);

        int[] array3 = SortMethods.randomIntArray(6000, 10000.0);

        int[] array4 = SortMethods.randomIntArray(8000, 10000.0);

        int[] array5 = SortMethods.randomIntArray(10000, 10000.0);
        

        for (int testCount = 0; testCount < 3; testCount++) {
            System.out.println("Test " + (testCount + 1));
            System.out.println();

            for (int arrayIndex = 0; arrayIndex < 5; arrayIndex++) {
                switch (arrayIndex) {
                    case 0:
                        int[] array1copy = SortMethods.copyArray(array1); //cases for each array length, prints and resets the comparisons
                        SortMethods.selectionSort(array1copy);
                        System.out.println("Selection Sort: " + SortMethods.getComparisons()); 
                        SortMethods.resetComparisons();
                        break;
                    case 1:
                        int[] array2copy = SortMethods.copyArray(array2);
                        SortMethods.selectionSort(array2copy);
                        System.out.println("Selection Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;

                    case 2:
                        int[] array3copy = SortMethods.copyArray(array3);
                        SortMethods.selectionSort(array3copy);
                        System.out.println("Selection Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;

                    case 3:
                        int[] array4copy = SortMethods.copyArray(array4);
                        SortMethods.selectionSort(array4copy);
                        System.out.println("Selection Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;

                    case 4:
                        int[] array5copy = SortMethods.copyArray(array5);
                        SortMethods.selectionSort(array5copy);
                        System.out.println("Selection Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;

                }
            }

            System.out.println();
        }
        for (int testCount = 0; testCount < 3; testCount++) {
            System.out.println("Test " + (testCount + 1));
            System.out.println();

            for (int arrayIndex = 0; arrayIndex < 5; arrayIndex++) {
                switch (arrayIndex) {
                    case 0:
                        int[] array1copy = SortMethods.copyArray(array1);
                        SortMethods.bubbleSort(array1copy);
                        System.out.println("Bubble Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;
                    case 1:
                        int[] array2copy = SortMethods.copyArray(array2);
                        SortMethods.bubbleSort(array2copy);
                        System.out.println("Bubble Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;

                    case 2:
                        int[] array3copy = SortMethods.copyArray(array3);
                        SortMethods.bubbleSort(array3copy);
                        System.out.println("Bubble Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;

                    case 3:
                        int[] array4copy = SortMethods.copyArray(array4);
                        SortMethods.bubbleSort(array4copy);
                        System.out.println("Bubble Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;

                    case 4:
                        int[] array5copy = SortMethods.copyArray(array5);
                        SortMethods.bubbleSort(array5copy);
                        System.out.println("Bubble Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;

                }
            }

            System.out.println();
        }
        for (int testCount = 0; testCount < 3; testCount++) {
            System.out.println("Test " + (testCount + 1));
            System.out.println();

            for (int arrayIndex = 0; arrayIndex < 5; arrayIndex++) {
                switch (arrayIndex) {
                    case 0:
                        int[] array1copy = SortMethods.copyArray(array1);
                        SortMethods.mergeSort(array1copy, 0, array1copy.length-1);
                        System.out.println("Merge Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;
                    case 1:
                        int[] array2copy = SortMethods.copyArray(array2);
                        SortMethods.mergeSort(array2copy, 0, array2copy.length-1);
                        System.out.println("Merge Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;

                    case 2:
                        int[] array3copy = SortMethods.copyArray(array3);
                        SortMethods.mergeSort(array3copy, 0, array3copy.length-1);
                        System.out.println("Merge Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;

                    case 3:
                        int[] array4copy = SortMethods.copyArray(array4);
                        SortMethods.mergeSort(array4copy,0, array4copy.length-1);
                        System.out.println("Merge Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;

                    case 4:
                        int[] array5copy = SortMethods.copyArray(array5);
                        SortMethods.mergeSort(array5copy,0, array5copy.length-1);
                        System.out.println("Merge Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;

                }
            }

            System.out.println();
        }

        for (int testCount = 0; testCount < 3; testCount++) {
            System.out.println("Test " + (testCount + 1));
            System.out.println();

            for (int arrayIndex = 0; arrayIndex < 5; arrayIndex++) {
                switch (arrayIndex) {
                    case 0:
                        int[] array1copy = SortMethods.copyArray(array1);
                        SortMethods.insertionSort(array1copy);
                        System.out.println("Insertion Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;
                    case 1:
                        int[] array2copy = SortMethods.copyArray(array2);
                        SortMethods.insertionSort(array2copy);
                        System.out.println("Insertion Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;

                    case 2:
                        int[] array3copy = SortMethods.copyArray(array3);
                        SortMethods.insertionSort(array3copy);
                        System.out.println("Insertion Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;

                    case 3:
                        int[] array4copy = SortMethods.copyArray(array4);
                        SortMethods.insertionSort(array4copy);
                        System.out.println("Insertion Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;

                    case 4:
                        int[] array5copy = SortMethods.copyArray(array5);
                        SortMethods.insertionSort(array5copy);
                        System.out.println("Insertion Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;

                }
            }

            System.out.println();
        }

        for (int testCount = 0; testCount < 3; testCount++) {
            System.out.println("Test " + (testCount + 1));
            System.out.println();

            for (int arrayIndex = 0; arrayIndex < 5; arrayIndex++) {
                switch (arrayIndex) {
                    case 0:
                        int[] array1copy = SortMethods.copyArray(array1);
                        SortMethods.quickSort(array1copy,0,array1copy.length-1);
                        System.out.println("Quick Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;
                    case 1:
                        int[] array2copy = SortMethods.copyArray(array2);
                        SortMethods.quickSort(array2copy,0,array2copy.length-1);
                        System.out.println("Quick Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;

                    case 2:
                        int[] array3copy = SortMethods.copyArray(array3);
                        SortMethods.quickSort(array3copy,0,array3copy.length-1);
                        System.out.println("Quick Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;

                    case 3:
                        int[] array4copy = SortMethods.copyArray(array4);
                        SortMethods.quickSort(array4copy,0,array4copy.length-1);
                        System.out.println("Quick Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;

                    case 4:
                        int[] array5copy = SortMethods.copyArray(array5);
                        SortMethods.quickSort(array5copy,0,array5copy.length-1);
                        System.out.println("Quick Sort: " + SortMethods.getComparisons());
                        SortMethods.resetComparisons();
                        break;

                }
            }

            System.out.println();
        }



    }

}
