
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
	public void setBlindado(int i) {
		this.blindagem=i;
	}
	public Boolean getArmado() {
		return armado;
	}
	public void setArmado(boolean i) {
		this.armado=i;
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
		System.out.println("\n-------------------------");
		System.out.printf("\nnome.........:%s",this.nome);
		System.out.printf("\nmotor esta...:%s",this.ligado?"ligado":"desligado");
		System.out.printf("\nnome.........:%s",this.destruido?"destruido":"funcionando");
		System.out.printf("\nbindagem.....:%d",this.blindagem);
		System.out.printf("\nmilitar......:%s",this.armado?"sim":"nao");
	}
}






























