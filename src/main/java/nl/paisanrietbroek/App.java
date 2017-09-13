package nl.paisanrietbroek;

import nl.paisanrietbroek.quicksort.QuickSort;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] array = {4,1,6,3,7,6,5};

        QuickSort quickSort = new QuickSort();
        quickSort.sort(array);
    }
}
