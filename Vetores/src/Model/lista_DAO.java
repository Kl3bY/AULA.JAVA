
package Model;

import javax.swing.JOptionPane;


public class lista_DAO {
    
    
    public static void exer1(){
        int nn=0;
        double np=0;
        double [] vet = new double[10];
        
        for(int c=0; c < 10 ; c++){
          String x = JOptionPane.showInputDialog(null, " Digite o valor "+ (c+1));  
          vet[c]= Double.parseDouble(x);
          
          if(vet[c] < 0){
              nn++;
          }else{
              np = np + vet[c];
              
          }
          
          }
        
        JOptionPane.showMessageDialog(null, " A quantidade de negativos é "+ nn);
        JOptionPane.showMessageDialog(null, " A quantidade de negativos é "+ np);
          
        
        }
    
    public static void exer2(){
        
        int nn=0;
        double np=0;
        double [] vet = new double[5];
        
        for(int c=0; c < 5 ; c++){
          String x = JOptionPane.showInputDialog(null, " Digite o valor "+ (c+1));  
          vet[c]= Double.parseDouble(x);
          
          if(vet[c] >= 0){
            JOptionPane.showMessageDialog(null, " O número "+ vet + " é positivo");
          }
          
          }
        
    }
    
    public static void exer3(){

        double [] vet = new double[7];
        
        for(int c=0; c < 7 ; c++){
          String x = JOptionPane.showInputDialog(null, " Digite o valor "+ (c+1));  
          vet[c]= Double.parseDouble(x);
          
          if(vet[c] % 2 == 0 && vet[c] % 3 == 0){
            JOptionPane.showMessageDialog(null, " O número "+ vet[c] + " é multiplo de 2 e 3");
            
          }else if(vet[c] % 2 == 0){
            JOptionPane.showMessageDialog(null, " O número " + vet[c] + " é multiplo de 2");
            
          }else if(vet[c] % 3 == 0){
            JOptionPane.showMessageDialog(null, " O número " + vet[c] + " é multiplo de 3");
          }
          
          }
    }
}
