import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Queue<String> carro =new LinkedList<>();
		
//.add  / adiciona ha fila

		carro.add("a");
		carro.add("b");
		carro.add("c");
		carro.add("d");
		System.out.println(carro);
		
		     								System.out.println("\n===============");
//.poll //retira e retorna o elemento do topo
		
		System.out.printf("elemento retirado : %s\n",carro.poll());	
		System.out.println(carro);
											System.out.println("\n===============");

	}

}
