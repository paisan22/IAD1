package nl.paisanrietbroek;

import nl.paisanrietbroek.graph.GraphCreator;
import nl.paisanrietbroek.hashtable.SearchTimeCalculator;
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

//        int[] array = generateRandomIntArray(10000);
//
//        new QuickSort(array); // from 10000000 quicksort get faster
//
//        new MergeSort(array);
//
//        int[] heapOrderdArray = {7, 90, 33, 45, 12, 10, 15, 18};
//        new HeapSort(heapOrderdArray);

//        SearchTimeCalculator searchTimeCalculator = new SearchTimeCalculator(100);
//        SearchTimeCalculator searchTimeCalculator1 = new SearchTimeCalculator(1000);
//        SearchTimeCalculator searchTimeCalculator2 = new SearchTimeCalculator(10000);
//        SearchTimeCalculator searchTimeCalculator3 = new SearchTimeCalculator(100000);
//
//        searchTimeCalculator.getSearchTime(searchTimeCalculator.getRandomKey());
//        searchTimeCalculator1.getSearchTime(searchTimeCalculator.getRandomKey());
//        searchTimeCalculator2.getSearchTime(searchTimeCalculator.getRandomKey());
//        searchTimeCalculator3.getSearchTime(searchTimeCalculator.getRandomKey());

        new GraphCreator();

    }

    private static int[] generateRandomIntArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size;i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}
