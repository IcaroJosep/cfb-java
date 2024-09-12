
public class Main {

	public static void main(String[] args) {
		
//iteracao sobre String
		  /*String nome ="bruno";
			for(char c :nome.toCharArray()) {
				System.out.printf("%c",c);
			}*/
			
//passando array como parametros	
		int[] numeros= {10,15,14,2,8,7};
		
		parInpar(numeros);		 			
	 
	}
//funcao de definicao	
	public static void parInpar(int[] num) {
		for(int n:num ) {
			System.out.printf("o numero %d é %s",n,(n%2)==0?"par\n":"impar\n");
		}		
	}


}
