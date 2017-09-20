package nl.paisanrietbroek.mergesort;

import org.joda.time.DateTime;

import java.util.Arrays;


/**
 * Created by paisanrietbroek on 14/09/2017.
 */
public class MergeSort {

    private int[] array;

    public MergeSort(int[] array) {
        this.array = array;

        DateTime now = DateTime.now();

        mergeSort(0, array.length - 1);
        DateTime after = DateTime.now();

        printArrayState(getDiffInMilis(now, after));

    }

    public void mergeSort(int lo, int hi) {
        // if there is only 1 item in the list
        if (lo == hi) {
            return;
        } else {

            int midIndex = (lo + hi) /2;
            mergeSort(lo, midIndex); // devide list on left part again
            mergeSort(midIndex+1, hi); // devide list on right part again

            merge(lo, midIndex, hi);
        }
    }

    private void merge(int lo, int mid, int hi) {

        // create left part of the list
        int[] leftPart = new int[mid - lo + 2];

        for (int i = lo; i <= mid; i++) {
            leftPart[i - lo] = array[i];
        }

        leftPart[mid - lo + 1] = Integer.MAX_VALUE;

        // create right part of the list
        int[] rightPart = new int[hi - mid + 1];
        for (int i = mid + 1; i <= hi;i++) {
            rightPart[i - mid - 1] = array[i];
        }
        rightPart[hi - mid] = Integer.MAX_VALUE;

        // compare left and right
        int i = 0, j = 0;
        for (int k = lo; k <= hi; k++) {
            if (leftPart[i] <= rightPart[j]) {
                array[k] = leftPart[i];
                i++;
            } else {
                array[k] = rightPart[j];
                j++;
            }
        }
    }

    private void printArrayState(long diff) {
        System.out.println("Mergesort (n^2) execution time in milliseconds: " + diff + " with n=" + array.length);
//        System.out.println(Arrays.toString(array));
        System.out.println("----------------------------------------------------");
    }

    private long getDiffInMilis(DateTime now, DateTime after) {
        return after.getMillis() - now.getMillis();
    }

}
