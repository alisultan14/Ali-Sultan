//import libraries
import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args) {
        testBsortfile();
        testSsortfile();
        testIsortfile();
        testMsortfile();
        testQFirstsortfile();
        testQRandomsortfile();
        testQMediansortfile();
    }
    
    public static void testBsortfile(){
        Scanner sc;
        File fileinput=new File("Test1Input.txt") ;
        File fileoutput=new File("Test1OutputBubbleSort.txt") ;
      

        //try catch block
        try{
            sc = new Scanner(new FileReader(fileinput));
            fileoutput.createNewFile();
            PrintWriter myWriter=new PrintWriter(fileoutput); 
            //while loop for going through the input file line by line
            Integer arr[] = new Integer[999];
            for (int i =0; i<arr.length;i++){
                String s =  sc.nextLine();
                Integer a=Integer.valueOf(s);
                arr[i]=a;
            }
            
            BubbleSorter<Integer> bs = new BubbleSorter<Integer>();
            bs.sort(arr);
            
            for (int j=0; j<arr.length;j++){
                myWriter.print(arr[j]);
                myWriter.println();
            }
                
            myWriter.close();
        }
        //catch block to identify any exceptions that might occur
        catch(Exception e)
        {System.out.println(e);}
    }
    
    
    public static void testIsortfile(){
        Scanner sc;
        File fileinput=new File("Test1Input.txt") ;
        File fileoutput=new File("Test1OutputInsertionSort.txt") ;
      

        //try catch block
        try{
            sc = new Scanner(new FileReader(fileinput));
            fileoutput.createNewFile();
            PrintWriter myWriter=new PrintWriter(fileoutput); 
            //while loop for going through the input file line by line
            Integer arr[] = new Integer[999];
            for (int i =0; i<arr.length;i++){
                String s =  sc.nextLine();
                Integer a=Integer.valueOf(s);
                arr[i]=a;
            }
            
            InsertionSorter<Integer> is = new InsertionSorter<Integer>();
            is.sort(arr);
            
            for (int j=0; j<arr.length;j++){
                myWriter.print(arr[j]);
                myWriter.println();
            }
                
            myWriter.close();
        }
        //catch block to identify any exceptions that might occur
        catch(Exception e)
        {System.out.println(e);}
    }
    
    public static void testMsortfile(){
        Scanner sc;
        File fileinput=new File("Test1Input.txt") ;
        File fileoutput=new File("Test1OutputMergeSort.txt") ;
      

        //try catch block
        try{
            sc = new Scanner(new FileReader(fileinput));
            fileoutput.createNewFile();
            PrintWriter myWriter=new PrintWriter(fileoutput); 
            //while loop for going through the input file line by line
            Integer arr[] = new Integer[999];
            for (int i =0; i<arr.length;i++){
                String s =  sc.nextLine();
                Integer a=Integer.valueOf(s);
                arr[i]=a;
            }
            
            MergeSorter<Integer> ms = new MergeSorter<Integer>();
            ms.sort(arr);
            
            for (int j=0; j<arr.length;j++){
                myWriter.print(arr[j]);
                myWriter.println();
            }
                
            myWriter.close();
        }
        //catch block to identify any exceptions that might occur
        catch(Exception e)
        {System.out.println(e);}
    }
    
    public static void testSsortfile(){
        Scanner sc;
        File fileinput=new File("Test1Input.txt") ;
        File fileoutput=new File("Test1OutputSelectionSort.txt") ;
      

        //try catch block
        try{
            sc = new Scanner(new FileReader(fileinput));
            fileoutput.createNewFile();
            PrintWriter myWriter=new PrintWriter(fileoutput); 
            //while loop for going through the input file line by line
            Integer arr[] = new Integer[999];
            for (int i =0; i<arr.length;i++){
                String s =  sc.nextLine();
                Integer a=Integer.valueOf(s);
                arr[i]=a;
            }
            
            SelectionSorter<Integer> ss = new SelectionSorter<Integer>();
            ss.sort(arr);
            
            for (int j=0; j<arr.length;j++){
                myWriter.print(arr[j]);
                myWriter.println();
            }
                
            myWriter.close();
        }
        //catch block to identify any exceptions that might occur
        catch(Exception e)
        {System.out.println(e);}
    }
    
    public static void testQFirstsortfile(){
        Scanner sc;
        File fileinput=new File("Test1Input.txt") ;
        File fileoutput=new File("Test1OutputQuickSortFirst.txt") ;
      

        //try catch block
        try{
            sc = new Scanner(new FileReader(fileinput));
            fileoutput.createNewFile();
            PrintWriter myWriter=new PrintWriter(fileoutput); 
            //while loop for going through the input file line by line
            Integer arr[] = new Integer[999];
            for (int i =0; i<arr.length;i++){
                String s =  sc.nextLine();
                Integer a=Integer.valueOf(s);
                arr[i]=a;
            }
            
            QuickSorterPivotFirst<Integer> qs = new QuickSorterPivotFirst<Integer>();
            qs.sort(arr);
            
            for (int j=0; j<arr.length;j++){
                myWriter.print(arr[j]);
                myWriter.println();
            }
                
            myWriter.close();
        }
        //catch block to identify any exceptions that might occur
        catch(Exception e)
        {System.out.println(e);}
    }
    
    public static void testQRandomsortfile(){
        Scanner sc;
        File fileinput=new File("Test1Input.txt") ;
        File fileoutput=new File("Test1OutputQuickSortRandom.txt") ;
      

        //try catch block
        try{
            sc = new Scanner(new FileReader(fileinput));
            fileoutput.createNewFile();
            PrintWriter myWriter=new PrintWriter(fileoutput); 
            //while loop for going through the input file line by line
            Integer arr[] = new Integer[999];
            for (int i =0; i<arr.length;i++){
                String s =  sc.nextLine();
                Integer a=Integer.valueOf(s);
                arr[i]=a;
            }
            
            QuickSorterPivotRandom<Integer> qs = new QuickSorterPivotRandom<Integer>();
            qs.sort(arr);
            
            for (int j=0; j<arr.length;j++){
                myWriter.print(arr[j]);
                myWriter.println();
            }
                
            myWriter.close();
        }
        //catch block to identify any exceptions that might occur
        catch(Exception e)
        {System.out.println(e);}
    }

    public static void testQMediansortfile(){
        Scanner sc;
        File fileinput=new File("Test1Input.txt") ;
        File fileoutput=new File("Test1OutputQuickSortMedian.txt") ;
      

        //try catch block
        try{
            sc = new Scanner(new FileReader(fileinput));
            fileoutput.createNewFile();
            PrintWriter myWriter=new PrintWriter(fileoutput); 
            //while loop for going through the input file line by line
            Integer arr[] = new Integer[999];
            for (int i =0; i<arr.length;i++){
                String s =  sc.nextLine();
                Integer a=Integer.valueOf(s);
                arr[i]=a;
            }
            
            QuickSorterPivotMedian<Integer> qs = new QuickSorterPivotMedian<Integer>();
            qs.sort(arr);
            
            for (int j=0; j<arr.length;j++){
                myWriter.print(arr[j]);
                myWriter.println();
            }
                
            myWriter.close();
        }
        //catch block to identify any exceptions that might occur
        catch(Exception e)
        {System.out.println(e);}
    }
    
}