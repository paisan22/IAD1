package nl.paisanrietbroek.heapsort;


import org.joda.time.DateTime;

import java.util.Arrays;

/**
 * Created by paisanrietbroek on 20/09/2017.
 */
public class HeapSort {

    private int[] heapOrderedArray;

    /**
     * Constructor
     * @param array
     */
    public HeapSort(int[] array) {
        this.heapOrderedArray = array;

        DateTime now = DateTime.now();
        heapSort();
        DateTime after = DateTime.now();
        printArrayState(getDiffInMilis(now, after));
    }

    private void heapSort() {
        // voor elk element in de heap (tot de heap leeg is)
        while (heapOrderedArray[0] > 0) {
            removeMax();
            heapOrderedArray[0]--;
            sink(1);
        }
    }

    private void removeMax() {
        int max = heapOrderedArray[1];
        heapOrderedArray[1] = heapOrderedArray[heapOrderedArray[0]];
        heapOrderedArray[heapOrderedArray[0]] = max;
    }

    private void sink(int parent) {

        int leftChild = parent * 2;
        int rightChild = leftChild + 1;

        if (!childIsInArray(leftChild)) {
            return;
        }

        if (parentLessChild(parent, leftChild)) {
            swap(parent, leftChild);
            sink(parent);
        }

        if (parentLessChild(parent, rightChild)) {
            swap(parent, rightChild);
            sink(parent);
        }

    }

    private void swap(int parent, int child) {

        int tmp = heapOrderedArray[parent];
        heapOrderedArray[parent] = heapOrderedArray[child];
        heapOrderedArray[child] = tmp;

    }

    private boolean childIsInArray(int child) {
        return child < heapOrderedArray[0];
    }

    private boolean parentLessChild(int parent, int child) {
        return heapOrderedArray[parent] < heapOrderedArray[child];
    }

    private void printArrayState(long diff) {

        System.out.println("Heapsort (n log n) execution time: " + diff + " wit n = " + heapOrderedArray.length);
        System.out.println(Arrays.toString(heapOrderedArray));
        System.out.println("----------------------------------------------------");

    }
    private long getDiffInMilis(DateTime now, DateTime after) {
        return after.getMillis() - now.getMillis();
    }

}
