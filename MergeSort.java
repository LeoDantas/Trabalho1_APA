
import java.util.Arrays;
/**
 *
 * @author Leo Dantas
 */
public class MergeSort {

    public static void mergeSort(Comparable [ ] a)
    {
        Comparable[] tmp = new Comparable[a.length];
        mergeSort(a, tmp,  0,  a.length - 1);
    }


    private static void mergeSort(Comparable [ ] a, Comparable [ ] tmp, int ini, int fim) { // ini < fim? Se não, array está ordenado 
        if (ini < fim) {
            // Obtém índice de elemento central 
            int meio = ini + (fim - ini) / 2;
            // Ordena o lado esquerdo do array 
            mergeSort(a,tmp,ini, meio); 
            // Ordena o lado direito do array 
            mergeSort(a,tmp,meio + 1, fim); 
            // Combina os lados 
            merge(a,tmp,ini, meio+1, fim);
        }
    }



    private static void merge(Comparable[ ] a, Comparable[ ] tmp, int ini, int meio, int fim )
    {
        int iniEnd = meio - 1;
        int k = ini;
        int num = fim - ini + 1;

        while(ini <= iniEnd && meio <= fim)
            if(a[ini].compareTo(a[meio]) <= 0)
                tmp[k++] = a[ini++];
            else
                tmp[k++] = a[meio++];

        while(ini <= iniEnd)    // Copy rest of first half
            tmp[k++] = a[ini++];

        while(meio <= fim)  // Copy rest of right half
            tmp[k++] = a[meio++];

        // Copy tmp back
        for(int i = 0; i < num; i++, fim--)
            a[fim] = tmp[fim];
    }
    public static void main(String[] args) {
        Integer[] a = {2, 6, 3, 5, 1,0,1};
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }
    
}


