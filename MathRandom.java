package diversos;

public class Sortear {
	
	public static void main(String[] args) {
		
		//RETORNA UM NUMERO 0.00000000001 ATÉ 0.9999999999		
		double r = Math.random();
		
		//RETORNAR UM NUMERO DE 0 ATE 9 		
		double r2 = Math.random()*10;
		
		//RETORNAR UM NUMERO INTEIRO DE 0 ATE 99, PRECISA CONVERTER PARA INT
		int i = (int)(Math.random()*100);	
		
		System.out.println(r);
		
		System.out.println(r2);
		
		System.out.println(i);		
		
	}
	
}
