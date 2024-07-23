
public class Principal {
/* Nesta aula foi feito um array comtendo objetos 
 * da clase carro.
 * */
	
	public static void main(String[] args) {
		Carro[] carros =new Carro[5];
	
//inicializacao	
	
	/*	carros[0] = new Carro("camaro");
		carros[1] = new Carro("golf");
		carros[2] = new Carro("celta");
		carros[3] = new Carro("kombi");
		carros[4] = new Carro("lander");
	*/
		String[] modelosCarros = {"camaro","golf","celta","kombi","lander"};
		
		for(int i=0;i<carros.length;i++) {
			carros[i]=new Carro(modelosCarros[i]);
		}
	
//FIM INICIALIZACAO		
	
		
//ITERACAO	
		for(Carro i:carros) {
			i.setLigado(true);
			i.info();
		}
	
/*		for(int i=0;i<carros.length;i++) {
			carros[i].info();
		}
*/		
	}


}
