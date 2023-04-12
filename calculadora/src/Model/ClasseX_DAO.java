
package Model;

import javax.swing.JOptionPane;



public class ClasseX_DAO {
 
    public static void soma(){
          
    String num1 = JOptionPane.showInputDialog(null, "Digite o 1º valor");
    double val1 = Double.parseDouble(num1);
    
    String num2 = JOptionPane.showInputDialog(null, "Digite o 2º valor");
    double val2 = Double.parseDouble(num2);
    
    
        double res = val1 + val2;
        
    JOptionPane.showMessageDialog(null, "resultado: " + val1 + " + " + val2 + " = " + res , "" , 1);
    }
    
    public static void mult(){
        String num1 = JOptionPane.showInputDialog(null, "Digite o 1º valor");
        double val1 = Double.parseDouble(num1);
    
        String num2 = JOptionPane.showInputDialog(null, "Digite o 2º valor");
        double val2 = Double.parseDouble(num2);
    
    
        double res = val1 * val2;
        
    JOptionPane.showMessageDialog(null, "resultado: " + val1 + " * " + val2 + " = " + res , "" , 1);
    
    }
    public static void div(){
        String num1 = JOptionPane.showInputDialog(null, "Digite o 1º valor");
        double val1 = Double.parseDouble(num1);
    
        String num2 = JOptionPane.showInputDialog(null, "Digite o 2º valor");
        double val2 = Double.parseDouble(num2);
    
    if(val2 != 0){
        double res = val1 / val2;
        JOptionPane.showMessageDialog(null, "resultado: " + val1 + " / " + val2 + " = " + String.format("%.2f" , res) , "" , 1);
    }
    else if(val2 == 0){
    JOptionPane.showMessageDialog(null, "CÁLCULO INVÁLIDO");
    }   
    }
    
    public static void sub(){
        String num1 = JOptionPane.showInputDialog(null, "Digite o 1º valor");
        double val1 = Double.parseDouble(num1);
    
        String num2 = JOptionPane.showInputDialog(null, "Digite o 2º valor");
        double val2 = Double.parseDouble(num2);
    
    
        double res = val1 - val2;
        
    JOptionPane.showMessageDialog(null, "resultado: " + val1 + " - " + val2 + " = " + res , "" , 1);
    }
    
    
    }


