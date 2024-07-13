
public class Veiculo {
	private String nome;
	private int tipo;
	
	protected Veiculo(String nome, int tipo) {
		 this.nome=nome;
		 this.tipo=tipo;
	}
	protected void info() {
		System.out.printf("nome:%s\n",this.nome);
		System.out.printf("Tipo:%d\n",this.tipo);
	}
	

}
