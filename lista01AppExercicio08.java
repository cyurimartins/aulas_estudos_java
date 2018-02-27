package entrada;

import java.util.Scanner; 
public class AppEntrada {

    public static void main(String[] args) {
           
        float pFab, pLucDist, pImp;        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Informe o preço de fábrica: ");
        pFab = entrada.nextFloat();
        
        System.out.print("Informe o percentual do distribuidor: ");
        pLucDist = entrada.nextFloat();
        
        System.out.print("Informe o percentual de imposto: ");
        pImp = entrada.nextFloat();    
       
        float lucDist = pFab * pLucDist / 100;
        float vImp = pFab * pImp / 100;
        float pFinal = pFab + lucDist + vImp;               
            
        System.out.println("Lucro Distribuidor: " + lucDist);
        System.out.println("Valor com imposto: " + vImp);
        System.out.println("Valor final do produto: " + pFinal);
    }
    
}
