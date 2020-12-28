import java.util.*;
/**
 * An implement of Merge sort
 *
 * @author Shakh Saidov & Ali Sultan
 */
public class MergeSorter<T> implements Sorter{
    /**
     * To correctly implement Sorter. Driver method 
     *
     * @param  a  an array of comparable objects
     */ 
    public <T extends Comparable<? super T>> void sort (T[] a) {
        sort(a, 0, a.length - 1);
    }
    
    /**
     * Sort an array using merge sort. 
     *
     * @param  a  an array of comparable objects
     * @param  start    first index of array
     * @param  end  last index of array
     */ 
    public static <T extends Comparable<? super T>> void sort (T[] a, int start, int end) {
        if (start >= end) return; 
        
        int half = (start+end) / 2; 
        sort(a, start, half);  
        sort(a, half+1, end);  
        merge(a, start, half, end); 
    }
    
    /**
    /**
     * Sort an array using merge sort. 
     *
     * @param  start    start index
     * @param  hald     half index
     * @param  end      last indx
     */ 
    public static <T extends Comparable<? super T>> void merge(T[] a, int start, int half, int end) { 
        T[] b = Arrays.copyOfRange(a, start, half+1); int i = 0;  // index in b 
        int j = half+1;  // index in second half of a
        int k = start;  // index in merged a
        while (i < b.length && j <= end ) {
            if (b[i].compareTo(a[j]) <= 0) {
                a[k++] = b[i++]; 
            } else {
                a[k++] = a[j++]; 
            }
        }
        while (i < b.length) {
            a[k++] = b[i++]; 
        }
    }
}
