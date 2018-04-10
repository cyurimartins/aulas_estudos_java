package imc;
import java.util.*;
/**
 *
 * @author ymartins
 */
public class FaixaDePeso {
    
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Olá! " + nome + ", Tudo bem!? Informe sua idade: ");
        int idade = sc.nextInt();
        
        System.out.println("Informe seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Informe sua altura: ");
        double altura = sc.nextDouble();
        
        double imc = obtemIMC(peso, altura);
        System.out.println("--------------------------");
        System.out.println("DADOS DO USUARIO: ");
        System.out.println(nome + " o seu IMC é: " + imc);
        
        comparaIMC(imc);
    }
    
    public static double obtemIMC (double peso, double altura){
        double imc = peso / (altura*altura);
        return imc;
    }
    
    public static void comparaIMC(double imc){
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        }if (imc > 18.5 && imc <= 25) {
            System.out.println("Peso normal");
        }if (imc > 25 && imc <=30) {
            System.out.println("Acima do peso");
        }if (imc > 30) {
            System.out.println("Obesidade");
        }
    }
}
