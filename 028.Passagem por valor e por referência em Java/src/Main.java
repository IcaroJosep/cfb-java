
public class Main {
// toda passagem � por valor com execao de arrays 

/* em java por nao ter smart pints como c++ 
nao � possivel passar uma referencia de uma variavel comun	
*/
	public static void main(String[] args) {
	
		
		int[] notas = {80,100,50,48,18,60,40,64,74};
		int ap=0 ,rp=0;
		
		comferiNota(notas, ap, rp);
		
	/*aqui abaixo notamos q mesmo os laores sendo pasados na funcao nao � 
	 * a alteracao deles pos fois feito uma copia deles para a funcao 
	 * nao uma referencia */
		System.out.printf("\n\nalunos reprovado %d\nalunos aprovados %d",ap,rp);
	////////////////////////////////////////////////////////////////////////	
		
		int [] resultado={0,0};
		
		comferiNota2(notas, resultado);
		System.out.printf("\n\nalunos reprovado %d\nalunos aprovados %d",resultado[0],resultado[1]);

		System.out.printf("\n%d",notas[0]);

		
		
	}
	public static void comferiNota(int[] nt,int a,int r ) {
		for(int n:nt) {
			if(n>60) {
				a++;
			}else {
				r++;
			}
		}
		System.out.printf("alunos reprovado %d\nalunos aprovados %d",r,a);

	}
	
	public static void comferiNota2(int[] nt,int[] r  ) {
		for(int n:nt) {
			if(n>60) {
				r[0]++;
			}else {
				r[1]++;
			}
		}
		nt[0]=101;
		
	}
	

}
