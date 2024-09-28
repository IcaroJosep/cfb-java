public class Main {
/* a lib math e uma biblioteca com algumas funoes matematica
 * 
 * */
	public static void main(String[] args) {
		//.min / retorna o menor entre 2
		int v1= Math.min(6, 5);
		System.out.println(v1);
		
		//.sqrt /retorna a rais quadrada
		double v2 = Math.sqrt(156);
		System.out.println(v2);
	
		//.abs /retorna valor absoluto
		double v3 =-5.16;
		System.out.println(Math.abs(v3));
		
		//.random // retorna umero aleatorio entre 0 e 1
		double v4 = Math.random()/**11*/;
		System.out.println(v4);
		
		//floor // reorna o inteiro mais proximo
		System.out.println(Math.floor(v4*11));
		
	
	}

}
