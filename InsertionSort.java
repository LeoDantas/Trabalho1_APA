package APA;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class InsertionSort {
    
    public void insercao(ArrayList<Alunos> aluno){
        int i,j,cont=0;
        long tempoInicial = System.currentTimeMillis();  
        for(j=1;j<aluno.size();j++){
            Alunos aux = aluno.get(j);
            int x = aluno.get(j).getMatricula(); 
             for(i=j-1; i>=0 &&  (aluno.get(i).getMatricula())> x; i--){
             aluno.set(i+1, aluno.get(i));
             cont++;
           }
           
           aluno.set(i+1,aux);
           
        }
        long tempoFinal = System.currentTimeMillis();  
        System.out.println("Trocas "+cont+" Tempo:"+(tempoFinal - tempoInicial) / 1000d);
    }
    
}
