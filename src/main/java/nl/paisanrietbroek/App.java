package nl.paisanrietbroek;

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
        Integer[] intArray = {4,1,6,3,7,6,5};
        Character[] stringArray = {'d','g','x','t','a','c'};

        QuickSort quickSort = new QuickSort();
        quickSort.sort(intArray);
        quickSort.sort(stringArray);

        int[] intArray2 = {4,1,6,3,7,6,5, 8};
        new MergeSort().mergeSort(intArray2, 0, intArray2.length -1);
    }
}
