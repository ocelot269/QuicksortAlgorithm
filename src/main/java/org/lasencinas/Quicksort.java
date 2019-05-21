package org.lasencinas;

import java.util.*;

public class Quicksort {

    /* ---- Behaviours ---- */
    public static void sort(int[] array) {
        Stack<Task> stack = new Stack<>();

        int start = 0;
        int end = array.length - 1;

        stack.push(new Task(start, end));

        while (!stack.isEmpty()) {
            start = stack.peek().getInitPos();
            end = stack.peek().getFinalPos();
            stack.pop();

            // Reorganize the elements across the pivot
            int pivot = partition(array, start, end);

            //we push sub-array indices containing elements lesser than pivot
            if (pivot - 1 > start) {
                stack.push(new Task(start, pivot - 1));
            }
            //we push sub-array indices containing elements greater than pivot
            else if (pivot + 1 < end) {
                stack.push(new Task(pivot + 1, end));
            }
        }
    }

    private static int partition(int array[], int start, int end) {
        int pivot = array[end];
        /**
         * Elements lesser than pivot will go to the left of referenceIndex,
         * elements greater than pivot will go to the right of referenceIndex.
         */
        int referenceIndex = start;
        /**
         * Each time we find an element lesser or equal than the pivot, referenceIndex
         * is incremented and that element will be replaced before the pivot.
         */
        for (int index = start; index < end; index++) {

            if (array[index] <= pivot) {
                swap(array, index, referenceIndex);
                referenceIndex++;
            }
        }
        // Swap referenceIndex with pivot
        swap(array, referenceIndex, end);
        // Return the index of pivot element
        return referenceIndex;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
