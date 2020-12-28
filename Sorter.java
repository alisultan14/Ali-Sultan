import java.util.*;

/**
 * An interface of sorting algorithms
 * @author Shakh Saidov & Ali Sultan
 */

public interface Sorter{
    /**
     * Sort an array of comparable objects. 
     * @param  a  an array of comparable objects
     */ 
    public <T extends Comparable<? super T>> void sort (T[] a);
}
