import arq1.Veiculo;
/*Protected pode ser acesado por classes filhas ou por classes no msm pacote*/
public class Principal {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo();
		
		Carro c1= new Carro("sagfge");
		  System.out.printf(c1.gatNome());

		
		
		/*v1.nome="asd";
		  System.out.printf(v1.nome);
		*/
	
	}

}
