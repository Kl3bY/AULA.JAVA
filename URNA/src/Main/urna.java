
package Main;

import java.util.Scanner;


public class urna {

    
    public static void main(String[] args) {
        //Luis Miguel Gonçalves Pinto, Caio Vitor Dos Anjos Ruas
        Scanner grava = new Scanner(System.in);
        
        int jose = 12 , maria = 34 , claudio = 23 , voto = 0;
        int op = 0 , contJ = 0 , contM = 0 , contC = 0 , senha=0;
    
        while(op != 4){
        System.out.println("Digite uma das opções \n 1 - ABRIR VOTAÇÃO \n 2 - TOTALIZAÇÃO E FINALIZAÇÃO DOS VOTOS \n 3 - ZERAR VOTOS DA URNA \n 4 - SAIR DA URNA");
        op = grava.nextInt();
        
     switch(op){
         case 1:
             do{
        System.out.println("Digite o candidato escolhido ou 0 para parar a votação: ");
        voto = grava.nextInt();
        
      switch(voto){
          case 12:
              contJ++;
              break;
          case 34:
              contM++;
              break;
          case 23:
              contC++;
              break;
          case 0:
              System.out.println("Votação Concluida com sucesso");
              break;
          default:
              System.out.println("Candidato inválido");
          
      }
      
      }while(voto != 0);
             System.out.println("Votação Encerrada");
             break;
         case 2:
            System.out.println("Digite a senha:");
                senha = grava.nextInt();
            if(senha == 1234){
         
             System.out.println("VOTAÇÃO ENCERRADA. A totalização de votos foi: \n" + contJ + " - Para Jose \n" + 
                 contM + " - Para Maria \n"
                + contC + " - Para Claudio");
            }else{
            System.out.println("Senha incorreta");
            }break;
         case 3:
             contJ = 0;
             contM = 0;
             contC = 0;
             System.out.println("votos da urna zerados");
              break;
              
         case 4:
             System.out.println("Saindo do sistema");
             break;
             
         default:
             System.out.println("Opção inválida");
             
     }
      
        
      } 
    }
    
}
