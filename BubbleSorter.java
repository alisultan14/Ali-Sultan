import java.util.*;

/**
 * An implement of Bubble sort
 * 
 * @author Shakh Saidov & Ali Sultan 
 */
public class BubbleSorter<T> implements Sorter{
    /**
     * Sort an array of comparable objects using bubble sort. 
     * @param  a  an array of comparable objects
     */ 
    public <T extends Comparable<? super T>> void sort (T[] a) {
        int n = a.length;
        for (int i = 0; i< n - 1; i++) {
            for (int j = 0; j < n -1 - i; j++) {
                if (a[j+1].compareTo(a[j]) < 0) 
                {
                    T tmp = a[j]; 
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }
}
