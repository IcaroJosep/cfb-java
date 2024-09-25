import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Stack<String> carro = new Stack<>();
		
//.push() incere no topo da pilha
		carro.push("a");
		carro.push("b");
		carro.push("c");
		carro.push("d");
		System.out.print(carro);/*tbm pode ser iterado elemento a elemento utilisando if*/		
		
		
																			System.out.println("\n\n====================");
//.peek() retorna o topo da pilha
		System.out.printf("\nElemento no topo : %s",carro.peek());
		
																			System.out.println("\n\n====================");
//.pop() retira o elemeto do topo (tbm retorna o elemento) 
		System.out.printf("\nElemento retirado : %s",carro.pop());
		System.out.printf("\nElemento no topo : %s",carro.peek());
		
																			System.out.println("\n\n====================");
//.empty() / tem retorno booleano ,verifica se a pilha esta vazia 
		   
		System.out.printf("a pilha esta vazia ?: %s",carro.empty()?"sim":"nao");
														
																			System.out.println("\n\n====================");
//.clear(); / esvazia a pilha		
	    carro.clear();
	    System.out.printf("a pilha esta vazia ?: %s",carro.empty()?"sim":"nao");
	
	
	}	

}
