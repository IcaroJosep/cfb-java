import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(11);
		numeros.add(22);
		numeros.add(33);
		
		for(int e:numeros) {
			System.out.println(e);
		}
		
//////////////////////////////////////////////////////		
		System.out.println("\n");
//////////////////////////////////////////////////////
		
		ArrayList<String> nomes = new ArrayList<>();

		nomes.add("icaro");
		nomes.add("josep");
		nomes.add("carlos");
		
		for(String e:nomes) {
			System.out.println(e);
		}
/////////////////////////////////////////////////////
		System.out.println("");
/////////////////////////////////////////////////////	
		
	//incerindo em local especifico na lista
		nomes.add(1, "fabicio");/*ele é inceriodo na posicao 1
		 						  e empura todos uma casa para frente*/
		for(String e:nomes) {
			System.out.println(e);
		}
		
//////////////////////////////////////////////////////
System.out.println("\n");
//////////////////////////////////////////////////////
		
	//obter elemento
		System.out.print(nomes.get(0));//get com refereicia a posição
		
//////////////////////////////////////////////////////
System.out.println("\n");
//////////////////////////////////////////////////////

	//obtem posição da primeira ocorrencia
		System.out.print(nomes.indexOf("josep"));
		

//////////////////////////////////////////////////////
System.out.println("\n");
//////////////////////////////////////////////////////

	//remove elemento pela posicao ou elemento

		for(String e:nomes) {
			System.out.println(e);
		}
		System.out.println();
		//remove primeira ocorencia do elemento
		nomes.remove("josep"/*ou posicao 2*/);
		
		for(String e:nomes) {
			System.out.println(e);
		}
		System.out.println("nome apagado josep");


		
//////////////////////////////////////////////////////
System.out.println("\n");
//////////////////////////////////////////////////////
		
  	//elimanas as posicoes vazias
		nomes.trimToSize();	
			
//////////////////////////////////////////////////////
System.out.println("\n\n");
//////////////////////////////////////////////////////

	//linpar todo o array
		nomes.clear();//apaga o array
		for(String e:nomes) {
			System.out.println(e);
		}
		System.out.print("array nomes apagado");
	
	
	}
}
