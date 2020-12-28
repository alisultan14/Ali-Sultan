import java.util.*;
/**
 * An implement of Insertion sort
 *
 * @author Shakh Saidov & Ali Sultan
 */
public class InsertionSorter<T> implements Sorter{
    /**
     * Sort an array using insertion sort. 
     * @param  a  an array of comparable objects
     */ 
    public <T extends Comparable<? super T>> void sort (T[] a) {
        for (int nextPos = 1;nextPos < a.length;nextPos++) {
            insert(a, nextPos);
        }
    }
    
    /**
     * Sort an array using insertion sort. 
     * @param  a  an array of comparable objects
     * @param  nextPos      next index
     */ 
    public <T extends Comparable<? super T>> void insert (T[] a, int nextPos) {
        T nextVal = a[nextPos];
        while(nextPos > 0 &&nextVal.compareTo(a[nextPos-1]) < 0){
            a[nextPos] = a[nextPos-1];nextPos--;
        }
        a[nextPos] = nextVal;
    }
}
