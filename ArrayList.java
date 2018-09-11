package biblioteca;

import java.util.ArrayList;

public class ArrayExemplo {
	
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList(); //nao pode tipo primitivo 
		nomes.add("Carlos"); //ADICIONANDO ELEMENTO DO TIPO STRING NO ARRAY
		nomes.add("Yuri");
		//nomes.remove(0); //REMOVER ELEMENTO POR INDEX OU OBJETO
		//nomes.clear(); //REMOVE TODAS AS POSICOES DO ARRAYLIST
		System.out.println(nomes.toString());
		
		System.out.println(nomes.get(1)); //ACESSANDO UM ELEMENTO ATRAVES DO INDEX E MOSTRANDO NO CONSOLE
		
		System.out.println(nomes.isEmpty()); //INFORMA SE O ARRAY ESTA VAZIO (BOOLEANO)
		
		System.out.println(nomes.contains("Yuri")); //INFORMA SE CONTEM O ITEM NO ARRAY (BOOLEANO)
		
		System.out.println(nomes.size()); //RETORNA O TAMANHO DO ARRAYLIST
		
		System.out.println(nomes.indexOf("Carlos")); //INFORMA A POSICAO DO ELEMENTO (BOOLEANO)



	}

}
