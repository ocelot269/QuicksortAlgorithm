package org.lasencinas;

import org.junit.Assert;

import org.junit.Test;
import java.util.Arrays;

public class QuicksortTest {

    /* ---- Properties ---- */
    private int[] array = {1, 5, 76, 23, 54, 12, 89, 02};

    @Test
    public void quicksortTest() {
        Quicksort.sort(array);
        Assert.assertEquals(Arrays.asList(1, 02, 5, 12, 23, 54, 76, 89), array);
    }
}
