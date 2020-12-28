import java.util.*;
/**
 * Class where the pivot choice is the median of the first, last and middle element
 *
 * @author Shakh Saidov and Ali Sultan
 */
public class QuickSorterPivotMedian<T> extends QuickSorter<T>{
    public <T extends Comparable<? super T>> int partitionM(T[] a, int fst, int lst){
        T pivot = a[fst];
            int u = fst;
            int d = lst;
            do {
                while ((u < lst) &&(pivot.compareTo(a[u]) >= 0)) {
                    u++;
                }
                while (pivot.compareTo(a[d]) < 0){
                    d--;
                }
                if (u < d) swap(a, u, d);
            } while (u < d);
            swap(a, fst, d);
            return d;
    }
    
    public <T extends Comparable<? super T>> int partition(T[] a, int fst, int lst){
        T middle = a[(fst + lst)/2];
        T pivot = median(a[fst], a[lst], middle);
        int index;
        
        if(a[fst].compareTo(pivot) == 0){
            index = fst;
        } else if(a[lst].compareTo(pivot) == 0){
            index = lst;
        } else{
            index = (fst + lst)/2;
        }
        
        swap(a, index, fst);
        return partitionM(a, fst, lst);
    }
    
    public <T extends Comparable<? super T>> T median(T a, T b, T c){
        if ((a.compareTo(b) < 0 && b.compareTo(c) < 0) || (c.compareTo(b) < 0 && b.compareTo(a) < 0)) {
            return b; 
        } else if ((b.compareTo(a) < 0 && a.compareTo(c) < 0) || (c.compareTo(a) < 0 && a.compareTo(b) < 0)) {
            return a; 
        } else {
            return c; 
        }
    } 
}
