/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APA;


import java.util.Random;


/**
 *
 * @author Leonardo Dantas
 */
public class QuickSort {
     
    public static long cont = 0;
    public static long Pivo_tempo = 0;
    public static long Tempo=0;
    
    private static void swap(int v[], int i, int j){  //Método para efetuar a troca de vetores
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
    
    
    public static int moda(int v[],int ini, int fim) { //Método para encontrar a moda do vetor e retornar o indice dessa moda
       int vezes = 0;
       int moda = ini;
       int compara = 0;
       
        for (int i=ini; i < fim; i++) {
            vezes = 0;
            for (int j=i+1;j < fim; j++) {
                if(v[i] == v[j]) {
                    vezes++;
                }
            }
        
        if(vezes > compara){
            moda = i;
            compara = vezes;
        }
       } 
        return moda;
    }   
    
  
      public static int mediana(int v[], int ini, int fim){//Método para encontrar a mediana de 5 vetores escolhidos
        int[] vet_valor = new int[5];                      //de forma aletoria e retornar o indice da mediana.
        int vet_indice[] = new int[5];
        int j;
    
                 
        
        for(int i = 0; i < vet_valor.length;i++){
            
            vet_indice[i] = (int)(Math.random()*(fim-ini)) + ini;
            vet_valor[i] = v[vet_indice[i]];
                          
           }
       
        for(j=1;j<vet_valor.length;j++){
            int aux = vet_valor[j];
           for(int i=j-1; i>=0 &&  vet_valor[i] > aux; i--){
             swap(vet_valor,i+1,i);
             swap(vet_indice,i+1,i);
             
           }
           
        }
       return vet_indice[(vet_valor.length+1)/2]; 
     
       }
      
 
      
    public static int pivo_ini(int v[], int ini, int fim){//Calculo do pivo no inicio
    long tempoInicial = System.nanoTime();
    int pivo, topo, i;
    pivo = v[ini];
    topo = ini;
        for (i = ini + 1; i <= fim; i++) {
            cont++;
            if (v[i] < pivo) {
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
    
    public static int pivo_fim(int v[], int ini, int fim){//Calculo do pivo no fim
    long tempoInicial = System.nanoTime();  
    int pivo, topo, i;
    pivo = v[fim];
    topo = fim;
        for (i = fim - 1; i >= ini; i--) {
            cont++;
            if (v[i] > pivo) {
                v[topo] = v[i];
                v[i] = v[topo - 1];
                topo--;
                
            }
        }
    v[topo] = pivo;
    long tempoFinal = System.nanoTime(); 
    Pivo_tempo = (tempoFinal - tempoInicial);
    return topo;
}
    public static int pivo_moda(int v[], int ini, int fim){//Calculo do pivo sendo a moda do vetor
    long tempoInicial = System.nanoTime();                 //Obs: após encontrar a moda iremos trocar o valor do pivo com 
    int pivo, topo, i ,indice, x;                          //com o primeiro valor do vetor, para assim efetuar o resto     
    indice = moda(v, ini,fim);                             //do calculo reaproveitando o algoritmo do pivo_ini.
    pivo = v[indice];                                      
    topo = ini;
    x = v[ini];
    v[ini] = v[indice];
    v[indice] = x;
      
        for (i = ini + 1; i <= fim; i++) {
            cont++;
            if (v[i] < pivo) {
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
 
    public static int pivo_mediana(int v[], int ini, int fim){//Calculo do pivo sendo a mediana de 5 vetores aletorios
    long tempoInicial = System.nanoTime();                   //Obs: após encontrar a moda iremos trocar o valor do pivo com  
    int pivo, topo, i ,indice, x;                             //com o primeiro valor do vetor, para assim efetuar o resto   
    indice = mediana(v, ini,fim);                             //do calculo reaproveitando o algoritmo do pivo_ini.
    pivo = v[indice];                                           
    topo = ini;
    x = v[ini];
    v[ini] = v[indice];
    v[indice] = x;
      
        for (i = ini + 1; i <= fim; i++) {
            cont++;
            if (v[i] < pivo) {
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
    
    public static int pivo_random(int v[],int ini, int fim){//Calculo do pivo a partir de um vetor random
        long tempoInicial = System.nanoTime();              //Obs: após encontrar a moda iremos trocar o valor do pivo com
        int pivo, topo, i ,indice, x;                       //com o primeiro valor do vetor, para assim efetuar o resto
        Random random = new Random();                       //do calculo reaproveitando o algoritmo do pivo_ini.  
	indice = ini + random.nextInt(fim - ini);           
        pivo = v[indice];
        topo = ini;
        x = v[ini];
        v[ini] = v[indice];
        v[indice] = x;
      
            for (i = ini + 1; i <= fim; i++) {
                cont++;
                if (v[i] < pivo) {
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
    
    public static void quick_sort(int v[],int ini,int fim){//Função para fazer a ordenação do vetor, a chamada do pivo pode
    long tempoInicial = System.currentTimeMillis();        //ser alterada.
    int meio;                                               
    if (ini < fim) {
        meio = pivo_ini(v, ini, fim);
        //meio = pivo_fim(v, ini, fim);
        //meio = pivo_moda(v, ini, fim);
        //meio = pivo_mediana(v,ini,fim);
        //meio = pivo_random(v,ini,fim);
        quick_sort(v, ini, meio-1);
        quick_sort(v, meio + 1, fim);
    }
    long tempoFinal = System.currentTimeMillis();  
    Tempo = (tempoFinal - tempoInicial);
}
    
    public static void main(String[] args){
        int x;
        long media_troq;
        long tempo = 0,tempoTotal = 0;
        int vetor[] = new int[1000];
        Random random = new Random();
        
        for(int i = 0; i<5000;i++){
        
            for(int j = 0; j<1000;j++){
                x = random.nextInt(1000);
                vetor[j] = x; 
            }
            
                 
            quick_sort(vetor,0,vetor.length -1);
            tempoTotal += Pivo_tempo;
            tempo += Tempo;
            
                  
        }
        
        
        media_troq = (cont/5000);
        /*Verifica se está ordenado
        for (int i = 0; i < vetor.length-1; i++){
        if(vetor[i]>vetor[i+1]) System.out.println("ERRO");
        }
        */
        
        System.out.println("Vetor Ordenado");
        for(int j = 0; j<1000;j++){
                System.out.println((vetor[j]));
            }
         
        System.out.println("Média de comparações: "+media_troq+"\nTempo do pivo: " + (tempoTotal/5000f)+"ns"+"\nTempo de execução: " + (tempo/5000f)+"ms");
        
        
         
        
        
    }   
    
}
