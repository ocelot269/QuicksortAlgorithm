package org.lasencinas;

import org.junit.Assert;

import org.junit.Test;

import java.util.Arrays;

public class QuicksortTest {

    /* ---- Properties ---- */
    private int[] array = {1, 5, 76, 23, 54, 12, 89, 2};
    private int[] arrayResult = {1, 2, 5, 12, 23, 54, 76, 89};

    @Test
    public void quicksortTest() {
        Quicksort.sort(array);
        Assert.assertEquals(Arrays.toString(arrayResult), Arrays.toString(array));

        System.out.println(Arrays.toString(arrayResult));
        System.out.println(Arrays.toString(array));


        /**
         * Expected --> [1, 2, 5, 12, 23, 54, 76, 89] (arrayResult)
         * Actual --> [1, 2, 5, 12, 23, 54, 76, 89] /array)
         */
    }
}
