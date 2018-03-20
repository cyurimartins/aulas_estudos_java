package operadoresarit;

public class OperadoresArit {
   
    public static void main(String[] args) {
        
    //Valor absoluto
        int v1 = -10;
        int ar = (int) Math.abs(v1);
        System.out.println(ar);
    //Arredondamento para baixo
        float v = 8.9f;
        int ar1 = (int) Math.floor(v);
        System.out.println(ar1);
        
    //Arredondamento para cima
        int ar2 = (int) Math.ceil(v);
        System.out.println(ar2);
        
    //Arredondamento Aritmetico
        float v2 = 5.6f;
        int ar3 = (int) Math.round(v2);
        System.out.println(ar3);
    }
    
}
