package org.lasencinas;

import java.util.*;

public class ArrayQS {

    /* ---- Behaviours ---- */
    public static void quicksort(List<Integer> integerList, Stack<Task> stack) {
        if (!stack.isEmpty()) {
            Task task = new Task(0, integerList.size() - 1);
            stack.push(task);
        }
        while (!stack.isEmpty()) {
            Task task = stack.pop();
            orderOnce(integerList, task);
        }
    }

    public static void orderOnce(List<Integer> integerList, Task task) {
        int pivot = (task.getInitPos() + task.getFinalPos()) / 2;
        int leftIndex = task.getInitPos();
        int rightIndex = task.getFinalPos();
        int aux;

        while (leftIndex < rightIndex) {
            while (integerList.get(leftIndex) <= integerList.get(pivot) && leftIndex < rightIndex) {
                leftIndex++;
            }
            while (integerList.get(rightIndex) > integerList.get(pivot)) {
                rightIndex--;
            }
            if (leftIndex < rightIndex) {
                aux = integerList.get(leftIndex);
                integerList.set(leftIndex, integerList.get(rightIndex));
                integerList.set(rightIndex, aux);
            }
        }
        integerList.set(leftIndex, integerList.get(rightIndex));
        integerList.set(rightIndex, pivot);
    }
}
