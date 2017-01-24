package APA;

import java.util.ArrayList;

/**
 *
 * @author Leonardo Luiz do Nascimento Dantas Filho
 *Ultima atualização: 24/01/2017
 */
public class SelectionSort {
    
  public void SSort(ArrayList<Alunos> aluno){
      int i,j,min,cont=0;
      
      long tempoInicial = System.currentTimeMillis();   
      for(i = 0; i<aluno.size()-1 ;i++){
          min=i;
          for(j=i+1;j<aluno.size();j++){
              if( aluno.get(j).getMatricula() <  aluno.get(min).getMatricula()){
                  min=j;
              }             
          }
        Alunos aux = aluno.get(min); 
        aluno.set(min, aluno.get(i));
        aluno.set(i, aux);
        cont++;
      }
      long tempoFinal = System.currentTimeMillis();  
      System.out.println("Trocas "+cont+" Tempo:"+(tempoFinal - tempoInicial) / 1000d);
  }
}
