
package Model;

import java.util.Random;
import javax.swing.JOptionPane;


public class ExemploRandom_DAO {
    
    public static void geraAle(){
    
        Random gerador = new Random();
        int [] vet = new int[3];
        
        for(int c = 0 ; c < 3 ; c++){
        
            vet[c] = gerador.nextInt(10);
        }
        
        JOptionPane.showMessageDialog(null , vet[0] + " | " + vet[1] + " | " + vet[2]);
    }
}
