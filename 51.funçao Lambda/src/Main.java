import java.util.ArrayList;

public class Main {
/* Fun�ao LAMBDA
 * formato: ()->{};
 * 
 *    O que s�o fun��es lambda?
 *
 *Imagine que voc� precise de uma pequena fun��o para realizar uma 
 *tarefa espec�fica dentro de um c�digo maior. Em Java,
 *tradicionalmente, voc� criaria uma classe inteira para essa fun��o.
 *As fun��es lambda vieram para simplificar esse processo, permitindo
 *voc� criar fun��es an�nimas de forma mais concisa e diretamente 
 *no local onde elas s�o utilizadas.
 *
 *    Em resumo, uma fun��o lambda �:
 *
 *Uma fun��o an�nima: N�o tem um nome espec�fico.
 *
 *Concisa: Possui uma sintaxe mais enxuta que uma fun��o tradicional.
 *
 *Inline: � definida diretamente no local onde ela ser� utilizada.
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
