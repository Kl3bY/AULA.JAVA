
package Model;

import javax.swing.JOptionPane;


public class Tela_DAO {
    
    
     public static void solicitaoperacao(){
     
     String opcao = JOptionPane.showInputDialog(null, "Digite a operação \n 1 - Adição \n 2 - Multipicação \n 3 - Divisão \n 4 - Subtração");
     double op = Double.parseDouble(opcao);
     
     if(op == 1){
     Model.ClasseX_DAO.soma();
     }
     else if(op == 2){
     Model.ClasseX_DAO.mult();
     }
     else if(op == 3){
     Model.ClasseX_DAO.div();
     }
     else if(op == 4){
     Model.ClasseX_DAO.sub();
     }
     else{
     JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA !!!");
     }
     }
    
}
