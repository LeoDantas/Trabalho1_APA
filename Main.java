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
	for(int k=0; k<n;k++){		
        System.out.println(a[k]);
	}	
        break;

       case 2:
        SelectionSort s = new SelectionSort();
        s.SSort(a);
        for(int k=0; k<n;k++){		
        System.out.println(a[k]);
	}
        break;

       case 3:
       	QuickSort q = new QuickSort();
       	q.quick_sort(a,0,(a.length-1));
       	for(int k=0; k<n;k++){		
        System.out.println(a[k]);
	}
       	break;

       	case 4:
       	MergeSort m = new MergeSort();
       	m.mergeSort(a);
       	for(int k=0; k<n;k++){		
        System.out.println(a[k]);
	}
       	break;

       	case 5:
       	HeapSort h = new HeapSort();
       	h.sort(a);
        for(int k=0; k<n;k++){		
        System.out.println(a[k]);
	}
       	break;

       	
    }


}	

}
