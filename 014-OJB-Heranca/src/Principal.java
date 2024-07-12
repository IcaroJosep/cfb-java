public class Principal {

	public static void main(String[] args) {
		/*Carro c1 = new Carro("golf");
		c1.info();
		*/
		CarroCombate c2 = new CarroCombate("t-40", 100);
		c2.info();
		c2.atirat();
		c2.sofrerDano(20);
		c2.info();
		
	}

}