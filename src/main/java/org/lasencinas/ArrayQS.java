package org.lasencinas;

public class ArrayQS {

    public static void sort(int array[], int firstIndex, int lastIndex) {

        Tasca t;
        t = new Tasca (0, array.lenght - 1);
        tasques.push(t);

        while(!tasques.isEmpty()) {
            t = tasques.pop();
            this.doOneStep(t);
        }
    }
}
