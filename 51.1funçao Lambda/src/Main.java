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
		
		
		
/*No seu código, você está utilizando o método forEach da classe ArrayList.
 *Esse método aceita um argumento que é uma instância de uma interface funcional chamada
 *Consumer<T>. A interface Consumer<T> tem um único método abstrato accept(T t),
 *que é exatamente o que uma expressão lambda pode implementar.


Aqui está uma explicação detalhada:

Interface Funcional Consumer<T>:
A interface Consumer<T> faz parte do pacote java.util.function e é uma interface
funcional porque tem apenas um método abstrato: accept(T t).
A assinatura do método é void accept(T t);.

Uso do forEach:
O método forEach da classe ArrayList aceita um Consumer<T> como argumento.

No seu código, a expressão lambda (v) -> { dobro.add(v * 2); }
é passada como argumento para o forEach.

Expressão Lambda:
A expressão lambda (v) -> { dobro.add(v * 2); } implementa o método
accept da interface Consumer<Integer>.
Aqui, v é o parâmetro que representa cada elemento da lista valores.

O corpo da lambda { dobro.add(v * 2); }
é executado para cada elemento v da lista valores.
Então, o forEach usa a interface funcional Consumer<T> para aplicar 
a operação definida na expressão lambda a cada elemento da lista valores.

*/		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
