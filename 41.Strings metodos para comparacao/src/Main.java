
public class Main {

	public static void main(String[] args) {
		
		String s1="CFB Cursos - Curso de Java";
		System.out.println(s1+"\n\n");
		
//StartsWith e endsWith
		/*testao se uma string começa ou termina
		 * com determinado caractes 
		 * retornando valores booleanos*/
		/*permitem tbm o teste de sequencias*/
		System.out.printf("teste com StartsWith:\ncommeça letra C : %s \n\n",
						  s1.startsWith("CFB C"));
		System.out.printf("teste com endsWith:\ntermina letra a : %s \n\n",
						  s1.endsWith("va"));
		
//indexOf
		/*retorna o index do primeiro caracter 
		 * caso nao tenha o caracter retoprna -1*/
		System.out.printf("teste com indexOf:\no caracter \'u\' esta no index: %d\n\n",s1.indexOf("u"));
		
//substring
		/*retorna parte de uma string*/
		System.out.printf("texte com substring :\n%s\n\n",s1.substring(4,18));
		
		
//concat
		/*junta duas strings*/
		String s2=" - youtube";
		System.out.println("teste com concat:");
		System.out.println(s1.concat(s2));
		
	}

}
