package nl.paisanrietbroek.quicksort;

import org.joda.time.DateTime;

import java.util.Arrays;

/**
 * Created by paisanrietbroek on 13/09/2017.
 */
public class QuickSort {

    private int[] array;

    public QuickSort(int[] ints) {
        this.array = ints;

        DateTime now = DateTime.now();
        sort(array);
        DateTime after = DateTime.now();
        printArrayState(getDiffInMilis(now, after));

    }

    public static <T> void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private static <T> void sort(int[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        // assign pivot
        int j = partition(a, lo, hi);

        sort(a, lo, j -1); // Sort left part
        sort(a, j+1, hi); // Sort right part
    }

    private static <T> int partition(int[] a, int lo, int hi) {
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

    private static <T> void exch(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static<T> boolean less(T item, T i) {
        return ((Comparable)item).compareTo(i) < 0;
    }

    private void printArrayState(long diff) {
        System.out.println("Quicksort (n log n) execution time in milliseconds: " + diff + " with n=" + array.length);
//        System.out.println(Arrays.toString(array));
        System.out.println("----------------------------------------------------");
    }

    private long getDiffInMilis(DateTime now, DateTime after) {
        return after.getMillis() - now.getMillis();
    }
}
