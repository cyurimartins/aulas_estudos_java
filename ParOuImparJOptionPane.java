package parimpar;
import javax.swing.JOptionPane;
/**
 *
 * @author ymartins
 */
public class ParImpar {
    public static void main (String[] args){
        int num;
        float resultado;
                
        num = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero: "));
               
        resultado = num % 2; 
        
        if ( resultado == 0){
           JOptionPane.showMessageDialog(null, "Numero Par");
        } else {
            JOptionPane.showMessageDialog(null, "Numero Impar");
        }
    }  
    
}
