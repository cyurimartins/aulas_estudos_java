package entrada;

import java.util.*; 
public class AppEntrada {

    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            float salario, aumento, novoSalario;            
            
            System.out.print("Informe o seu salário: ");
            salario = entrada.nextFloat();
            
            System.out.print("Informe o seu salário: ");
            aumento = entrada.nextFloat();         
                                 
            // novoSalario = salario + (aumento/100 + salario);
                    
            System.out.println("O novo salario do funcionário é: " + novoSalario);
    }
    
}
