package org.lasencinas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ArrayQSTest {

    /* ---- Properties ---- */
    private List<Integer> integerList = null;
    private Stack<Task> tasks = null;


    @Before
    public void setUp() {
        integerList = new ArrayList<>(Arrays.asList(3, 5, 13, 65 ,7, 1));
        tasks = new Stack<>();
    }

    @Test
    public void quicksortTest() {
        ArrayQS.quicksort(integerList,  tasks);
        assertEquals(Arrays.asList(1, 3, 5, 7, 13, 65), integerList);

    }
}
