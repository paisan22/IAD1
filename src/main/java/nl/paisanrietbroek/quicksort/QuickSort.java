package nl.paisanrietbroek.quicksort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by paisanrietbroek on 13/09/2017.
 */
public class QuickSort {

    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
        System.out.println("Result Quicksort: " + Arrays.toString(a));
    }

    private static void sort(int[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        // assign pivot
        int j = partition(a, lo, hi);

        sort(a, lo, j -1); // Sort left part
        sort(a, j+1, hi); // Sort right part
    }

    private static int partition(int[] a, int lo, int hi) {
        int i = lo, j = hi+1;

        int item = a[lo];

        while (true) {
            while (less(a[++i], item)) {
                if (i == hi) {
                    break;
                }
            }
            while (less(item, a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exch(a, i,j);
        }
        exch(a, lo, j);
        return j;
    }

    private static void exch(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private static boolean less(int item, int i) {
        return item < i;
    }

}
