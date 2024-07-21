
public class Principal {

	public static void main(String[] args) {

		int cont = 100;
////////////////////////////////////////////		
		for (int i = 0; i < 1; i++) {
			for (int i1 = 0; i1 < cont; i1++) {
				System.out.printf("%d - ", i1);
				if (i1 >= 10) {
					break;
				}
			}

			System.out.print("\nfim teste 1");
		}
////////////////////////////////////////////
		System.out.print("\n--------------------------------\n");

		for (int i = 0; i < 1; i++) {
			for (int i1 = 0; i1 < cont; i1++) {
				if (i1 >= 10 && i1 <= 60) {
					continue;//comtinue iguinora a interacao do lipe e pula para a proxima
							 //neste caso nao inprimira do 10 a 60
				}
				System.out.printf("%d - ", i1);
			}

			System.out.print("\nfim teste 2");
		}
//////////////////////////////////////////////	
		System.out.print("\n--------------------------------\n");

outerLoop: for (int i = 0; i < 5; i++) {
		    for (int j = 0; j < 3; j++) {
		        if (j == 2) {
		            break outerLoop; // Sai de todos os loops
		        }
		        System.out.println("i = " + i + ", j = " + j);
		    }
		}
		
		

	}
}
