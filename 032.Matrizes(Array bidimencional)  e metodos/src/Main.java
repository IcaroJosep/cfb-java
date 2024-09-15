import java.security.SecureRandom;

public class Main {

	public static void main(String[] args) {
		final int  linha=3;
		final int coluna=5;
				
		int [][] numeros = new int [linha][coluna];
		
		
		for(int l=0;l<linha;l++) {
			for(int c=0;c<coluna;c++) {
				numeros[l][c]= new SecureRandom().nextInt(100);
			}
		}
		
		
		
		
		for(int[] l:numeros) {
			for(int c:l) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
		
	}

}
