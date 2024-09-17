import java.util.ArrayList;
/*aviso obiserve a imagem dentro da pasta deste arquivo
* a foto mostrara as exexoes q podemos tratar expecificamente dentro do catch
**/
public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("icaro");//0
		nomes.add("jose");//1
		nomes.add("pedro");//2
		nomes.add("iago");//3
		
		System.out.println(nomes.get(3));
		
	//criando execao:
			/*a exeção abaixo ocorre pela tentativa 
			 * de acessar um elemento fora do array*/
		 /*nome da execao :java.lang.IndexOutOfBoundsException*/	
		
		try {
			System.out.println(nomes.get(9));
		} catch (IndexOutOfBoundsException/*Exception*/ e) {/*caso nao se saiba q tipo de execao
								  irá vir pode-se apena usar 
								  o "Exception e"*/
			System.out.println("\nErro:indice fora do array");
			System.out.println("Erro:"+e.getLocalizedMessage());

		}/*catch () {
			É POSIVEL TRATAR ERROS
			 ESPECIFICOS EM CASCATA
			
		}*/finally {
			/*ocorendo ou nao uma excecao
			 o bloco finali sera executado 
			
			bloco de inplementacao nao obrigatoria
			*/
			System.out.println("\nfim do try");

		}
		
		
			
	
	
	
	
	}

}
