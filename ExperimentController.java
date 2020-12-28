import java.util.*;
/**
 * Experiment Controller to compare the runtime taken between timeGetValue and timeGetValueInteger
 *
 * @author Shakh Saidov
 */
public class ExperimentController{
    public static void main(String[] arg){
        ExperimentController test = new ExperimentController();
        int[] items = {10000};
        int[] seeds = {24681,4534,643,5643,654};

        double time;
        for (Integer number : items) {
            // Averages out the runtimes using different seeds
            time = 0;
            for (int seed : seeds) {
                time += test.timeGetRandom(number, seed, 9);                //1 = bubble sort
                //2 = insertion sort
                //3 = selection sort
                //4 = merge sort
                //5 = quick sort FirstPivot
                //6 = quick sort MedianPivot
                //7 = quick sort Random Pivot
                //8 = JavaLibrary MergeSort
                //9 = Javalibrary QuickSort
            }
            double avgTime = time / seeds.length;
            System.out.println((int)number + ": " + avgTime);
            System.out.println();
        }
    }

    /**
     * Fills the list with random integers from 0-200. Gets the run-time of using getIndex(), with a random value between the range
     * @param int numberOfItems
     * @param int seed
     * @return Avg Runtime
     */
    public static double timeGetRandom(int numberOfItems, int seed, int sorter){
        Integer[] arr = new Integer[numberOfItems];
        Random random = new Random(seed);

        for(int i = 0; i < numberOfItems; i++){
            Integer element = random.nextInt(numberOfItems + 1);    //random element between 0 and 10,000
            arr[i] = element;
        }

        if(sorter == 1){            //does bubblesort
            BubbleSorter<Integer> bSort = new BubbleSorter();
            double StartTime = System.currentTimeMillis();
            bSort.sort(arr);
            double EndTime = System.currentTimeMillis();

            return (EndTime - StartTime);
        } else if(sorter == 2){     //does insertion sort
            InsertionSorter<Integer> iSort = new InsertionSorter();
            double StartTime = System.currentTimeMillis();
            iSort.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else if(sorter == 3){     //does selection sort
            SelectionSorter<Integer> sSort = new SelectionSorter();
            double StartTime = System.currentTimeMillis();
            sSort.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else if(sorter == 4){     //merge sort
            MergeSorter<Integer> mSort = new MergeSorter();
            double StartTime = System.currentTimeMillis();
            mSort.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else if(sorter == 5){     //quick sort with first pivot
            QuickSorterPivotFirst<Integer> qSort = new QuickSorterPivotFirst();
            double StartTime = System.currentTimeMillis();
            qSort.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else if(sorter == 6){     //quick sort with median pivot
            QuickSorterPivotMedian<Integer> qSort = new QuickSorterPivotMedian();
            double StartTime = System.currentTimeMillis();
            qSort.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else if(sorter == 7){     //quick sort with random pivot
            QuickSorterPivotRandom<Integer> qSort = new QuickSorterPivotRandom();
            double StartTime = System.currentTimeMillis();
            qSort.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else if(sorter == 8){                 //Java Library merge sort -> sort(Object[] a)
            double StartTime = System.currentTimeMillis();
            Arrays.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else{                     //Java Library quick sort -> sort(int[] a) 
            int[] arrNew = new int[numberOfItems];
            for(int i = 0; i < numberOfItems; i++){
                int element = random.nextInt(numberOfItems + 1);    //random element between 0 and 10,000
                arrNew[i] = element;
            }

            double StartTime = System.currentTimeMillis();
            Arrays.sort(arrNew);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        }
    }

    public static double timeGetReverse(int numberOfItems, int seed, int sorter){
        Integer[] arr = new Integer[numberOfItems];

        for(int i = 0; i < numberOfItems; i++){   
            arr[i] = numberOfItems - 1 - i;
        }

        if(sorter == 1){            //does bubblesort
            BubbleSorter<Integer> bSort = new BubbleSorter();
            double StartTime = System.currentTimeMillis();
            bSort.sort(arr);
            double EndTime = System.currentTimeMillis();

            return (EndTime - StartTime);
        } else if(sorter == 2){     //does insertion sort
            InsertionSorter<Integer> iSort = new InsertionSorter();
            double StartTime = System.currentTimeMillis();
            iSort.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else if(sorter == 3){     //does selection sort
            SelectionSorter<Integer> sSort = new SelectionSorter();
            double StartTime = System.currentTimeMillis();
            sSort.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else if(sorter == 4){     //merge sort
            MergeSorter<Integer> mSort = new MergeSorter();
            double StartTime = System.currentTimeMillis();
            mSort.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else if(sorter == 5){     //quick sort with first pivot
            QuickSorterPivotFirst<Integer> qSort = new QuickSorterPivotFirst();
            double StartTime = System.currentTimeMillis();
            qSort.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else if(sorter == 6){     //quick sort with median pivot
            QuickSorterPivotMedian<Integer> qSort = new QuickSorterPivotMedian();
            double StartTime = System.currentTimeMillis();
            qSort.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else if(sorter == 7){     //quick sort with random pivot
            QuickSorterPivotRandom<Integer> qSort = new QuickSorterPivotRandom();
            double StartTime = System.currentTimeMillis();
            qSort.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else if(sorter == 8){                 //Java Library merge sort -> sort(Object[] a)
            double StartTime = System.currentTimeMillis();
            Arrays.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else{                     //Java Library quick sort -> sort(int[] a) 
            int[] arrNew = new int[numberOfItems];
            for(int i = 0; i < numberOfItems; i++){  
                arrNew[i] = numberOfItems - 1 - i;
            }

            double StartTime = System.currentTimeMillis();
            Arrays.sort(arrNew);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        }
    }

    public static double timeGetAlmost(int numberOfItems, int seed, int sorter){
        Integer[] arr = new Integer[numberOfItems];
        Random random = new Random(seed);

        for(int i = 0; i < numberOfItems; i++){   
            arr[i] = i;
            if(i % 4 == 0){     
                arr[i] = random.nextInt(numberOfItems + 1);     //randomize every 4 element
            }
        }

        if(sorter == 1){            //does bubblesort
            BubbleSorter<Integer> bSort = new BubbleSorter();
            double StartTime = System.currentTimeMillis();
            bSort.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else if(sorter == 2){     //does insertion sort
            InsertionSorter<Integer> iSort = new InsertionSorter();
            double StartTime = System.currentTimeMillis();
            iSort.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else if(sorter == 3){     //does selection sort
            SelectionSorter<Integer> sSort = new SelectionSorter();
            double StartTime = System.currentTimeMillis();
            sSort.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else if(sorter == 4){     //merge sort
            MergeSorter<Integer> mSort = new MergeSorter();
            double StartTime = System.currentTimeMillis();
            mSort.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else if(sorter == 5){     //quick sort with first pivot
            QuickSorterPivotFirst<Integer> qSort = new QuickSorterPivotFirst();
            double StartTime = System.currentTimeMillis();
            qSort.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else if(sorter == 6){     //quick sort with median pivot
            QuickSorterPivotMedian<Integer> qSort = new QuickSorterPivotMedian();
            double StartTime = System.currentTimeMillis();
            qSort.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else if(sorter == 7){     //quick sort with random pivot
            QuickSorterPivotRandom<Integer> qSort = new QuickSorterPivotRandom();
            double StartTime = System.currentTimeMillis();
            qSort.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else if(sorter == 8){                 //Java Library merge sort -> sort(Object[] a)
            double StartTime = System.currentTimeMillis();
            Arrays.sort(arr);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        } else{                     //Java Library quick sort -> sort(int[] a) 
            int[] arrNew = new int[numberOfItems];

            for(int i = 0; i < numberOfItems; i++){   
                arrNew[i] = i;
                if(i % 4 == 0){     
                    arrNew[i] = random.nextInt(numberOfItems + 1);     //randomize every 4 element
                }
            }

            double StartTime = System.currentTimeMillis();
            Arrays.sort(arrNew);
            double EndTime = System.currentTimeMillis();
            return (EndTime - StartTime);
        }
    }
}
