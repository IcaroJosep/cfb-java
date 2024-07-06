
public class Principal {
/*	quando se define um elemanto como estatico(static) 
 * ele é criado em uma posicao da memoria
 * e para todos os OBJ da classe ele estara na 
 * mesma posicao da memoria .
 * 
 * ou seja se eu alterar uma variavel statica todos 
 * os objs da clase terao o valor alterado
 * 
 * metodos e atributos static's:
 * nao precisao da instanciaçao da classe para serem chamados
 * 
 * 
 * */
	public static void main(String[] args) {
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		
	/* akiu vemos q mesmo o j1 sendo atribuido (icaro)
	 * pela variavel ser statica quando a atribuimos como
	 * (josep) na j2 alteramos junto a variavel em j1 .
	 * assim inprimeindo nome de j1 como josep. */	
		j1.nome="icaro";
		j2.nome="josep";
		
		System.out.print(j1.nome);
		
		
	}

}
