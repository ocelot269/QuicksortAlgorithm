package org.lasencinas;

public class Quicksort {

    public static void sort(int array[]) {

        int beginningIndex = 0;
        int lastIndex = array.length - 1;
        int pivot = array[array.length / 2];

        int leftIndex = beginningIndex;
        int rightIndex = lastIndex;

        while (leftIndex < rightIndex) {
            while (array[leftIndex] <= pivot && leftIndex < rightIndex) {
                leftIndex++;
            }
            while (array[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex < rightIndex) {
                Quicksort.swap(array, leftIndex, rightIndex);
            }
        }
        array[beginningIndex] = array[rightIndex];
        array[rightIndex] = pivot;
    }

    public static void swap(int array[], int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[i] = aux;
    }
}
