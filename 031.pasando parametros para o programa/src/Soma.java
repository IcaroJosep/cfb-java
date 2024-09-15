
public class Soma {
/*neste programa é passado parametros de entrada atraves 
 * do (String[] args) de fora para dentro do programa.
 * na execusao chamamos javac para compilar e java soma para rodar
 * na chamada de java soma passamos os parametro 
 * ex: java soma 1 2 3
 * que nos dara a soma */
	public static void main(String[] args) {
		
		int soma=0;
		if(args.length<=0) {
			System.out.print("sem valores");
			return ; 
		}
		for(String n:args) {
			soma+=Integer.valueOf(n);//aqui a a comvercao da da string
									//passada no parametro para int
									
			
		}
		System.out.printf("resultado : %d",soma);
		
	}

}
