import java.util.ArrayList;

import java.util.Iterator;

public class Main {
/*Iterator é um elemento presente na maioria das colecoes
 *serve para iterar (percorrer) sobre a colecao 
 *
 *obs: ele tem o comportamento parecidocom um ponteiro
 * */
	public static void main(String[] args) {
		ArrayList<String> carros = new ArrayList<>();
		
		carros.add("HRV");
		carros.add("POLO");
		carros.add("GOLF");
		carros.add("CITY");
		carros.add("CRUZE");
		
		System.out.println(carros.iterator());
		
		//atribuicao do iteraitor d colecao ao iteraitor it
		Iterator<String> it = carros.iterator(); 
		
		//.next procimo elemento
/*		System.out.println(it.next());
		
		
		System.out.println("\n==========\n");
		
		//.hasNext / tem um procimo elemento / boliano

		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("\n==========\n");
*/		
		//.remove
		
		while(it.hasNext()){
			String c =it.next();
			if(c =="CITY") {
				it.remove();
			}
			
		}
		
		System.out.println(carros);
		
		
		
		
		
		
	}

}
