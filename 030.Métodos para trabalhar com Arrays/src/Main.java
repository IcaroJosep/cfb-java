import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int [] num  = {9,5,0,7,4,2,6,3,1,8};
		
		
///////////////////////faz ordencao do array
		//Arrays.sort(num);
		
///////////////////////preenche com valor indicado
		//Arrays.fill(num,10);
		
///////////////////////copia um array para outro	
		//int[] num2=new int[10];
				/*(ary acer copiado , apartir da posicao ,
				 *  onde vai ser copiado ,posicao de inicio ,
				 *   quantos vao ser copiados)*/			
		//System.arraycopy(num, 0, num2, 0, num.length/*=10*/);
		//for(int n:num2) {
		//	System.out.printf(" %d",n);
		//}
		
//////////////////////compara dois arrays
	  /*int [] num1 = {10,5,5,7,4,2,7,3,1,8};
		int [] num3 = {9,5,0,7,4,2,6,3,1,8};
		int [] num4 = {90,5,10,7,4,2,65,3,1,8};
		int [] num5 = {97,5,0,7,4,2,6,3,10,84};
	  *//*Arrays.equals(num,num3);*/
		//System.out.printf("num igual a num3: %s",Arrays.equals(num, num3)?"sim":"nao");
		
//////////////////////verifica se um elemento esta na colecao
		 /*se ele encontrar o elemento ele retorna a posicao senao ele retorna negarivo*/
		/*OBS ARRAY PRECISA ESTAR ORDENADO*/
	  /*Arrays.sort(num);
		int pos =Arrays.binarySearch(num, 4);
		System.out.println(pos);
	  */	
		
		System.out.println("\n\n\n");
		
		for(int n:num) {
			System.out.printf(" %d",n);
		}
		

	}

}
