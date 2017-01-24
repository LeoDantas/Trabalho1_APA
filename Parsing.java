package APA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Leonardo Luiz do Nascimento Dantas Filho
 *Ultima Atualização: 24/01/2017
 *
 */
public class Parsing {
      int quantAluno,cont = 0;
       BufferedReader input;
       ArrayList<Alunos> list;
       String[] ar ;
       public Parsing(ArrayList<Alunos> aluno, int quantAluno){
           this.list= aluno;
           this.quantAluno = quantAluno;
       }
       
       public void run(){
         
            try{
                input = new BufferedReader(new FileReader("C:/Users/Dell/Documents/UFPB/APA/students.csv"));
                while(cont<quantAluno && input.ready()){
                    String tmp = input.readLine();
                    ar = tmp.split(",");
                    list.add(new Alunos(ar[0],Integer.parseInt(ar[1]),Integer.parseInt(ar[2])));
                    cont++;
                }

                input.close();
            }catch(IOException e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
       
       
       
    
 
}

