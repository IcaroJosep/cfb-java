
public class Principal {
	/*oq faz com q essa clase ser compreendida 
	  como a primeira a ser executada é q nela 
	  foi declarado o metodo com nome main em 
	  forma static.
	*/
	public static void main(String[] args) {
		/*	Instanciacao do obj
		 * 
		 * NEW: Ele q faz a instanciacao;
		 * 		é reponsavel por alocar o espaço 
		 * 		na heap(memoria dinamica) necesaria
		 * 		para o obj.	      
		 */
		Jogador j1 = new Jogador(1);
		Jogador j2 = new Jogador(2);
		Jogador j3 = new Jogador(3);
		
		
		
		
		j1=null;//mais proximo q vc pode chegar de desalocar a memoria do obj. 
	}

}
