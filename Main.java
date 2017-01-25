import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Leonardo Dantas
 */


public class Main{

public static void main(String[] args) {
     int x;
     x = Integer.parseInt(args[0]);
   	
   	
   	    Scanner input = new Scanner(System.in);
		Integer a[] = new Integer[100];
		
		int n = input.nextInt();
		
		for(int i = 0; i < n; i++){
			a[i] = input.nextInt();
		}




	switch(x){
	   case 1:
		InsertionSort i = new InsertionSort();
        i.insercao(a);
        System.out.println(Arrays.toString(a));
        break;

       case 2:
        SelectionSort s = new SelectionSort();
        s.SSort(a);
        System.out.println(Arrays.toString(a));
        break;

       case 3:
       	QuickSort q = new QuickSort();
       	q.quick_sort(a,0,(a.length-1));
       	System.out.println(Arrays.toString(a));
       	break;

       	case 4:
       	MergeSort m = new MergeSort();
       	m.mergeSort(a);
       	System.out.println(Arrays.toString(a));
       	break;

       	case 5:
       	HeapSort h = new HeapSort();
       	h.sort(a);
       	System.out.println(Arrays.toString(a));
       	break;

       	
    }


}	

}
