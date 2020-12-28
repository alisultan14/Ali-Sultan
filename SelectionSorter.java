import java.util.*;

/**
 * An implement of Selection sort
 * 
 * @author Shakh Saidov & Ali Sultan
 */
public class SelectionSorter<T> implements Sorter{
    /**
     * Sort an array using selection sort. 
     * @param  a  an array of comparable objects
     */ 
    public <T extends Comparable<? super T>> void sort (T[] a) {
        int n = a.length;
        for (int fill = 0; fill < n-1; fill++) {
            int posMin = fill;
            for (int nxt = fill+1; nxt < n; nxt++)
                if (a[nxt].compareTo(a[posMin])<0) posMin = nxt;
            T tmp = a[fill];
            a[fill] = a[posMin];
            a[posMin] = tmp;
        }
    }
}
