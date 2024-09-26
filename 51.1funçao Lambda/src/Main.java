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
		
		
		
/*No seu c�digo, voc� est� utilizando o m�todo forEach da classe ArrayList.
 *Esse m�todo aceita um argumento que � uma inst�ncia de uma interface funcional chamada
 *Consumer<T>. A interface Consumer<T> tem um �nico m�todo abstrato accept(T t),
 *que � exatamente o que uma express�o lambda pode implementar.


Aqui est� uma explica��o detalhada:

Interface Funcional Consumer<T>:
A interface Consumer<T> faz parte do pacote java.util.function e � uma interface
funcional porque tem apenas um m�todo abstrato: accept(T t).
A assinatura do m�todo � void accept(T t);.

Uso do forEach:
O m�todo forEach da classe ArrayList aceita um Consumer<T> como argumento.

No seu c�digo, a express�o lambda (v) -> { dobro.add(v * 2); }
� passada como argumento para o forEach.

Express�o Lambda:
A express�o lambda (v) -> { dobro.add(v * 2); } implementa o m�todo
accept da interface Consumer<Integer>.
Aqui, v � o par�metro que representa cada elemento da lista valores.

O corpo da lambda { dobro.add(v * 2); }
� executado para cada elemento v da lista valores.
Ent�o, o forEach usa a interface funcional Consumer<T> para aplicar 
a opera��o definida na express�o lambda a cada elemento da lista valores.

*/		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
