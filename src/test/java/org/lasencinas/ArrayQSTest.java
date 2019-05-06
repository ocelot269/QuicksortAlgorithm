package org.lasencinas;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayQSTest {

    private int[] array = {1, 5, 89, 2, 0};
    private int[] array2 = {4, 5, 78, 23, 32, 11, 9};

    @Test
    public void quicksortTest() {

        int[] array1Result = {0, 1, 2, 5, 89};
        int[] array2Result = {4, 5, 9, 11, 23, 32, 78};

        ArrayQS.sort(array, 0, array1Result.length - 1);
        ArrayQS.sort(array2, 0, array1Result.length - 1);

        assertArrayEquals(array1Result, array);
        assertArrayEquals(array2Result, array2);
    }
}
