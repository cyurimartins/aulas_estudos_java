package operadorternario;

/**
 *
 * @author ymartins
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, n3, n4, r, r2;
        n1 = 4;
        n2 = 8;
        n3 = 20;
        n4 = 16;
        
        //Operador Ternário
        r = (n1>n2)?0:1;
        
        r2 = (n3<n4)?n1+n2:n3+n4;
        
        System.out.println(r);
        
        System.out.println(r2);
    }
    
}
