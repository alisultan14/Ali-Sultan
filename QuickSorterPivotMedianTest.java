import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class QuickSorterPivotMedianTest.
 *
 * @author  Shakh Saidov and Ali Sultan
 */
public class QuickSorterPivotMedianTest{
    @Test
    /**
     * Tests the quicksorter method with a median pivot
     */
    public void testQuickSortPivotMedian(){
        Integer arr1[] = {-62, 255, 36, 19, 250, 1245, 9, -16262};
        String arr2[] = {"a","j", "n", "l", "d", "p"};
        
        QuickSorterPivotMedian qSort = new QuickSorterPivotMedian();
        qSort.sort(arr1);
        qSort.sort(arr2);
        
        Integer arr3[] = {-16262, -62, 9, 19, 36, 250, 255, 1245};
        String arr4[] = {"a","d", "j", "l", "n", "p"};
        
        assertArrayEquals(arr1, arr3);
        assertArrayEquals(arr2, arr4);
    }
}
