
import java.nio.file.*;//inporte necesario

public class Main {
	/*começando por diretorios e arquivos*/
	
	public static void main(String[] args) {
		
	//atribuicao de diretorio
		Path diretorio = Paths.get("C:/Users/icaro/Documents/pastaTexte");
		
		//Files.isDirectory() verifica existencia
		//Verifica se é um diretorio retornando valor booliano
		System.out.printf("diretorio existe: %s"	   
				,Files.isDirectory(diretorio)?"sim":"nao");

System.out.println("\n\n==========================================================");
		//atribuicao de variavel
		Path arquivo = Paths.get("C:/Users/icaro/Documents/pastaTexte/texto.txt");
		
		//exists(arquivo) verifica existencia
		//Verifica se é um Arquivo retornando valor booliano
		System.out.printf("\narquivo existe: %s"
				,Files.exists(arquivo)?"sim":"nao"
		);
	
	
	}

}
