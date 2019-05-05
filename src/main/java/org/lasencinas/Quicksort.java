package org.lasencinas;

public class Quicksort {

    public static void sort(int array[], int firstIndex, int lastIndex) {

        int pivot = array[firstIndex];
        int leftIndex = firstIndex;
        int rightIndex = lastIndex;
        int aux;

        while (leftIndex < rightIndex) {
            while (array[leftIndex] <= pivot && leftIndex < rightIndex) {
                leftIndex++;
            }
            while (array[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex < rightIndex) {
                aux = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = aux;
            }
        }
        array[firstIndex] = array[rightIndex];
        array[rightIndex] = pivot;

        if (firstIndex < rightIndex - 1)
            sort(array, firstIndex, rightIndex - 1);
        if (rightIndex + 1 < lastIndex)
            sort(array, rightIndex + 1, lastIndex);
    }
}
