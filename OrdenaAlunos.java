package APA;

/**
 *
 * @author Leonardo Luiz do Nascimento Dantas Filho
 *Ultima atualização: 24/01/2017
 */
public class OrdenaAlunos{
        public static void main(String[] args){
         ArrayList<Alunos> aluno = new ArrayList<Alunos>();

         Parsing p = new Parsing(aluno,1000);//quantidade de instâncias a serem lidas
         p.run();
         /*
         for(Alunos a : aluno){

         System.out.println("Matricula:"+a.getMatricula()+"\nNome:"+a.getNome()+"\nIngresso:"+a.getNascimento() );

     }
         */

         

         
         SelectionSort s = new SelectionSort();
         InsertionSort i = new InsertionSort();
        

        
         s.SSort(aluno);
         i.insercao(aluno);
        
        
        

         //System.out.println(aluno.size());


         for(Alunos a : aluno){

         System.out.println("Matricula:"+a.getMatricula()+"\nNome:"+a.getNome()+"\nNascimento:"+a.getNascimento() );

     }  

    
   }

    
   
     
   
}


