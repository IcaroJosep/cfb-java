import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean fim=false;
		char[][] tabulero=new char[3][3];
		
		for (int i = 0; i < tabulero.length; i++) {
		    for (int j = 0; j < tabulero[i].length; j++) {
		    	tabulero[i][j] = '0';
		    }
		}
		
		inpTbulero(tabulero);
		
		
		Scanner in=new Scanner(System.in);
		int l,c;
		int vez=1;
		while(fim==false) {
			System.out.print("escolha a lina:");
			l=in.nextInt();
			System.out.print("\nescolha a coluna:");
			c=in.nextInt();
			if(vez%2==0) {
				crus(l,c,tabulero);
			}else {
				bola(l,c,tabulero);
			}
			inpTbulero(tabulero);
			fim=Fim(tabulero);
			vez++;
		}
		
		in.close();
		

	}
	//comparacoes incompletas... 
	//elas tbm comecao todas iguais oq causa o fim no primeiro loop
	public static boolean Fim(char[][]t) {
		
		if((t[0][0]==t[0][1])&&(t[0][0]==t[0][2])) {
		return true;	
		}
		
	return false;	
	}
	
	public static void bola(int l,int c,char[][]t) {
		t[l][c]='o';
	}
	public static void crus(int l,int c,char[][]t) {
		t[l][c]='x';
	}
	
	public static void inpTbulero(char[][]t) {
		for(char[] l:t) {
			for(char c:l) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}

}
