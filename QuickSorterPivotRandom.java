import java.util.*;
/**
 * Class where the pivot choice is a random element in the array
 *
 * @author Shakh Saidov and Ali Sultan
 */
public class QuickSorterPivotRandom<T> extends QuickSorter<T>{
    public <T extends Comparable<? super T>> int partitionR(T[] a, int fst, int lst){
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
    
    /**
     * Partinioning Code 
     */
    public <T extends Comparable<? super T>> int partition(T[] a, int fst, int lst){
        Random random = new Random();
        int r = random.nextInt((lst - fst) + 1) + fst;
        swap(a, r, fst);
        return partitionR(a, fst, lst);
    }
}
