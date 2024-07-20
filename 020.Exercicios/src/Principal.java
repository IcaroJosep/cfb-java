
public class Principal {

	public static void main(String[] args) {
		 Formiga f1 = new Formiga(10,15,20);
		 Aranha  a1 =new Aranha(30, 10, 20, 15);
		 Vegetal v1 = new Vegetal(5);
		 
		 f1.info();
		 a1.info();
		 v1.info();
		 
		 a1.atacar(f1);
		 
		 f1.info();
		 a1.info();
	
	
	
	}

}
