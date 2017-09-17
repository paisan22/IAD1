package nl.paisanrietbroek.quicksort;

import org.joda.time.LocalDateTime;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by paisanrietbroek on 13/09/2017.
 */
public class QuickSortTest {

    @Test
    public void testLessFunctionWithInteger() {

        int a = 4;
        int b = 6;

        boolean result = QuickSort.less(a, b);
        boolean result2 = QuickSort.less(b, a);

        assertTrue(result);
        assertFalse(result2);
    }

    @Test
    public void testLessFunctionWithCharacter() {

        char a = 'a';
        char b = 'b';

        boolean r1 = QuickSort.less(a, b);
        boolean r2 = QuickSort.less(b, a);

        assertTrue(r1);
        assertFalse(r2);
    }

    @Test
    public void testLessFunctionWithDateTime() {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime later = now.plusDays(3);

        boolean r1 = QuickSort.less(now, later);
        boolean r2 = QuickSort.less(later, now);

        assertTrue(r1);
        assertFalse(r2);
    }
}