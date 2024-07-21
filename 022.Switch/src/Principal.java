
public class Principal {

	public static void main(String[] args) {
		
		int posicao=2;
		
/*		if(posicao==1) {
			
		}else if(posicao==2) {
			
		}
*/
		switch (posicao) {
		case 1: case 10://exemplifica alinhamento de case
			System.out.printf("%s\n","medalha de ouro");
			break;
		case 2:
			System.out.printf("%s\n","medalha de prata");
			break;
		case 3:
			System.out.printf("%s\n","medalha de bronze");
			break;
		default:
			System.out.printf("%s\n","sem medalha");
			break;
		}
		
		
		
	}

}
