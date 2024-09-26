import java.util.ArrayList;

public class Main {
/* Funçao LAMBDA
 * formato: ()->{};
 * 
 *    O que são funções lambda?
 *
 *Imagine que você precise de uma pequena função para realizar uma 
 *tarefa específica dentro de um código maior. Em Java,
 *tradicionalmente, você criaria uma classe inteira para essa função.
 *As funções lambda vieram para simplificar esse processo, permitindo
 *você criar funções anônimas de forma mais concisa e diretamente 
 *no local onde elas são utilizadas.
 *
 *    Em resumo, uma função lambda é:
 *
 *Uma função anônima: Não tem um nome específico.
 *
 *Concisa: Possui uma sintaxe mais enxuta que uma função tradicional.
 *
 *Inline: É definida diretamente no local onde ela será utilizada.
 * 
 * */
	public static void main(String[] args) {
		
		ArrayList<Integer> valores = new ArrayList<>(); 
		ArrayList<Integer> dobro = new ArrayList<>(); 
		ArrayList<Integer> par = new ArrayList<>(); 
		ArrayList<Integer> impar = new ArrayList<>(); 
		
		valores.add(1);
		valores.add(2);
		valores.add(3);
		valores.add(4);
		valores.add(5);
		valores.add(6);
		
		
		valores.forEach(
			(v)->{
				dobro.add(v*2);
			}
		);
		
		
		System.out.println(valores);
		System.out.println(dobro);
		System.out.println(par);
		System.out.println(impar);
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
