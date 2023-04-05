
package Main;

import javax.swing.JOptionPane;


public class imc {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null , "CALCULADORA DE IMC");
        
        String p = JOptionPane.showInputDialog(null," Digite seu peso: ");
        double peso = Double.parseDouble(p);
        
        String a = JOptionPane.showInputDialog(null," Digite sua altura: ");
        double altura = Double.parseDouble(a);
        
        
        double imc = peso / (altura * altura);
        
        if(imc < 18.5){
            JOptionPane.showMessageDialog(null , "seu icm foi: " + String.format("%.2f" , imc) + "\n Você está abaixo do peso normal." , "" , 2);
        }
        else if(imc <= 24.9){
            JOptionPane.showMessageDialog(null , "seu icm foi: " + String.format("%.2f" , imc) + "\n Você está no peso normal.");
        }
        else if(imc <= 29.9){
            JOptionPane.showMessageDialog(null , "seu icm foi: " + String.format("%.2f" , imc) + "\n Você está com excesso de peso.");
        }
        else if(imc <= 34.9){
            JOptionPane.showMessageDialog(null , "seu icm foi: " + String.format("%.2f" , imc) + "\n Você está com Obesidade classe I." , "" , 2);
        }
        else if(imc <= 39.9){
            JOptionPane.showMessageDialog(null , "seu icm foi: " + String.format("%.2f" , imc) + "\\n Você está com Obesidade classe II." , "" , 2);
        }
        else if(imc >= 40.0){
            JOptionPane.showMessageDialog(null , "seu icm foi: " + String.format("%.2f" , imc) + "\n Você está com Obesidade classe III." , "" , 2);
        }
    }
    
}
