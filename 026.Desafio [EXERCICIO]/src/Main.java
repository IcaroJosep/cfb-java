import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int acertos=0;
		Scanner in = new Scanner(System.in);
		char [] gabarito = {'a','b','a'};
		char[] resposta = new char[gabarito.length];
		String[] leitura = {"qual a estrela mais proxima ?\nA).sol \nB).venus \nC)cu\nD)bunda\n",
							"qual o objetivo do futibol?\nA)sai na mao\nB)fazer gol\nC)dribla\n",
							"vai se fude?\n A)\n"};
		
		for(int i=0;i<gabarito.length;i++){
			System.out.print(leitura[i]);
			resposta[i]=in.nextLine().charAt(0);
			if(resposta[i] == gabarito[i] ){
				acertos++;
			}
		}
		in.close();
		System.out.printf("vc acertou %d",acertos);
		
		
		
		
		
		
		
		
		
		

	}

}
