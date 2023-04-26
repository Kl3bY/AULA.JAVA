
package Model;

import java.util.Random;
import javax.swing.JOptionPane;


public class JogoPPT_DAO {
    public static void Jogo(){
        int contc = 0, contp = 0, conte = 0;
        
        for(int p = 0 ; p < 5 ; p++){
        String opj = JOptionPane.showInputDialog(null, "Digite umas das opções: \n 1 - Pedra \n 2 - Papel \n 3 - Tesoura");
        switch(opj){
            case "1":
                opj = "Pedra";
                break;
            case "2":
                opj = "Papel";
                break;
            case "3":
                opj = "Tesoura";
                break;
            default:
                opj = "Escolha uma opção";
                break;
        }
        
        Random gerador = new Random();
        int op = gerador.nextInt(3)+1;
        String opc = Integer.toString(op);
        
        switch(opc){
            case "1":
                opc = "Pedra";
                break;
            case "2":
                opc = "Papel";
                break;
            case "3":
                opc = "Tesoura";
                break;
            default:
                opc = "Escolha uma opção";
                break;
        }
        
        if(opj == "Pedra" && opc == "Papel" || opj == "Papel" && opc == "Tesoura" || opj == "Tesoura" && opc == "Pedra"){
            JOptionPane.showMessageDialog(null, "jogador: " + opj + "\n maquina: " + opc + "\nO computador ganhou");
            contc++;
        }else if(opc == "Pedra" && opj == "Papel" || opc == "Papel" && opj == "Tesoura" || opc == "Tesoura" && opj == "Pedra"){
            JOptionPane.showMessageDialog(null, "jogador: " + opj + "\n maquina: " + opc + "\nO jogador ganhou");
            contp++;
        }else{
            JOptionPane.showMessageDialog(null, "jogador: " + opj + "\n maquina: " + opc + "\nO jogo deu empate");
            conte++;
        }
    
        }
        JOptionPane.showMessageDialog(null, "Partida finalizada \n O jogador fez: " + contp + "\n A maquina fez: " + contc);
}
}
