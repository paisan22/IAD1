package nl.paisanrietbroek.quicksort;

import java.util.Arrays;

/**
 * Created by paisanrietbroek on 13/09/2017.
 */
public class QuickSort {

    public static <T> void sort(T[] a) {

        sort(a, 0, a.length - 1);
        System.out.println("Array type: " + a.getClass());
        System.out.println("Result Quicksort: " + Arrays.toString(a));
        System.out.println("-----------------------------------------");
        System.out.println();
    }

    private static <T> void sort(T[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        // assign pivot
        int j = partition(a, lo, hi);

        sort(a, lo, j -1); // Sort left part
        sort(a, j+1, hi); // Sort right part
    }

    private static <T> int partition(T[] a, int lo, int hi) {
        int i = lo, j = hi+1;

        T item = a[lo];

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

    private static <T> void exch(T[] a, int i, int j) {
        T tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private static<T> boolean less(T item, T i) {
        return ((Comparable)item).compareTo(i) > 0;
    }
}
