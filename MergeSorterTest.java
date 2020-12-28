
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MergeSorterTest.
 *
 * @author  Shakh Saidov and Ali Sultan
 */
public class MergeSorterTest{
    @Test
    /**
     * Tests the bubblesort method
     */
    public void testMergeSort(){
        Integer arr1[] = {6,8,5,23,1425,-12,36,0,621};
        String arr2[] = {"a","j", "n", "l", "d", "p"};

        MergeSorter mSort = new MergeSorter();
        mSort.sort(arr1);
        mSort.sort(arr2);

        Integer arr3[] = {-12,0,5,6,8,23,36,621,1425};
        String arr4[] = {"a","d", "j", "l", "n", "p"};

        assertArrayEquals(arr1, arr3);
        assertArrayEquals(arr2, arr4);
    }
}
