import java.util.Random;
import java.util.Arrays;


/**
 *
 * @author Leonardo Dantas
 */
public class QuickSort {
     
    public static long cont = 0;
    public static long Pivo_tempo = 0;
    public static long Tempo=0;
    
    private static void swap(Comparable v[], int i, int j){  //Método para efetuar a troca de vetores
        Comparable aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
      
 
      
    public static int pivo_ini(Comparable v[], int ini, int fim){//Calculo do pivo no inicio
    long tempoInicial = System.nanoTime();
    Comparable pivo;
    int topo, i;
    pivo = v[ini];
    topo = ini;
        for (i = ini + 1; i <= fim; i++) {
            cont++;
            if (v[i].compareTo(pivo)<0) {
                v[topo] = v[i];
                v[i] = v[topo + 1];
                topo++;
                          
            }
        }
    v[topo] = pivo;
    long tempoFinal = System.nanoTime(); 
    Pivo_tempo = (tempoFinal - tempoInicial);
    return topo;
}
    

    
    public static void quick_sort(Comparable v[],int ini,int fim){//Função para fazer a ordenação do vetor, a chamada do pivo pode
    long tempoInicial = System.currentTimeMillis();        //ser alterada.
    int meio;                                               
    if (ini < fim) {
        meio = pivo_ini(v, ini, fim);
        //meio = pivo_fim(v, ini, fim);
        //meio = pivo_random(v,ini,fim);
        quick_sort(v, ini, meio-1);
        quick_sort(v, meio + 1, fim);
    }
    long tempoFinal = System.currentTimeMillis();  
    Tempo = (tempoFinal - tempoInicial);
   
}
    
    
    
}
