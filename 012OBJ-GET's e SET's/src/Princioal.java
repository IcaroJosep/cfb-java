
public class Princioal {
/*metodos gets: servem para obter o valor de uma variavel
 *
 *metodos sets: servem para atribuir valores
 * */
	public static void main(String[] args) {
		Jogador j1 = new Jogador();
		
		j1.setLevel(2);
		j1.setVidas(10);
		System.out.printf(
		"o jogatodor é level %d  \ntem %d vidas",
		j1.getLevel(),
		j1.getVidas()
		);
		
		
	
	} 

}
