/*Entrada de dados via scanner

Podemos utilizar o scanner com o objetivo de solicitar ao usuário uma entrada de dados. Este componente faz parte da biblioteca Java.util e para sua utilização ele precisa ser importado. Pois é um objeto pertencente ao java, sintaxe básica.

Sintaxe basica: primitivo e sintaxe C. 

Scanner sc = new Scanner (System.in)

Biblioteca: java.util.scanner

Para acessar o componente: sc.
string: sc.next
inteiro: sc.nextint
double: sc.nextdouble*/

package entrada;

import java.util.*; 
public class AppEntrada {

    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            float av1, av2;            
            
            System.out.print("Informe a sua AV1: ");
            av1 = entrada.nextFloat();
            
            System.out.print("Informe a sua AV2: ");
            av2 = entrada.nextFloat();  
                    
                    
    }
    
}
