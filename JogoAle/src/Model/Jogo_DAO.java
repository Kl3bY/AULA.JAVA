
package Model;

import java.util.Random;
import javax.swing.JOptionPane;


public class Jogo_DAO {
    
    public static void jogo(){
        Random gerador = new Random();
        int [] vet = new int[10];
        int [] vetJ = new int[10];
        int cont = 0;
        String total = "";
        
        for(int c=0 ; c < 10 ; c++){
            
            vet[c] = gerador.nextInt(3);
            
            total = total + vet[c] + " ";
        }
        
        total = total + "\n\n";
        for(int j=0 ; j < 10 ; j++){
            
            String jogador = JOptionPane.showInputDialog(null, " Digite um número entre 0 e 2 ");
            vetJ[j] = Integer.parseInt(jogador);
            
            total = total + vetJ[j] + " ";
        }
        
        for(int r=0 ; r < 10 ; r++){
        
            if(vetJ[r] == vet[r]){
            cont++;
            }
        }
        total = total + "\n\n O total de pontos foi " + cont;
        JOptionPane.showMessageDialog(null,total);
    }
    
}
