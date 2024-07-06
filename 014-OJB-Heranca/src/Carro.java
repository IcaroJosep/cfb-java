
public class Carro {
	private	String nome;
	private Boolean ligado;
	private Boolean destruido;
	private int blindagem ;
	private Boolean armado;
	
	Carro(String nome){
		this.nome=nome;
		this.ligado=false;
		this.destruido=false;
		this.blindagem=0;
		this.armado=false;
	}

	public Boolean getLigado() {
		return ligado;
	}

	public void setLigado(Boolean ligado) {
		this.ligado = ligado;
	}

	public String getNome() {
		return nome;
	}

	public Boolean getDestruido() {
		return destruido;
	}

	public int getBlindagem() {
		return blindagem;
	}

	public Boolean getArmado() {
		return armado;
	}
	
	public void sofrerDano(int dano) {
		this.blindagem-=dano;
		if(this.blindagem<=0) {
			this.blindagem=0;
			this.ligado=false;
			this.destruido=true;
		}
	}
	
	public void info() {
		System.out.println("-------------------------");
		System.out.printf("nome.........:%s",this.nome);
		System.out.printf("nome.........:%s",this.ligado);
		System.out.printf("nome.........:%s",this.destruido);
		System.out.printf("nome.........:%s",this.blindagem);
		System.out.printf("nome.........:%s",this.armado);
	}
}






























