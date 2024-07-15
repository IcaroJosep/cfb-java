import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Numero n1 = new Numero();
		Numero n2 = new Numero();
		Numero res = new Numero();
		
		System.out.print("\ndigite o valor 1 : ");
		n1.setValor(scan.nextDouble());
		System.out.print("\ndigite o valor 2 : ");
		n2.setValor(scan.nextDouble());
		res.setValor(n1.getValor() + n2.getValor());
		System.out.printf("\nresultado : %.2f",res.getValor());
		scan.close();
	}

}
