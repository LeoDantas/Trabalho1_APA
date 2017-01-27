import java.util.Arrays;

/**
 *
 * @author Leonardo Luiz do Nascimento Dantas Filho
 *Ultima atualização: 24/01/2017
 */
public class SelectionSort {
    
  public static void SSort(Comparable [ ] a){
      int i,j,min,cont=0;
      
      long tempoInicial = System.currentTimeMillis();   
      for(i = 0; i<a.length-1 ;i++){
          min=i;
          for(j=i+1;j < a.length;j++){
              if(a[j].compareTo(a[min]) <= 0){
                  min=j;
              }             
          }
        Comparable aux = a[min]; 
        a[min] =  a[i];
        a[i] = aux;
        cont++;
      }

   
  }

  }
