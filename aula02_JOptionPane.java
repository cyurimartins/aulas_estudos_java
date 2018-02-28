package entrada;

import javax.swing.JOptionPane; 
public class AppEntrada {

    public static void main(String[] args) {
        
        float pFab, pLucDist, pImp; 
        
        pFab = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço de fábrica: "));
        
        pLucDist = Float.parseFloat(JOptionPane.showInputDialog("Informe o percentual do distribuidor: "));
        
        pImp = Float.parseFloat(JOptionPane.showInputDialog("Informe o percentual de imposto: "));
        
        float lucDist = pFab * pLucDist / 100;
        float vImp = pFab * pImp / 100;
        float pFinal = pFab + lucDist + vImp; 
        
        JOptionPane.showMessageDialog(null,"Lucro Distribuidor: "  + lucDist + "\n" + "Lucro Distribuidor: " + vImp + "\n" + "Valor final do produto: " + pFinal);
    }
    
}
