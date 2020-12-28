import java.util.*;
/**
 * Class where the pivot choice is the first element in the array
 *
 * @author Shakh Saidov and Ali Sultan
 */
public class QuickSorterPivotFirst<T> extends QuickSorter<T>{
    public <T extends Comparable<? super T>> int partition(T[] a, int fst, int lst){
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
}
