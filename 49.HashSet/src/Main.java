import java.util.*;

public class Main {
/*HashSet : esta colecao armazena valores unicos 
 * nao permite valores repetidos
 * 
 * obs : utilisa o hash para calcular a posicao na tabela 
 * ou seja a orde de incercao nao influenciana na posicao onde sera guardado
 * 
 * avendo dos valores na mesma posicao (colisao) serao introdusidos a um balde(array)
 * 
 * */
	public static void main(String[] args) {
		HashSet<String> carros = new HashSet<>();
		
			carros.add("HRV");
			carros.add("POLO");
			carros.add("GOLF");
			carros.add("CITY");
			carros.add("CRUZE");
		//.add / tem retorno boliano se ja ouver na lista ele nao add e retorna false
		System.out.printf("polo foi adicionado a colecao : %s\n",carros.add("POLO")?"sim":" nao ele nao ja existe na colecao");
		
		System.out.println(carros);
		
		System.out.println("\n================\n");
///////////////////////////////////////////////////////////		
		
		//.contains() /retorno boolianao / veriufica se esta na colecao
		System.out.println(carros.contains("POLO"));
		
		System.out.println("\n================\n");
///////////////////////////////////////////////////////////		
		
		//.remove  /remove da colecao
		System.out.println(carros.remove("POLO")?"removido":"nao existe");
		System.out.println(carros);
///////////////////////////////////////////////////////////		
		
		//apaga toda a colecao
		carros.clear();
		
		
		
	}

}
