package nl.paisanrietbroek;

import nl.paisanrietbroek.heapsort.HeapSort;
import nl.paisanrietbroek.mergesort.MergeSort;
import nl.paisanrietbroek.quicksort.QuickSort;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        int[] array = generateRandomIntArray(10000);

        new QuickSort(array); // from 10000000 quicksort get faster

        new MergeSort(array);

        int[] heapOrderdArray = {7, 90, 33, 45, 12, 10, 15, 18};
        new HeapSort(heapOrderdArray);
    }

    private static int[] generateRandomIntArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size;i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}
