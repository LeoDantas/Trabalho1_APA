import java.util.Arrays;

/**
 *
 * @author Leonardo Dantas
 */
public class InsertionSort {
    
    public static void insercao(Comparable [ ] a){
        int i,j,cont=0;
        long tempoInicial = System.currentTimeMillis();  
        for(j=1;j<a.length;j++){
            Comparable aux = a[j];
            Comparable x = a[j]; 
             for(i=j-1; i>=0 && a[i].compareTo(x)>0; i--){
             a[i+1] = a[i];
             cont++;
           }
           
           a[i+1]=aux;
           
        }
        long tempoFinal = System.currentTimeMillis();  
        System.out.println("Trocas "+cont+" Tempo:"+(tempoFinal - tempoInicial) / 1000d);
    
    }

  
}  
    
