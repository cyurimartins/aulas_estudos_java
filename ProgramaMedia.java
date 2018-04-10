package programamedia;

import java.util.Scanner;
/**
 *
 * @author ymartins
 */
public class ProgramaMedia {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.println("Informe a segunda nota: 10");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        
        System.out.println("Sua média foi: " + m);
        
        if (m < 7){
            System.out.println("Reprovado!");
        } else {
            System.out.println("Aprovado");
        }
    }
    
}
