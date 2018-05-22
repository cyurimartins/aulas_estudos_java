package arvorebinaria;
import java.util.*;
/**
 *
 * @author ymartins
 */
public class ArvoreBinaria {

    //DEFININDO A CLASSE QUE REPRESENTARÁ CADA ELEMENTO DA ARVORE
    private static class arvore{
        public int num;
        public arvore dir, esq;
    }
    
    //DEFININDO A CLASSE QUE REPRESENTARÁ CADA ELEMENTO DA ARVORE BINARIA NA PILHA
    private static class pilha{
        public arvore num;
        public pilha prox;
    }
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        
        //ARVORE ESTA VAZIA, LOGO, O OBJETO RAIZ TEM VALOR NULL        
        arvore raiz = null;
        
        //O OBJETO AUX É UM OBJETO AUXILIAR
        arvore aux;
        
        //O OBJETO AUX1 É UM OBJETO AUXILIAR
        arvore aux1;
        
        //O OBJETO NOVO É UM OBJETO AUXILIAR
        arvore novo;
        
        //O OBJETO ANTERIOR É UM OBJETO AUXILIAR
        arvore anterior;
        
        //O OBJETO TOPO REPRESENTA O TOPO DA PILHA
        pilha topo;
        
        //O OBJETO AUX_PILHA É UM OBJETO AUXILIAR DA PILHA
        pilha aux_pilha;
        
        //APRESENTANDO O MENU DE OPÇÕES
        
        int op, achou, numero;
        
        do{
            System.out.println("\nMenu de Opcoes\n");
            System.out.println("1 - Inserir na arvore");
            System.out.println("2 - Consultar um nó da arvore");
            System.out.println("3 - Consultar toda a arvore em ordem");
            System.out.println("4 - Consultar toda a arvore em pre-ordem");
            System.out.println("5 - Consultar toda a arvore em pos-ordem");
            System.out.println("6 - Excluir um no da arvore");
            System.out.println("7 - Esvaziar a arvore");
            System.out.println("8 - Sair");
            
            System.out.print("Digite sua opcao: ");
            op = entrada.nextInt();
            
            if (op < 1 || op > 8){
                System.out.println("Opcao Invalida!");
            }
            
            if (op == 1){
                System.out.println("Digite o numero a ser inserido na arvore: ");
                
                novo = new arvore();
                novo.num = entrada.nextInt();
                novo.dir = null;
                novo.esq = null;
                
                if (raiz == null){
                    raiz = novo;
                }else{
                    aux = raiz;
                    achou = 0;
                    
                    while (achou == 0){
                        if (novo.num < aux.num){
                            if (aux.esq == null){
                                aux.esq = novo;
                                achou = 1;
                            }else {
                                aux = aux.esq;
                            }
                            
                        } else {
                            if (novo.num >= aux.num){
                                if (aux.dir == null){
                                    aux.dir = novo;
                                    achou = 1;
                                }
                                else{
                                    aux = aux.dir;
                                }
                            }
                        }
                    }
                    System.out.println("Numero inserido na arvore!");
                }
            } //FIM OPCAO 01
            
            while (op != 8);
        }
    } //FIM MAIN
    
}
