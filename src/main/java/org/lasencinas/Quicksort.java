package org.lasencinas;

public class Quicksort {

    public static void sort(int array[]) {

        int leftIndex = 0;
        int rightIndex = array.length - 1;
        int pivot = array[array.length / 2];
        int aux = 0;

        while (leftIndex < rightIndex) {
            while (array[leftIndex] <= pivot && leftIndex < rightIndex) {
                leftIndex++;
            }
            while (array[rightIndex] > pivot) {
                leftIndex++;
            }
            if (leftIndex < rightIndex) {
                aux = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = aux;
            }
        }
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = pivot;
    }
}
