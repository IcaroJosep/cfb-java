
public class Main {
/*
 * String é uma classe portanto possue metodos 
 *  
 * String é uma classe q comtem um array de caracteres 
 * */
	public static void main(String[] args) {
	
	char[] texto_c= {'c','u','r','s','o',' ','j','a','v','a'};	
	String texto_s=new String(texto_c);
	
	System.out.println(texto_s);
	
//tbm é possivel selecionar as pozicoes q se deseja pegar
	String c =new String(texto_c,0,5);
	System.out.println(c);
	
//metodos 
		
		//length retorna o tamanho da string
	
	int tam=texto_s.length();
	System.out.println(tam);
	
	
		//CharAt retorna o caracter na posicao
	char caracter=texto_s.charAt(2);
	System.out.println(caracter);
	
	
	    //getChars copia caracteres de uma string para outra
	//char[] gat =new char[10];
	char[] gat = {'*','*','*','*','*','*','*','*','*','*'};
	texto_s.getChars(6, 10, gat, 1);
	System.out.println(gat);
	
	
	
	
	
	}

}
