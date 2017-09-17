package nl.paisanrietbroek.mergesort;

import java.util.Arrays;

/**
 * Created by paisanrietbroek on 14/09/2017.
 */
public class MergeSort {

    public void mergeSort(int[] list, int lo, int hi) {
        // if there is only 1 item in the list
        if (lo == hi) {
            return;
        } else {

            int midIndex = (lo + hi) /2;
            mergeSort(list, lo, midIndex); // devide list on left part again
            mergeSort(list, midIndex+1, hi); // devide list on right part again

            merge(list, lo, midIndex, hi);

            System.out.println("Mergesort list: " + Arrays.toString(list));
            System.out.println("--------------");

        }
    }

    private void merge(int[] list, int lo, int mid, int hi) {

        // create left part of the list
        int[] leftPart = new int[mid - lo + 2];

        for (int i = lo; i <= mid; i++) {
            leftPart[i - lo] = list[i];
        }

        leftPart[mid - lo + 1] = Integer.MAX_VALUE;

        // create right part of the list
        int[] rightPart = new int[hi - mid + 1];
        for (int i = mid + 1; i <= hi;i++) {
            rightPart[i - mid - 1] = list[i];
        }
        rightPart[hi - mid] = Integer.MAX_VALUE;

        // compare left and right
        int i = 0, j = 0;
        for (int k = lo; k <= hi; k++) {
            if (leftPart[i] <= rightPart[j]) {
                list[k] = leftPart[i];
                i++;
            } else {
                list[k] = rightPart[j];
                j++;
            }
        }
    }

}
