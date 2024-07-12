
public class CarroCombate extends Carro {

	
	private static final int MAX_MUNICOES = 100;
	private static final int MIN_MUNICOES = 0;
	private int municoes;

	public CarroCombate(String nome,int blindagem) {
		super(nome);
		setArmado(true);
		setBlindado(blindagem);
		this.municoes=100;
	}
	
	public void setQtdeMunicoes(int qtdeMunicoes) {
		this.municoes=qtdeMunicoes;
		if(municoes>MAX_MUNICOES) {
			this.municoes=MAX_MUNICOES;
		}
		if(municoes<MIN_MUNICOES) {
			this.municoes=MIN_MUNICOES;
		}
	
	}
	
	public void atirat() {
		if(this.municoes>MIN_MUNICOES) { 
			setQtdeMunicoes(--municoes);
		}else {
			System.out.println("sem municao");
		}
	}
	
	public void info() {
		super.info();
		System.out.printf("\nmunicoes...:%d",municoes);
	}
	
}
