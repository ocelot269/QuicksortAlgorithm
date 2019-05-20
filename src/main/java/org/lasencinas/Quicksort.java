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

            int pivot = partition(array, start, end);

            if (pivot - 1 > start) {
                stack.push(new Task(start, pivot - 1));
            } else if (pivot + 1 < end) {
                stack.push(new Task(pivot + 1, end));
            }
        }
    }

    public static int partition(int array[], int start, int end) {
        int pivot = array[end];
        int referenceIndex = start;
        for (int index = start; index < end; index++) {

            if (array[index] <= pivot) {
                swap(array, index, referenceIndex);
                referenceIndex++;
            }
        }
        swap(array, referenceIndex, pivot);
        return referenceIndex;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
