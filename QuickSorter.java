import java.util.*;
/**
 * Abstract class QuickSorter with the common quicksort components
 *
 * @author Shakh Saidov & Ali Sultan
 */
public abstract class QuickSorter<T> implements Sorter{
    /**
     * Sort an array of comparable objects using quick sort. 
     * @param  a  an array of comparable objects
     */ 
    public <T extends Comparable<? super T>> void sort(T[] a) {
        qSort(a, 0, a.length-1);
    }
    
    public <T extends Comparable<? super T>> void qSort (T[] a, int fst, int lst) {
        if (fst < lst) {
            int pivIndex = partition(a, fst, lst);
            qSort(a, fst, pivIndex - 1);
            qSort(a, pivIndex + 1, lst);
        }
    }
    
    public abstract <T extends Comparable<? super T>> int partition(T[] a, int fst, int lst);
    
    public <T extends Comparable<? super T>> void swap(T[] a, int index1, int index2){
        T temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
